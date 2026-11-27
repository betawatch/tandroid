// default package

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.util.LruCache;
import android.util.SparseArray;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.OpenAttachedMenuBotReceiver;
import org.telegram.messenger.OpenChatReceiver;
import org.telegram.messenger.ShortcutResultReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ls6 extends rf0 {
    public static final Pattern U1 = Pattern.compile("\\*\\*(.+?)\\*\\*");
    public static final Pattern V1 = Pattern.compile("__(.+?)__");
    public static final Pattern W1 = Pattern.compile("\\|\\|(.+?)\\|\\|");
    public static final Pattern X1 = Pattern.compile("~~(.+?)~~");
    public static final String Y1 = "org.telegram.messenger.SHORTCUT_SHARE";
    public static volatile ls6[] Z1 = new ls6[4];
    public static final Object[] a2 = new Object[4];
    public static Paint b2;
    public static Paint c2;
    public static RectF d2;
    public static Path e2;
    public static final boolean f2;
    public static final vk6 g2;
    public static final Pattern h2;
    public final wm9 A0;
    public final HashMap A1;
    public final ArrayList B0;
    public final zh6 B1;
    public final ArrayList C0;
    public final HashMap C1;
    public boolean D0;
    public final HashSet D1;
    public TLRPC.TL_help_premiumPromo E;
    public final long[] E0;
    public boolean E1;
    public boolean F;
    public final ArrayList[] F0;
    public final ArrayList F1;
    public int G;
    public final Long[] G0;
    public final ArrayList G1;
    public final ArrayList[] H;
    public final boolean[] H0;
    public final ArrayList H1;
    public final zh6[] I;
    public final boolean[] I0;
    public boolean I1;
    public final zh6 J;
    public final HashSet J0;
    public boolean J1;
    public final zh6 K;
    public boolean K0;
    public boolean K1;
    public final ArrayList L;
    public final HashMap L0;
    public boolean L1;
    public final ArrayList M;
    public int M0;
    public TLRPC.TL_emojiList M1;
    public final zh6 N;
    public int N0;
    public TLRPC.TL_emojiList N1;
    public final ConcurrentHashMap O;
    public long O0;
    public TLRPC.TL_emojiList O1;
    public TLRPC.TL_messages_stickerSet P;
    public long P0;
    public TLRPC.TL_emojiList P1;
    public TLRPC.TL_messages_stickerSet Q;
    public long Q0;
    public boolean Q1;
    public final HashMap R;
    public w49 R0;
    public final zh6 R1;
    public final zh6 S;
    public int S0;
    public final HashMap S1;
    public final HashSet T;
    public int T0;
    public final LruCache T1;
    public final zh6 U;
    public TLRPC.User U0;
    public final Runnable[] V;
    public TLRPC.Chat V0;
    public final boolean[] W;
    public int W0;
    public final boolean[] X;
    public final int[] X0;
    public final long[] Y;
    public final boolean[] Y0;
    public final int[] Z;
    public final ArrayList Z0;
    public long a;
    public final HashMap a0;
    public final ArrayList a1;
    public TLRPC.TL_attachMenuBots b;
    public final HashMap b0;
    public ArrayList b1;
    public boolean c;
    public final int[] c0;
    public final SparseArray[] c1;
    public boolean d;
    public zh6 d0;
    public final ArrayList d1;
    public int e;
    public HashMap e0;
    public String e1;
    public int f;
    public HashMap f0;
    public int f1;
    public final ArrayList[] g0;
    public boolean g1;
    public final ArrayList h;
    public final boolean[] h0;
    public boolean h1;
    public final boolean[] i0;
    public boolean i1;
    public ArrayList j0;
    public ArrayList j1;
    public boolean k0;
    public ArrayList k1;
    public boolean l0;
    public ArrayList l1;
    public boolean m0;
    public ArrayList m1;
    public final ArrayList n;
    public boolean n0;
    public boolean n1;
    public boolean o0;
    public boolean o1;
    public boolean p0;
    public final HashMap p1;
    public final long[] q0;
    public final zh6 q1;
    public final HashMap r;
    public final int[] r0;
    public final zh6 r1;
    public String s;
    public boolean s0;
    public SharedPreferences s1;
    public final ArrayList[] t0;
    public final zh6 t1;
    public final zh6[] u0;
    public final zh6 u1;
    public final ArrayList[] v0;
    public final zh6 v1;
    public boolean w;
    public final ArrayList[] w0;
    public final SharedPreferences w1;
    public int x;
    public final boolean[] x0;
    public boolean x1;
    public boolean y;
    public final boolean[] y0;
    public final HashMap y1;
    public TLRPC.Document z0;
    public final zh6 z1;

    static {
        for (int i = 0; i < 4; i++) {
            a2[i] = new Object();
        }
        f2 = true;
        g2 = new vk6((byte) 8);
        h2 = Pattern.compile("(?<![A-Za-z0-9_+/=:-])(?:-?[0-9]{1,10}:[0-9a-fA-F]{64}|[A-Za-z0-9_+/-]{48})(?![A-Za-z0-9_+/=:-])");
    }

    public ls6(int i) {
        super(i);
        SharedPreferences k;
        String key;
        long longValue;
        SerializedData serializedData;
        boolean z;
        this.b = new TLRPC.TL_attachMenuBots();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new HashMap();
        boolean z2 = false;
        byte b = 1;
        this.H = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(0), new ArrayList(), new ArrayList(), new ArrayList()};
        this.I = new zh6[]{new zh6(), new zh6(), new zh6(), new zh6(), new zh6(), new zh6()};
        this.J = new zh6();
        this.K = new zh6();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new zh6();
        this.O = new ConcurrentHashMap(100, 1.0f, 1);
        this.P = null;
        this.Q = null;
        this.R = new HashMap();
        this.S = new zh6();
        this.T = new HashSet();
        this.U = new zh6();
        this.V = new Runnable[7];
        this.W = new boolean[7];
        this.X = new boolean[7];
        this.Y = new long[7];
        this.Z = new int[7];
        this.a0 = new HashMap();
        this.b0 = new HashMap();
        this.c0 = new int[7];
        this.d0 = new zh6();
        this.e0 = new HashMap();
        this.f0 = new HashMap();
        this.g0 = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
        byte b3 = 9;
        this.h0 = new boolean[9];
        this.i0 = new boolean[9];
        this.j0 = new ArrayList();
        this.q0 = new long[2];
        this.r0 = new int[2];
        this.t0 = new ArrayList[]{new ArrayList(), new ArrayList()};
        this.u0 = new zh6[]{new zh6(), new zh6()};
        this.v0 = new ArrayList[]{new ArrayList(), new ArrayList()};
        this.w0 = new ArrayList[]{new ArrayList(), new ArrayList()};
        this.x0 = new boolean[2];
        this.y0 = new boolean[2];
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.E0 = new long[4];
        this.F0 = new ArrayList[4];
        this.G0 = new Long[4];
        this.H0 = new boolean[4];
        this.I0 = new boolean[4];
        this.J0 = new HashSet();
        this.L0 = new HashMap();
        this.X0 = new int[]{0, 0};
        this.Y0 = new boolean[]{false, false};
        this.Z0 = new ArrayList();
        this.a1 = new ArrayList();
        this.b1 = new ArrayList();
        this.c1 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.d1 = new ArrayList();
        this.j1 = new ArrayList();
        this.k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.m1 = new ArrayList();
        this.p1 = new HashMap();
        this.q1 = new zh6();
        this.r1 = new zh6();
        this.t1 = new zh6();
        this.u1 = new zh6();
        this.v1 = new zh6();
        this.y1 = new HashMap();
        this.z1 = new zh6();
        this.A1 = new HashMap();
        this.B1 = new zh6();
        this.C1 = new HashMap();
        this.D1 = new HashSet();
        this.E1 = false;
        this.F1 = new ArrayList();
        this.G1 = new ArrayList();
        this.H1 = new ArrayList();
        this.Q1 = false;
        this.R1 = new zh6();
        this.S1 = new HashMap();
        this.T1 = new LruCache(25);
        if (this.currentAccount == 0) {
            k = a.b.getSharedPreferences("drafts", 0);
            this.w1 = k;
        } else {
            k = bp1.k(new StringBuilder("drafts"), this.currentAccount, a.b, 0);
            this.w1 = k;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : k.getAll().entrySet()) {
            try {
                key = entry.getKey();
                longValue = Utilities.A(key).longValue();
                serializedData = new SerializedData(Utilities.v((String) entry.getValue()));
            } catch (Exception unused) {
            }
            if (key.startsWith("r_")) {
                z = false;
            } else {
                z = key.startsWith("rt_");
                if (!z) {
                    TLRPC.DraftMessage TLdeserialize = TLRPC.DraftMessage.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    if (TLdeserialize != null) {
                        zh6 zh6Var = (zh6) this.u1.f(longValue);
                        if (zh6Var == null) {
                            zh6Var = new zh6();
                            this.u1.k(longValue, zh6Var);
                        }
                        zh6Var.k(key.startsWith("t_") ? Utilities.A(key.substring(key.lastIndexOf(95) + 1)).longValue() : 0L, TLdeserialize);
                    }
                    serializedData.cleanup();
                }
            }
            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            if (TLdeserialize2 != null) {
                TLdeserialize2.readAttachPath(serializedData, getUserConfig().n);
                zh6 zh6Var2 = (zh6) this.v1.f(longValue);
                if (zh6Var2 == null) {
                    zh6Var2 = new zh6();
                    this.v1.k(longValue, zh6Var2);
                }
                zh6Var2.k(z ? Utilities.z(key.substring(key.lastIndexOf(95) + 1)).intValue() : 0, TLdeserialize2);
                if (TLdeserialize2.reply_to != null) {
                    arrayList.add(TLdeserialize2);
                }
            }
            serializedData.cleanup();
        }
        if (!arrayList.isEmpty()) {
            getMessagesStorage().a.c(new ar6(this, arrayList, b));
        }
        d1("tg_placeholders_android", false, true);
        SharedPreferences k2 = bp1.k(new StringBuilder("emojithemes_config_"), this.currentAccount, a.b, 0);
        int i2 = k2.getInt("count", 0);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new ne2(ez3.b(this.currentAccount)));
        for (int i3 = 0; i3 < i2; i3++) {
            SerializedData serializedData2 = new SerializedData(Utilities.v(k2.getString("theme_" + i3, "")));
            try {
                ez3 c = ez3.c(this.currentAccount, TLRPC.Theme.TLdeserialize(serializedData2, serializedData2.readInt32(true), true));
                if (c.f.size() >= 4) {
                    arrayList2.add(new ne2(c));
                }
                af2.s.c(new xs4(this, arrayList2, z2, b3));
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        W0(false);
        H0(false);
        H0(true);
        this.A0 = new wm9(this.currentAccount);
        this.e = getMessagesController().Y3.getInt("menuBotsUpdateDate", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A(int i, ArrayList arrayList, boolean z) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i2);
                int i3 = messageEntity.offset;
                if (z) {
                    if (i3 >= i) {
                        continue;
                    }
                    if (i3 + messageEntity.length <= i) {
                        return true;
                    }
                } else {
                    if (i3 > i) {
                        continue;
                    }
                    if (i3 + messageEntity.length <= i) {
                    }
                }
            }
        }
        return false;
    }

    public static boolean A0(TL_aicompose.inputAiComposeStyle inputaicomposestyle) {
        if (inputaicomposestyle != null) {
            return inputaicomposestyle.tone == null && TextUtils.isEmpty(inputaicomposestyle.to_lang) && !inputaicomposestyle.emojify;
        }
        return true;
    }

    public static boolean B0(int i, long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            String n = qu6.n(j, i == 0 ? "sdid_" : "bdid_");
            List k = mka.k(a.b);
            for (int i2 = 0; i2 < k.size(); i2++) {
                if (((hka) k.get(i2)).b.equals(n)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static CharacterStyle L(CharacterStyle characterStyle, rmb rmbVar, rmb rmbVar2, boolean z) {
        rmb rmbVar3 = new rmb(rmbVar);
        if (rmbVar2 != null) {
            if (z) {
                rmbVar3.c(rmbVar2);
            } else {
                rmbVar3.a = rmbVar2.a;
                rmbVar3.d = rmbVar2.d;
            }
        }
        if (characterStyle instanceof smb) {
            return new smb(rmbVar3, 0);
        }
        if (characterStyle instanceof h8c) {
            return new h8c(((h8c) characterStyle).getURL(), rmbVar3);
        }
        return null;
    }

    public static boolean M(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i);
            TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList2.get(i);
            if (messageEntity.getClass() != messageEntity2.getClass() || messageEntity.offset != messageEntity2.offset || messageEntity.length != messageEntity2.length || !TextUtils.equals(messageEntity.url, messageEntity2.url) || !TextUtils.equals(messageEntity.language, messageEntity2.language) || (((messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) && ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id != ((TLRPC.TL_inputMessageEntityMentionName) messageEntity2).user_id) || (((messageEntity instanceof TLRPC.TL_messageEntityMentionName) && ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id != ((TLRPC.TL_messageEntityMentionName) messageEntity2).user_id) || ((messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) && ((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id != ((TLRPC.TL_messageEntityCustomEmoji) messageEntity2).document_id)))) {
                return false;
            }
        }
        return true;
    }

    public static void N1(ArrayList arrayList) {
        int i = 0;
        while (i < arrayList.size()) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
            if (message == null || (message instanceof TLRPC.TL_messageEmpty) || (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
    }

    public static ArrayList V0(SharedPreferences sharedPreferences) {
        int i = sharedPreferences.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i);
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                SerializedData serializedData = new SerializedData(Utilities.v(sharedPreferences.getString("object_" + i2, "")));
                try {
                    arrayList.add(TLRPC.Reaction.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
            }
        }
        return arrayList;
    }

    public static void V1(SharedPreferences sharedPreferences, long j, ArrayList arrayList) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", arrayList.size());
        edit.putLong("hash", j);
        for (int i = 0; i < arrayList.size(); i++) {
            TLObject tLObject = (TLObject) arrayList.get(i);
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            edit.putString("object_" + i, Utilities.f(serializedData.toByteArray()));
        }
        edit.apply();
    }

    public static void a(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        if (arrayList != null) {
            Spannable spannable = (Spannable) charSequence;
            for (hm hmVar : (hm[]) spannable.getSpans(0, spannable.length(), hm.class)) {
                if (hmVar != null) {
                    spannable.removeSpan(hmVar);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i);
                if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                    int i2 = messageEntity.offset;
                    int i3 = messageEntity.length + i2;
                    if (i2 < i3 && i3 <= spannable.length()) {
                        spannable.setSpan(tL_messageEntityCustomEmoji.document != null ? new hm(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new hm(tL_messageEntityCustomEmoji.document_id, fontMetricsInt), i2, i3, 33);
                    }
                }
            }
        }
    }

    public static TLRPC.TL_inputStickerSetID b0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return null;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.id = stickerSet.id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        return tL_inputStickerSetID;
    }

    public static TLRPC.TL_inputStickerSetItem c0(TLRPC.Document document, String str) {
        TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_inputStickerSetItem.document = tL_inputDocument;
        tL_inputDocument.id = document.id;
        tL_inputDocument.access_hash = document.access_hash;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputStickerSetItem.emoji = str;
        return tL_inputStickerSetItem;
    }

    public static ls6 d0(int i) {
        ls6 ls6Var;
        ls6 ls6Var2 = Z1[i];
        if (ls6Var2 != null) {
            return ls6Var2;
        }
        synchronized (a2) {
            ls6Var = Z1[i];
            if (ls6Var == null) {
                ls6[] ls6VarArr = Z1;
                ls6 ls6Var3 = new ls6(i);
                ls6VarArr[i] = ls6Var3;
                ls6Var = ls6Var3;
            }
        }
        return ls6Var;
    }

    public static void e(int i, int i2, int i3, ArrayList arrayList) {
        if ((i & 256) != 0) {
            TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
            tL_messageEntitySpoiler.offset = i2;
            tL_messageEntitySpoiler.length = i3 - i2;
            arrayList.add(tL_messageEntitySpoiler);
        }
        if ((i & 1) != 0) {
            TLRPC.TL_messageEntityBold tL_messageEntityBold = new TLRPC.TL_messageEntityBold();
            tL_messageEntityBold.offset = i2;
            tL_messageEntityBold.length = i3 - i2;
            arrayList.add(tL_messageEntityBold);
        }
        if ((i & 2) != 0) {
            TLRPC.TL_messageEntityItalic tL_messageEntityItalic = new TLRPC.TL_messageEntityItalic();
            tL_messageEntityItalic.offset = i2;
            tL_messageEntityItalic.length = i3 - i2;
            arrayList.add(tL_messageEntityItalic);
        }
        if ((i & 4) != 0) {
            TLRPC.TL_messageEntityCode tL_messageEntityCode = new TLRPC.TL_messageEntityCode();
            tL_messageEntityCode.offset = i2;
            tL_messageEntityCode.length = i3 - i2;
            arrayList.add(tL_messageEntityCode);
        }
        if ((i & 8) != 0) {
            TLRPC.TL_messageEntityStrike tL_messageEntityStrike = new TLRPC.TL_messageEntityStrike();
            tL_messageEntityStrike.offset = i2;
            tL_messageEntityStrike.length = i3 - i2;
            arrayList.add(tL_messageEntityStrike);
        }
        if ((i & 16) != 0) {
            TLRPC.TL_messageEntityUnderline tL_messageEntityUnderline = new TLRPC.TL_messageEntityUnderline();
            tL_messageEntityUnderline.offset = i2;
            tL_messageEntityUnderline.length = i3 - i2;
            arrayList.add(tL_messageEntityUnderline);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(smb smbVar, int i, int i2, Spannable spannable, boolean z) {
        rmb rmbVar;
        int i3;
        try {
            int i4 = i;
            int i5 = i2;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(i4, i5, CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0) {
                int i6 = 0;
                int i7 = 0;
                while (i7 < characterStyleArr.length) {
                    CharacterStyle characterStyle = characterStyleArr[i7];
                    rmb rmbVar2 = smbVar != null ? smbVar.b : new rmb();
                    if (characterStyle instanceof smb) {
                        rmbVar = ((smb) characterStyle).b;
                    } else if (characterStyle instanceof h8c) {
                        rmbVar = ((h8c) characterStyle).a;
                        if (rmbVar == null) {
                            rmbVar = new rmb();
                        }
                    } else {
                        i7++;
                        i6 = 0;
                    }
                    if (rmbVar != null) {
                        int spanStart = spannable.getSpanStart(characterStyle);
                        int spanEnd = spannable.getSpanEnd(characterStyle);
                        spannable.removeSpan(characterStyle);
                        if (spanStart <= i4) {
                            if (spanStart != i4) {
                                spannable.setSpan(L(characterStyle, rmbVar, null, z), spanStart, i4, 33);
                            }
                            if (spanEnd > i4) {
                                if (smbVar != null) {
                                    spannable.setSpan(L(characterStyle, rmbVar, rmbVar2, z), i4, Math.min(spanEnd, i5), 33);
                                }
                                i3 = spanEnd;
                                if (spanEnd >= i5) {
                                    if (spanEnd != i5) {
                                        spannable.setSpan(L(characterStyle, rmbVar, null, z), i5, spanEnd, 33);
                                    }
                                    if (i5 > spanStart && spanEnd <= i4) {
                                        if (smbVar != null) {
                                            spannable.setSpan(L(characterStyle, rmbVar, rmbVar2, z), spanStart, Math.min(spanEnd, i5), 33);
                                        }
                                        i4 = i3;
                                        i5 = spanStart;
                                    }
                                }
                                i4 = i3;
                            }
                        } else if (i5 > spanEnd) {
                            spannable.setSpan(L(characterStyle, rmbVar, rmbVar2, z), spanStart, spanEnd, 33);
                            if (smbVar != null) {
                                spannable.setSpan(new smb(new rmb(rmbVar2), i6), spanEnd, i5, 33);
                            }
                            i5 = spanStart;
                        }
                        i3 = i4;
                        if (spanEnd >= i5) {
                        }
                        i4 = i3;
                    }
                    i7++;
                    i6 = 0;
                }
            }
            if (smbVar == null || i4 >= i5 || i4 >= spannable.length()) {
                return;
            }
            spannable.setSpan(smbVar, i4, Math.min(spannable.length(), i5), 33);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public static CharSequence f2(int i, int i2, CharSequence charSequence) {
        return charSequence instanceof SpannableStringBuilder ? charSequence.subSequence(i, i2) : charSequence instanceof SpannedString ? ((SpannedString) charSequence).subSequence(i, i2) : TextUtils.substring(charSequence, i, i2);
    }

    public static void g(r47 r47Var, Spannable spannable) {
        h(r47Var.k.entities, r47Var.v, spannable, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(ArrayList arrayList, CharSequence charSequence, Spannable spannable, int i) {
        int i2;
        ArrayList arrayList2;
        ArrayList u0;
        int i3;
        int i4;
        int i5;
        int i6;
        for (smb smbVar : (smb[]) spannable.getSpans(0, spannable.length(), smb.class)) {
            spannable.removeSpan(smbVar);
        }
        int i7 = 1;
        int i8 = 100;
        if (arrayList == null || arrayList.size() <= 100) {
            if (arrayList == null || arrayList.isEmpty() || charSequence == null || charSequence.length() == 0 || arrayList.size() > 1000) {
                i2 = 1;
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i9);
                    if (messageEntity != null) {
                        arrayList3.add(messageEntity);
                    }
                }
                Collections.sort(arrayList3, new vk6((byte) 7));
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayList3.size();
                int i10 = 0;
                int i11 = 0;
                loop3: while (true) {
                    if (i10 < size2) {
                        TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList3.get(i10);
                        if (messageEntity2.length <= 0 || (i5 = messageEntity2.offset) < 0 || i5 >= charSequence.length() || (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                            i2 = i7;
                            i4 = i8;
                        } else {
                            rmb rmbVar = new rmb();
                            int i12 = messageEntity2.offset;
                            rmbVar.b = i12;
                            rmbVar.c = Math.min(messageEntity2.length, charSequence.length() - rmbVar.b) + i12;
                            if (messageEntity2 instanceof TLRPC.TL_messageEntitySpoiler) {
                                i6 = 256;
                                rmbVar.a = 256;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityStrike) {
                                i6 = 8;
                                rmbVar.a = 8;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUnderline) {
                                i6 = 16;
                                rmbVar.a = 16;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBold) {
                                rmbVar.a = i7;
                                i6 = i7;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityItalic) {
                                i6 = 2;
                                rmbVar.a = 2;
                            } else if ((messageEntity2 instanceof TLRPC.TL_messageEntityCode) || (messageEntity2 instanceof TLRPC.TL_messageEntityPre)) {
                                i6 = 4;
                                rmbVar.a = 4;
                            } else {
                                if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                                    rmbVar.a = 64;
                                    rmbVar.d = messageEntity2;
                                } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                    rmbVar.a = 64;
                                    rmbVar.d = messageEntity2;
                                } else {
                                    i6 = 128;
                                    rmbVar.a = 128;
                                    rmbVar.d = messageEntity2;
                                }
                                i6 = 64;
                            }
                            if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                                i6 |= 1024;
                                rmbVar.a = i6;
                            }
                            rmbVar.a = i6 & i;
                            int size3 = arrayList4.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size3) {
                                    i2 = i7;
                                    if (rmbVar.b < rmbVar.c) {
                                        i4 = 100;
                                        if (arrayList4.size() >= 100) {
                                            break;
                                        } else {
                                            arrayList4.add(rmbVar);
                                        }
                                    } else {
                                        i4 = 100;
                                    }
                                } else {
                                    i11++;
                                    if (i11 > 10000) {
                                        i2 = i7;
                                        break loop3;
                                    }
                                    rmb rmbVar2 = (rmb) arrayList4.get(i13);
                                    int i14 = rmbVar.b;
                                    i2 = i7;
                                    int i15 = rmbVar2.b;
                                    if (i14 > i15) {
                                        int i16 = rmbVar2.c;
                                        if (i14 >= i16) {
                                            continue;
                                        } else if (rmbVar.c >= i16) {
                                            if (arrayList4.size() >= i8) {
                                                break loop3;
                                            }
                                            rmb rmbVar3 = new rmb(rmbVar);
                                            rmbVar3.c(rmbVar2);
                                            rmbVar3.c = rmbVar2.c;
                                            i13++;
                                            arrayList4.add(i13, rmbVar3);
                                            size3++;
                                            int i17 = rmbVar.b;
                                            rmbVar.b = rmbVar2.c;
                                            rmbVar2.c = i17;
                                        } else {
                                            if (arrayList4.size() > 98) {
                                                break loop3;
                                            }
                                            rmb rmbVar4 = new rmb(rmbVar);
                                            rmbVar4.c(rmbVar2);
                                            arrayList4.add(i13 + 1, rmbVar4);
                                            rmb rmbVar5 = new rmb(rmbVar2);
                                            rmbVar5.b = rmbVar.c;
                                            i13 += 2;
                                            arrayList4.add(i13, rmbVar5);
                                            size3 += 2;
                                            int i172 = rmbVar.b;
                                            rmbVar.b = rmbVar2.c;
                                            rmbVar2.c = i172;
                                        }
                                        i13++;
                                        i7 = i2;
                                        i8 = 100;
                                    } else {
                                        int i18 = rmbVar.c;
                                        if (i15 >= i18) {
                                            continue;
                                        } else {
                                            int i19 = rmbVar2.c;
                                            if (i18 == i19) {
                                                rmbVar2.c(rmbVar);
                                            } else if (i18 >= i19) {
                                                if (arrayList4.size() >= 100) {
                                                    break loop3;
                                                }
                                                rmb rmbVar6 = new rmb(rmbVar);
                                                rmbVar6.b = rmbVar2.c;
                                                i13++;
                                                arrayList4.add(i13, rmbVar6);
                                                size3++;
                                                rmbVar2.c(rmbVar);
                                            } else {
                                                if (arrayList4.size() >= 100) {
                                                    break loop3;
                                                }
                                                rmb rmbVar7 = new rmb(rmbVar2);
                                                rmbVar7.c(rmbVar);
                                                rmbVar7.c = rmbVar.c;
                                                i13++;
                                                arrayList4.add(i13, rmbVar7);
                                                size3++;
                                                rmbVar2.b = rmbVar.c;
                                            }
                                            rmbVar.c = i15;
                                        }
                                        i13++;
                                        i7 = i2;
                                        i8 = 100;
                                    }
                                }
                            }
                        }
                        i10++;
                        i8 = i4;
                        i7 = i2;
                    } else {
                        i2 = i7;
                        int size4 = arrayList4.size();
                        for (int i20 = 0; i20 < size4; i20++) {
                            rmb rmbVar8 = (rmb) arrayList4.get(i20);
                            int i21 = rmbVar8.b;
                            if (i21 >= 0 && i21 < (i3 = rmbVar8.c) && i3 <= charSequence.length()) {
                            }
                        }
                        arrayList2 = arrayList4;
                    }
                }
            }
            u0 = arrayList2 != null ? arrayList2 : u0(arrayList, charSequence, i);
        } else {
            u0 = u0(arrayList, charSequence, i);
            i2 = 1;
        }
        for (int i22 = 0; i22 < Math.min(1000, u0.size()); i22++) {
            rmb rmbVar9 = (rmb) u0.get(i22);
            f(new smb(rmbVar9, 0), rmbVar9.b, rmbVar9.c, spannable, i2);
        }
    }

    public static int h0(TLRPC.Message message) {
        if (message == null) {
            return -1;
        }
        TLRPC.MessageMedia n1 = r47.n1(message);
        if (n1 instanceof TLRPC.TL_messageMediaPoll) {
            return 8;
        }
        if (n1 instanceof TLRPC.TL_messageMediaPhoto) {
            return 0;
        }
        if (!(n1 instanceof TLRPC.TL_messageMediaDocument)) {
            if (!message.entities.isEmpty()) {
                for (int i = 0; i < message.entities.size(); i++) {
                    TLRPC.MessageEntity messageEntity = message.entities.get(i);
                    if ((messageEntity instanceof TLRPC.TL_messageEntityUrl) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntityEmail)) {
                        return 3;
                    }
                }
            }
            return -1;
        }
        TLRPC.Document document = n1.document;
        if (document == null) {
            return -1;
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        for (int i2 = 0; i2 < document.attributes.size(); i2++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                z = documentAttribute.round_message;
                z3 = !z;
                z2 = z;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                z4 = true;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                z = documentAttribute.voice;
                z6 = !z;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                z5 = true;
            }
        }
        if (z || z2) {
            return 2;
        }
        if (z3 && !z4 && !z5) {
            return 0;
        }
        if (z5) {
            return -1;
        }
        if (z4) {
            return 5;
        }
        return z6 ? 4 : 1;
    }

    public static void i(TLRPC.DraftMessage draftMessage, SpannableString spannableString) {
        h(draftMessage.entities, draftMessage.message, spannableString, jn7.m4);
    }

    public static boolean j(TL_aicompose.inputAiComposeStyle inputaicomposestyle, TL_aicompose.inputAiComposeStyle inputaicomposestyle2) {
        return (A0(inputaicomposestyle) || A0(inputaicomposestyle2)) ? A0(inputaicomposestyle) == A0(inputaicomposestyle2) : inputaicomposestyle.emojify == inputaicomposestyle2.emojify && TextUtils.equals(inputaicomposestyle.to_lang, inputaicomposestyle2.to_lang) && TL_aicompose.InputAiComposeTone.equals(inputaicomposestyle.tone, inputaicomposestyle2.tone);
    }

    public static CharSequence k1(CharSequence charSequence, Pattern pattern, ArrayList arrayList, nu4 nu4Var) {
        TLRPC.MessageEntity messageEntity;
        URLSpan[] uRLSpanArr;
        CharSequence charSequence2 = charSequence;
        Matcher matcher = pattern.matcher(charSequence2);
        int i = 0;
        int i2 = 0;
        while (i <= matcher.regionEnd() && matcher.find(i)) {
            String group = matcher.group(1);
            boolean z = !(charSequence2 instanceof Spannable) || (uRLSpanArr = (URLSpan[]) ((Spannable) charSequence2).getSpans(matcher.start() - i2, matcher.end() - i2, URLSpan.class)) == null || uRLSpanArr.length <= 0;
            if (z) {
                messageEntity = null;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i3);
                    if ((messageEntity2 instanceof TLRPC.TL_messageEntityPre) || (messageEntity2 instanceof TLRPC.TL_messageEntityCode)) {
                        int start = matcher.start() - i2;
                        int end = matcher.end() - i2;
                        int i4 = messageEntity2.offset;
                        if (hl.z1(start, end, i4, messageEntity2.length + i4)) {
                            z = false;
                            break;
                        }
                    } else {
                        if ((messageEntity2 instanceof TLRPC.TL_messageEntityUrl) || (messageEntity2 instanceof TLRPC.TL_messageEntityTonAddress)) {
                            int i5 = messageEntity2.offset + messageEntity2.length;
                            if (!hl.z1(matcher.start() - i2, matcher.start(1) - i2, messageEntity2.offset, i5)) {
                                if (!hl.z1(matcher.end(1) - i2, matcher.end() - i2, messageEntity2.offset, i5)) {
                                    continue;
                                } else if ((messageEntity2 instanceof TLRPC.TL_messageEntityUrl) && i5 == matcher.end() - i2 && matcher.end(1) - i2 > messageEntity2.offset) {
                                    messageEntity = messageEntity2;
                                }
                            }
                            z = false;
                            break;
                        }
                    }
                }
            } else {
                messageEntity = null;
            }
            if (z) {
                charSequence2 = ((Object) charSequence2.subSequence(0, matcher.start() - i2)) + group + ((Object) charSequence2.subSequence(matcher.end() - i2, charSequence2.length()));
                TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) nu4Var.h(null);
                messageEntity3.offset = matcher.start() - i2;
                int length = group.length();
                messageEntity3.length = length;
                int i6 = messageEntity3.offset;
                int i7 = length + i6;
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    TLRPC.MessageEntity messageEntity4 = (TLRPC.MessageEntity) arrayList.get(i8);
                    int i9 = messageEntity4.offset;
                    if (i9 > i7) {
                        messageEntity4.offset = i9 - 4;
                    } else if (i9 > i6) {
                        messageEntity4.offset = i9 - 2;
                    }
                }
                if (messageEntity != null) {
                    messageEntity.length -= matcher.end() - matcher.end(1);
                    String substring = matcher.group().substring(matcher.end(1) - matcher.start());
                    String str = messageEntity.url;
                    if (str != null && str.endsWith(substring)) {
                        String str2 = messageEntity.url;
                        messageEntity.url = str2.substring(0, str2.length() - substring.length());
                    }
                }
                arrayList.add(messageEntity3);
                i2 += (matcher.end() - matcher.start()) - group.length();
                i = matcher.end();
            } else {
                i = matcher.start() + 1;
            }
        }
        return charSequence2;
    }

    public static TLRPC.TL_attachMenuBotIcon l0(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i);
            i++;
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = tL_attachMenuBotIcon;
            if (tL_attachMenuBotIcon2.name.equals("default_static")) {
                return tL_attachMenuBotIcon2;
            }
        }
        return null;
    }

    public static void n1(ImageReceiver imageReceiver, jn5 jn5Var, String str) {
        if (i86.e(8200)) {
            imageReceiver.w1 = "preload";
            imageReceiver.T(0);
            imageReceiver.d0(jn5Var, str, null, null, 0, 11);
        }
    }

    public static long p(int i, ArrayList arrayList) {
        long j = 0;
        if (arrayList == null) {
            return 0L;
        }
        int min = Math.min(i, arrayList.size());
        for (int i2 = 0; i2 < min; i2++) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i2);
            if (document != null) {
                j = r(j, document.id);
            }
        }
        return j;
    }

    public static long r(long j, long j2) {
        long j3 = j ^ (j >>> 21);
        long j4 = j3 ^ (j3 << 35);
        return (j4 ^ (j4 >>> 4)) + j2;
    }

    public static long r0(TLRPC.Document document) {
        if (document == null) {
            return -1L;
        }
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
                    return inputStickerSet.id;
                }
                return -1L;
            }
        }
        return -1L;
    }

    public static long s(ArrayList arrayList) {
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null) {
                if (!((TLRPC.TL_messages_stickerSet) arrayList.get(i)).set.archived) {
                    j = r(j, r3.hash);
                }
            }
        }
        return j;
    }

    public static boolean t(TLRPC.Message message) {
        boolean z = message instanceof TLRPC.TL_message_secret;
        if (!z || (!((r47.n1(message) instanceof TLRPC.TL_messageMediaPhoto) || r47.K4(message) || r47.t3(message)) || r47.n1(message).ttl_seconds == 0 || r47.n1(message).ttl_seconds > 60)) {
            return (z || !(message instanceof TLRPC.TL_message) || (!((r47.n1(message) instanceof TLRPC.TL_messageMediaPhoto) || (r47.n1(message) instanceof TLRPC.TL_messageMediaDocument)) || r47.n1(message).ttl_seconds == 0)) && h0(message) != -1;
        }
        return false;
    }

    public static ArrayList u0(ArrayList arrayList, CharSequence charSequence, int i) {
        int i2;
        int i3;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && !arrayList.isEmpty() && charSequence != null && charSequence.length() != 0 && arrayList.size() <= 1000) {
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i5);
                if (messageEntity != null) {
                    arrayList3.add(messageEntity);
                }
            }
            Collections.sort(arrayList3, new vk6((byte) 6));
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int[] iArr = new int[arrayList3.size() << 1];
            int size2 = arrayList3.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size2; i7++) {
                TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList3.get(i7);
                if (messageEntity2.length > 0 && (i2 = messageEntity2.offset) >= 0 && i2 < charSequence.length()) {
                    int i8 = messageEntity2.offset;
                    int min = Math.min(messageEntity2.length, charSequence.length() - i8) + i8;
                    if (!(messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                        rmb rmbVar = new rmb();
                        rmbVar.b = i8;
                        rmbVar.c = min;
                        if (messageEntity2 instanceof TLRPC.TL_messageEntitySpoiler) {
                            i3 = 256;
                            rmbVar.a = 256;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityStrike) {
                            i3 = 8;
                            rmbVar.a = 8;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUnderline) {
                            i3 = 16;
                            rmbVar.a = 16;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBold) {
                            rmbVar.a = 1;
                            i3 = 1;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityItalic) {
                            i3 = 2;
                            rmbVar.a = 2;
                        } else if ((messageEntity2 instanceof TLRPC.TL_messageEntityCode) || (messageEntity2 instanceof TLRPC.TL_messageEntityPre)) {
                            i3 = 4;
                            rmbVar.a = 4;
                        } else {
                            if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                                rmbVar.a = 64;
                                rmbVar.d = messageEntity2;
                            } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                rmbVar.a = 64;
                                rmbVar.d = messageEntity2;
                            } else {
                                i3 = 128;
                                rmbVar.a = 128;
                                rmbVar.d = messageEntity2;
                            }
                            i3 = 64;
                        }
                        if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                            i3 |= 1024;
                            rmbVar.a = i3;
                        }
                        rmbVar.a = i3 & i;
                        arrayList4.add(rmbVar);
                        int i9 = i6 + 1;
                        iArr[i6] = i8;
                        i6 += 2;
                        iArr[i9] = min;
                    }
                }
            }
            if (i6 != 0) {
                Arrays.sort(iArr, 0, i6);
                int i10 = 0;
                loop2: while (i10 < i6) {
                    int i11 = iArr[i10];
                    while (i10 < i6) {
                        int i12 = iArr[i10];
                        if (i12 == i11) {
                            i10++;
                        } else {
                            int size3 = arrayList4.size();
                            rmb rmbVar2 = null;
                            int i13 = TLObject.FLAG_31;
                            for (int i14 = i4; i14 < size3; i14++) {
                                rmb rmbVar3 = (rmb) arrayList4.get(i14);
                                if (rmbVar3.b <= i11 && rmbVar3.c >= i12) {
                                    if (rmbVar2 == null) {
                                        rmbVar2 = new rmb();
                                        rmbVar2.b = i11;
                                        rmbVar2.c = i12;
                                    }
                                    rmbVar2.a |= rmbVar3.a;
                                    TLRPC.MessageEntity messageEntity3 = rmbVar3.d;
                                    if (messageEntity3 != null && (rmbVar2.d == null || rmbVar3.b > i13)) {
                                        rmbVar2.d = messageEntity3;
                                        i13 = rmbVar3.b;
                                    }
                                }
                            }
                            if (rmbVar2 != null) {
                                if (!arrayList2.isEmpty()) {
                                    rmb rmbVar4 = (rmb) c00.g(1, arrayList2);
                                    if (rmbVar4.c == rmbVar2.b && rmbVar4.a == rmbVar2.a && rmbVar4.d == rmbVar2.d) {
                                        rmbVar4.c = rmbVar2.c;
                                    }
                                }
                                if (arrayList2.size() >= 1000) {
                                    arrayList2.clear();
                                    return arrayList2;
                                }
                                arrayList2.add(rmbVar2);
                            }
                            i4 = 0;
                        }
                    }
                    break loop2;
                }
            }
        }
        return arrayList2;
    }

    public static boolean v(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLObject tLObject) {
        TLRPC.User user = tLObject instanceof TLRPC.User ? (TLRPC.User) tLObject : null;
        TLRPC.Chat chat = tLObject instanceof TLRPC.Chat ? (TLRPC.Chat) tLObject : null;
        ArrayList<TLRPC.AttachMenuPeerType> arrayList = tL_attachMenuBot.peer_types;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList.get(i);
            i++;
            TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) && user != null && user.bot && user.id == tL_attachMenuBot.bot_id) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM) && user != null && user.bot && user.id != tL_attachMenuBot.bot_id) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) && user != null && !user.bot) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) && chat != null && !xc2.V(chat)) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) && chat != null && xc2.V(chat)) {
                return true;
            }
        }
        return false;
    }

    public static String y0(TLRPC.InputStickerSet inputStickerSet) {
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
            return "id" + inputStickerSet.id + "access_hash" + inputStickerSet.access_hash;
        }
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) {
            return "short" + inputStickerSet.short_name;
        }
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) {
            return "empty";
        }
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetAnimatedEmoji) {
            return "animatedEmoji";
        }
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiGenericAnimations) {
            return "emojiGenericAnimations";
        }
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses) {
            return "emojiChannelDefaultStatuses";
        }
        if (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetDice)) {
            return inputStickerSet instanceof TLRPC.TL_inputStickerSetPremiumGifts ? "premiumGifts" : inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultTopicIcons ? "defaultTopicIcons" : inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses ? "emojiDefaultStatuses" : inputStickerSet instanceof TLRPC.TL_inputStickerSetTonGifts ? "tonGifts" : "null";
        }
        return "dice" + ((TLRPC.TL_inputStickerSetDice) inputStickerSet).emoticon;
    }

    public final void A1(int i, ArrayList arrayList, boolean z, int i2, long j, Runnable runnable) {
        hl.c3(new hl3((Object) this, i, (byte) 23));
        Utilities.d.c(new tp6(this, z, arrayList, i2, j, i, runnable));
    }

    public final void B() {
        if (getUserConfig().c0 != null) {
            String str = getUserConfig().c0;
            TLRPC.TL_messages_stickerSet q0 = q0(str);
            if (q0 == null) {
                q0 = o0(str);
            }
            if (q0 == null) {
                d0(this.currentAccount).d1(str, false, true);
            }
        }
        if (this.m0 || System.currentTimeMillis() - getUserConfig().g0 < 86400000) {
            return;
        }
        this.m0 = true;
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new fp6(this, (byte) 5));
    }

    public final void B1(long j, long j2, TLRPC.DraftMessage draftMessage) {
        TL_aicompose.inputAiComposeStyle inputaicomposestyle;
        if (draftMessage != null && (inputaicomposestyle = draftMessage.ai_style) != null) {
            F1(j, inputaicomposestyle);
        } else if (j2 == 0) {
            F1(j, null);
        }
    }

    public final void C() {
        if (this.w || Math.abs((System.currentTimeMillis() / 1000) - this.x) < 3600) {
            return;
        }
        U0(true, null);
    }

    public final boolean C0(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int i = 0;
        while (true) {
            ArrayList[] arrayListArr = this.g0;
            if (i >= arrayListArr[2].size()) {
                return false;
            }
            TLRPC.Document document2 = (TLRPC.Document) arrayListArr[2].get(i);
            if (document2.id == document.id && document2.dc_id == document.dc_id) {
                return true;
            }
            i++;
        }
    }

    public final void C1(e eVar, boolean z, int i, TLRPC.TL_messages_stickerSetInstallResultArchive tL_messages_stickerSetInstallResultArchive) {
        int size = tL_messages_stickerSetInstallResultArchive.sets.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.K.l(tL_messages_stickerSetInstallResultArchive.sets.get(i2).set.id);
        }
        E0(i, false);
        getNotificationCenter().k(jn7.Y0, tL_messages_stickerSetInstallResultArchive.sets);
        if (eVar == null || eVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = eVar.getParentActivity();
        e eVar2 = z ? eVar : null;
        ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_stickerSetInstallResultArchive.sets;
        u4b u4bVar = new u4b(parentActivity);
        TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(0);
        boolean z2 = stickerSetCovered.set.masks;
        id idVar = u4bVar.a;
        if (z2) {
            u4bVar.d = true;
            idVar.S = ob6.M0(2131754124, null);
        } else {
            u4bVar.d = false;
            idVar.S = ob6.M0(2131754119, null);
        }
        u4bVar.c = new ArrayList(arrayList);
        u4bVar.e = eVar2;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        u4bVar.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        yob.X(textView, aob.G6, null);
        textView.setGravity(tre.y());
        textView.setTextSize(1, 16.0f);
        textView.setPadding(hl.L(23.0f), hl.L(10.0f), hl.L(23.0f), 0);
        if (stickerSetCovered.set.masks) {
            textView.setText(ob6.M0(2131754125, null));
        } else {
            textView.setText(ob6.M0(2131754120, null));
        }
        linearLayout.addView(textView, tre.o(-2, -2));
        d79 d79Var = new d79(parentActivity, null);
        idVar.getContext();
        d79Var.setLayoutManager(new x46(1, false));
        d79Var.setAdapter(new t4b(u4bVar, parentActivity));
        d79Var.setVerticalScrollBarEnabled(false);
        d79Var.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        d79Var.setGlowColor(-657673);
        linearLayout.addView(d79Var, tre.k(0.0f, 10.0f, 0.0f, 0.0f, -1, -2));
        u4bVar.g(ob6.M0(2131752006, null), new bya((byte) 2));
        if (eVar2 != null) {
            u4bVar.j(ob6.M0(2131745223, null), new hja(u4bVar, (byte) 15));
        }
        eVar.showDialog(idVar);
    }

    public final void D(int i) {
        if (this.W[i]) {
            return;
        }
        if (!this.X[i] || Math.abs((System.currentTimeMillis() / 1000) - this.Z[i]) >= 3600) {
            b1(i, true, false);
        }
    }

    public final boolean D0(long j, boolean z) {
        if (this.K.h(j) >= 0 || (z && this.L.contains(Long.valueOf(j)))) {
            return (z && this.M.contains(Long.valueOf(j))) ? false : true;
        }
        return false;
    }

    public final void D1(long j, long j2, gs6 gs6Var) {
        SharedPreferences k = bp1.k(new StringBuilder("2voicedrafts_"), this.currentAccount, a.b, 0);
        long hash = Objects.hash(Long.valueOf(j), Long.valueOf(j2));
        String str = hash + "";
        if (gs6Var == null) {
            k.edit().remove(str).apply();
            this.R1.l(hash);
        } else {
            k.edit().putString(str, gs6Var.toString()).apply();
            this.R1.k(hash, gs6Var);
        }
    }

    public final void E() {
        if (getUserConfig().d0 != null) {
            String str = getUserConfig().d0;
            TLRPC.TL_messages_stickerSet q0 = q0(str);
            if (q0 == null) {
                q0 = o0(str);
            }
            if (q0 == null) {
                d0(this.currentAccount).d1(str, false, true);
            }
        }
        if (this.n0 || System.currentTimeMillis() - getUserConfig().h0 < 86400000) {
            return;
        }
        this.n0 = true;
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetTonGifts();
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new fp6(this, (byte) 9));
    }

    public final void E0(int i, boolean z) {
        if (!z) {
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            tL_messages_getArchivedStickers.limit = 0;
            tL_messages_getArchivedStickers.masks = i == 1;
            tL_messages_getArchivedStickers.emojis = i == 5;
            getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new b22(this, i, (byte) 2));
            return;
        }
        int i2 = uc7.s1(this.currentAccount).X3.getInt("archivedStickersCount" + i, -1);
        if (i2 == -1) {
            E0(i, false);
        } else {
            this.c0[i] = i2;
            getNotificationCenter().k(jn7.Z0, Integer.valueOf(i));
        }
    }

    public final void E1(TLRPC.TL_emojiStatus tL_emojiStatus) {
        ArrayList<TLRPC.EmojiStatus>[] arrayListArr = this.F0;
        int i = 0;
        if (arrayListArr[0] != null) {
            long j = tL_emojiStatus.document_id;
            int i2 = 0;
            while (i2 < arrayListArr[0].size()) {
                if ((arrayListArr[0].get(i2) instanceof TLRPC.TL_emojiStatus) && ((TLRPC.TL_emojiStatus) arrayListArr[0].get(i2)).document_id == j) {
                    arrayListArr[0].remove(i2);
                    i2--;
                }
                i2++;
            }
            arrayListArr[0].add(0, tL_emojiStatus);
            while (arrayListArr[0].size() > 50) {
                qd4.v(1, arrayListArr[0]);
            }
            TL_account.TL_emojiStatuses tL_emojiStatuses = new TL_account.TL_emojiStatuses();
            tL_emojiStatuses.hash = this.E0[0];
            tL_emojiStatuses.statuses = arrayListArr[0];
            getMessagesStorage().a.c(new sb4((Object) this, i, (Object) tL_emojiStatuses, (byte) 7));
        }
    }

    public final void F(long j, long j2, boolean z) {
        zh6 zh6Var = this.u1;
        zh6 zh6Var2 = (zh6) zh6Var.f(j);
        TLRPC.DraftMessage draftMessage = zh6Var2 != null ? (TLRPC.DraftMessage) zh6Var2.f(j2) : null;
        if (draftMessage != null) {
            if (z) {
                TLRPC.InputReplyTo inputReplyTo = draftMessage.reply_to;
                if (inputReplyTo != null) {
                    if (inputReplyTo.reply_to_msg_id == 0) {
                        return;
                    } else {
                        inputReplyTo.reply_to_msg_id = 0;
                    }
                }
                draftMessage.flags &= -2;
                T1(j, j2, draftMessage.message, draftMessage.entities, null, null, null, 0L, draftMessage.no_webpage, true, null);
                return;
            }
            zh6 zh6Var3 = (zh6) zh6Var.f(j);
            if (zh6Var3 != null) {
                zh6Var3.l(j2);
                if (zh6Var3.m() == 0) {
                    zh6Var.l(j);
                }
            }
            zh6 zh6Var4 = this.v1;
            zh6 zh6Var5 = (zh6) zh6Var4.f(j);
            if (zh6Var5 != null) {
                zh6Var5.l(j2);
                if (zh6Var5.m() == 0) {
                    zh6Var4.l(j);
                }
            }
            SharedPreferences sharedPreferences = this.w1;
            if (j2 == 0) {
                sharedPreferences.edit().remove(String.valueOf(j)).remove("r_" + j).commit();
                getMessagesController().h5(null);
                getNotificationCenter().k(jn7.r, new Object[0]);
                return;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            StringBuilder o = ik8.o(j, "t_", "_");
            o.append(j2);
            SharedPreferences.Editor remove = edit.remove(o.toString());
            StringBuilder o2 = ik8.o(j, "rt_", "_");
            o2.append(j2);
            remove.remove(o2.toString()).commit();
        }
    }

    public final void F0() {
        G0(false, true, null);
    }

    public final void F1(long j, TL_aicompose.inputAiComposeStyle inputaicomposestyle) {
        k();
        if (A0(inputaicomposestyle)) {
            inputaicomposestyle = null;
        }
        zh6 zh6Var = this.r1;
        if (j((TL_aicompose.inputAiComposeStyle) zh6Var.f(j), inputaicomposestyle)) {
            return;
        }
        SharedPreferences.Editor edit = k().edit();
        if (inputaicomposestyle == null) {
            zh6Var.l(j);
            edit.remove(String.valueOf(j));
        } else {
            zh6Var.k(j, inputaicomposestyle);
            try {
                SerializedData serializedData = new SerializedData(inputaicomposestyle.getObjectSize());
                inputaicomposestyle.serializeToStream(serializedData);
                edit.putString(String.valueOf(j), Utilities.f(serializedData.toByteArray()));
                serializedData.cleanup();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        edit.apply();
        getNotificationCenter().k(jn7.X5, Long.valueOf(j));
    }

    public final void G(boolean z) {
        this.u1.b();
        this.v1.b();
        this.t1.b();
        this.w1.edit().clear().commit();
        if (z) {
            getMessagesController().h5(null);
            getNotificationCenter().k(jn7.r, new Object[0]);
        }
    }

    public final void G0(boolean z, boolean z2, tw4 tw4Var) {
        this.c = true;
        if (z) {
            getMessagesStorage().a.c(new ip6(this, (byte) 16));
            return;
        }
        TLRPC.TL_messages_getAttachMenuBots tL_messages_getAttachMenuBots = new TLRPC.TL_messages_getAttachMenuBots();
        tL_messages_getAttachMenuBots.hash = z2 ? 0L : this.a;
        getConnectionsManager().sendRequest(tL_messages_getAttachMenuBots, new mw3(this, tw4Var, (byte) 26));
    }

    public final void G1(long j, TL_bots.BotInfo botInfo) {
        if (botInfo == null) {
            return;
        }
        this.y1.put(botInfo.user_id + "_" + j, botInfo);
        getMessagesStorage().a.c(new ue2((Object) this, (Object) botInfo, j, (byte) 29));
    }

    public final void H() {
        this.j1.clear();
        this.k1.clear();
        this.l1.clear();
        this.m1.clear();
        getNotificationCenter().k(jn7.S0, new Object[0]);
        getNotificationCenter().k(jn7.T0, new Object[0]);
        getNotificationCenter().k(jn7.U0, new Object[0]);
        getNotificationCenter().k(jn7.V0, new Object[0]);
        getMessagesStorage().a.c(new ip6(this, (byte) 17));
        o();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H0(boolean z) {
        String string;
        long j;
        TLRPC.TL_emojiList tL_emojiList;
        Throwable th;
        SharedPreferences k = bp1.k(new StringBuilder("avatar_constructor"), this.currentAccount, a.b, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        if (z) {
            string = k.getString("profile", null);
            j = k.getLong("profile_last_check", 0L);
        } else {
            string = k.getString("group", null);
            j = k.getLong("group_last_check", 0L);
        }
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                tL_emojiList = (TLRPC.TL_emojiList) TLRPC.EmojiList.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                try {
                    if (z) {
                        this.M1 = tL_emojiList;
                    } else {
                        this.N1 = tL_emojiList;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cc4.g(th, true);
                    tL_emojiList2 = tL_emojiList;
                    if (tL_emojiList2 == null) {
                    }
                    TL_account.getDefaultProfilePhotoEmojis getdefaultprofilephotoemojis = new TL_account.getDefaultProfilePhotoEmojis();
                    if (tL_emojiList2 != null) {
                    }
                    getConnectionsManager().sendRequest(getdefaultprofilephotoemojis, new vi1((Object) this, (Object) k, z, (byte) 7));
                }
            } catch (Throwable th3) {
                tL_emojiList = null;
                th = th3;
            }
            tL_emojiList2 = tL_emojiList;
        }
        if (tL_emojiList2 == null && System.currentTimeMillis() - j <= 86400000) {
            boolean z2 = f11.a;
            return;
        }
        TL_account.getDefaultProfilePhotoEmojis getdefaultprofilephotoemojis2 = new TL_account.getDefaultProfilePhotoEmojis();
        if (tL_emojiList2 != null) {
            getdefaultprofilephotoemojis2.hash = tL_emojiList2.hash;
        }
        getConnectionsManager().sendRequest(getdefaultprofilephotoemojis2, new vi1((Object) this, (Object) k, z, (byte) 7));
    }

    public final void H1(jf7 jf7Var, TLRPC.Message message) {
        SQLiteCursor queryFinalized;
        if (jf7Var != null) {
            try {
                if (jf7Var.b != 0) {
                    SQLiteDatabase sQLiteDatabase = getMessagesStorage().b;
                    Locale locale = Locale.US;
                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT mid FROM bot_keyboard_topics WHERE uid = " + jf7Var.a + " AND tid = " + jf7Var.b, new Object[0]);
                } else {
                    SQLiteDatabase sQLiteDatabase2 = getMessagesStorage().b;
                    Locale locale2 = Locale.US;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid FROM bot_keyboard WHERE uid = " + jf7Var.a, new Object[0]);
                }
                int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
                queryFinalized.dispose();
                if (intValue < message.id || r47.f3(intValue) || r47.f3(message.id)) {
                    SQLitePreparedStatement executeFast = jf7Var.b != 0 ? getMessagesStorage().b.executeFast("REPLACE INTO bot_keyboard_topics VALUES(?, ?, ?, ?)") : getMessagesStorage().b.executeFast("REPLACE INTO bot_keyboard VALUES(?, ?, ?)");
                    executeFast.requery();
                    r47.p5(message);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                    message.serializeToStream(nativeByteBuffer);
                    long j = jf7Var.b;
                    long j2 = jf7Var.a;
                    if (j != 0) {
                        executeFast.bindLong(1, j2);
                        executeFast.bindLong(2, jf7Var.b);
                        executeFast.bindInteger(3, message.id);
                        executeFast.bindByteBuffer(4, nativeByteBuffer);
                    } else {
                        executeFast.bindLong(1, j2);
                        executeFast.bindInteger(2, message.id);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                    }
                    executeFast.step();
                    nativeByteBuffer.reuse();
                    executeFast.dispose();
                    hl.c3(new xp6(this, jf7Var, message));
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final boolean I(long j) {
        for (int i = 0; i < this.j1.size(); i++) {
            if (wf3.n(((TLRPC.TL_topPeer) this.j1.get(i)).peer) == j) {
                return true;
            }
        }
        return false;
    }

    public final void I0(long j, long j2, boolean z, int i, c97 c97Var) {
        if (z) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.y1.get(j + "_" + j2);
            if (botInfo != null) {
                getNotificationCenter().k(jn7.D0, botInfo, Integer.valueOf(i));
                return;
            }
        }
        getMessagesStorage().a.c(new jc2(this, j, j2, c97Var, i, (byte) 1));
    }

    public final void I1(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getMessagesStorage().a.c(new y36((Object) this, (Object) tL_messages_stickerSet, (Object) str, i, (byte) 3));
    }

    public final Intent J(long j) {
        if (j == 0) {
            return null;
        }
        Intent intent = new Intent(a.b, (Class<?>) OpenAttachedMenuBotReceiver.class);
        if (!wf3.D(j)) {
            return null;
        }
        intent.putExtra("botId", j);
        intent.putExtra("currentAccount", this.currentAccount);
        StringBuilder sb = new StringBuilder("com.tmessages.openshortcutbot");
        int i = OpenAttachedMenuBotReceiver.a;
        sb.append(j);
        intent.setAction(sb.toString());
        intent.addFlags(67108864);
        return intent;
    }

    public final TL_bots.BotInfo J0(long j, long j2) {
        TL_bots.BotInfo botInfo;
        NativeByteBuffer byteBufferValue;
        SQLiteDatabase sQLiteDatabase = getMessagesStorage().b;
        Locale locale = Locale.US;
        StringBuilder o = ik8.o(j, "SELECT info FROM bot_info_v2 WHERE uid = ", " AND dialogId = ");
        o.append(j2);
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(o.toString(), new Object[0]);
        if (!queryFinalized.next() || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
            botInfo = null;
        } else {
            botInfo = TL_bots.BotInfo.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
            byteBufferValue.reuse();
        }
        queryFinalized.dispose();
        return botInfo;
    }

    public final void J1(final boolean z, ArrayList arrayList, final ArrayList arrayList2, final int i, final long j, final boolean z2) {
        final ArrayList arrayList3 = arrayList != null ? new ArrayList(arrayList) : null;
        getMessagesStorage().a.c(new Runnable() { // from class: pq6
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList4 = arrayList2;
                long j2 = j;
                boolean z3 = z2;
                ls6 ls6Var = ls6.this;
                ArrayList arrayList5 = arrayList3;
                boolean z4 = z;
                int i2 = i;
                try {
                    if (arrayList5 == null) {
                        SQLitePreparedStatement executeFast = ls6Var.getMessagesStorage().b.executeFast("UPDATE stickers_featured SET date = ? WHERE id = ? AND emoji = ?");
                        executeFast.requery();
                        executeFast.bindInteger(1, i2);
                        executeFast.bindInteger(2, z4 ? 2 : 1);
                        executeFast.bindInteger(3, z4 ? 1 : 0);
                        executeFast.step();
                        executeFast.dispose();
                        return;
                    }
                    SQLitePreparedStatement executeFast2 = ls6Var.getMessagesStorage().b.executeFast("REPLACE INTO stickers_featured VALUES(?, ?, ?, ?, ?, ?, ?)");
                    executeFast2.requery();
                    int i3 = 4;
                    for (int i4 = 0; i4 < arrayList5.size(); i4++) {
                        i3 += ((TLRPC.StickerSetCovered) arrayList5.get(i4)).getObjectSize();
                    }
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i3);
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer((arrayList4.size() << 3) + 4);
                    nativeByteBuffer.writeInt32(arrayList5.size());
                    for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                        ((TLRPC.StickerSetCovered) arrayList5.get(i5)).serializeToStream(nativeByteBuffer);
                    }
                    nativeByteBuffer2.writeInt32(arrayList4.size());
                    for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                        nativeByteBuffer2.writeInt64(((Long) arrayList4.get(i6)).longValue());
                    }
                    executeFast2.bindInteger(1, z4 ? 2 : 1);
                    executeFast2.bindByteBuffer(2, nativeByteBuffer);
                    executeFast2.bindByteBuffer(3, nativeByteBuffer2);
                    executeFast2.bindInteger(4, i2);
                    executeFast2.bindLong(5, j2);
                    executeFast2.bindInteger(6, z3 ? 1 : 0);
                    executeFast2.bindInteger(7, z4 ? 1 : 0);
                    executeFast2.step();
                    nativeByteBuffer.reuse();
                    nativeByteBuffer2.reuse();
                    executeFast2.dispose();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        });
    }

    public final Intent K(long j) {
        Intent intent = new Intent(a.b, (Class<?>) OpenChatReceiver.class);
        if (wf3.B(j)) {
            int i = (int) (4294967295L & j);
            intent.putExtra("encId", i);
            if (getMessagesController().a1(Integer.valueOf(i)) == null) {
                return null;
            }
        } else if (wf3.D(j)) {
            intent.putExtra("userId", j);
        } else {
            if (!wf3.y(j)) {
                return null;
            }
            intent.putExtra("chatId", -j);
        }
        intent.putExtra("currentAccount", this.currentAccount);
        intent.setAction("com.tmessages.openchat" + j);
        intent.addFlags(67108864);
        return intent;
    }

    public final void K0(jf7 jf7Var, boolean z) {
        TLRPC.Message message = (TLRPC.Message) this.A1.get(jf7Var);
        byte b = 1;
        if (message != null) {
            getNotificationCenter().k(jn7.G0, message, jf7Var);
        } else {
            getMessagesStorage().a.c(new yn6(this, jf7Var, z, b));
        }
    }

    public final void K1(int i, int i2, long j, long j2) {
        getMessagesStorage().a.c(new x15(this, j2, j, i, i2, (byte) 1));
    }

    public final void L0() {
        if (getUserConfig().w || this.x1) {
            return;
        }
        this.x1 = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getAllDrafts(), new fp6(this, (byte) 1));
    }

    public final void L1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            return;
        }
        this.J.k(stickerSet.id, tL_messages_stickerSet);
        if (!TextUtils.isEmpty(tL_messages_stickerSet.set.short_name)) {
            this.O.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        }
        int i = 0;
        while (true) {
            ArrayList[] arrayListArr = this.H;
            if (i >= arrayListArr.length) {
                break;
            }
            ArrayList arrayList = arrayListArr[i];
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList.get(i2);
                    if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.id == tL_messages_stickerSet.set.id) {
                        arrayList.set(i2, tL_messages_stickerSet);
                    }
                }
            }
            i++;
        }
        long j = tL_messages_stickerSet.set.id;
        zh6 zh6Var = this.N;
        if (zh6Var.d(j)) {
            zh6Var.k(tL_messages_stickerSet.set.id, tL_messages_stickerSet);
        }
        X1(tL_messages_stickerSet);
        TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet.set;
        int i3 = stickerSet3.masks ? 1 : stickerSet3.emojis ? 5 : 0;
        if (z) {
            getNotificationCenter().k(jn7.x0, Integer.valueOf(i3), Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M0(boolean z, boolean z2) {
        long j;
        TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers;
        boolean[] zArr = this.x0;
        if (zArr[z ? 1 : 0]) {
            return;
        }
        byte b = 1;
        zArr[z ? 1 : 0] = true;
        if (z2) {
            getMessagesStorage().a.c(new lr6(this, z, b));
            return;
        }
        long[] jArr = this.q0;
        if (z) {
            TLRPC.TL_messages_getFeaturedEmojiStickers tL_messages_getFeaturedEmojiStickers = new TLRPC.TL_messages_getFeaturedEmojiStickers();
            j = jArr[1];
            tL_messages_getFeaturedEmojiStickers.hash = j;
            tL_messages_getFeaturedStickers = tL_messages_getFeaturedEmojiStickers;
        } else {
            TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers2 = new TLRPC.TL_messages_getFeaturedStickers();
            j = jArr[0];
            tL_messages_getFeaturedStickers2.hash = j;
            tL_messages_getFeaturedStickers = tL_messages_getFeaturedStickers2;
        }
        getConnectionsManager().sendRequest(tL_messages_getFeaturedStickers, new bs6(this, z, j, (byte) 0));
    }

    public final void M1(int i, int i2, long j, ArrayList arrayList) {
        getMessagesStorage().a.c(new c70(this, arrayList != null ? new ArrayList(arrayList) : null, i, i2, j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(int i, boolean z) {
        TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses;
        boolean[] zArr = this.I0;
        if (zArr[i]) {
            return;
        }
        zArr[i] = true;
        if (z) {
            getMessagesStorage().a.c(new gw1(this, i, (byte) 5));
            return;
        }
        long[] jArr = this.E0;
        if (i == 0) {
            TL_account.getRecentEmojiStatuses getrecentemojistatuses = new TL_account.getRecentEmojiStatuses();
            getrecentemojistatuses.hash = jArr[i];
            getchanneldefaultemojistatuses = getrecentemojistatuses;
        } else if (i == 1) {
            TL_account.getDefaultEmojiStatuses getdefaultemojistatuses = new TL_account.getDefaultEmojiStatuses();
            getdefaultemojistatuses.hash = jArr[i];
            getchanneldefaultemojistatuses = getdefaultemojistatuses;
        } else {
            TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses2 = new TL_account.getChannelDefaultEmojiStatuses();
            getchanneldefaultemojistatuses2.hash = jArr[i];
            getchanneldefaultemojistatuses = getchanneldefaultemojistatuses2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getchanneldefaultemojistatuses, new kr6(this, i, (byte) 0));
    }

    public final void N0(TLRPC.StickerSet stickerSet, boolean z) {
        byte b = 7;
        if (z) {
            getMessagesStorage().a.c(new mn6(this, stickerSet, b));
            return;
        }
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
        tL_inputStickerSetID.id = stickerSet.id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new fp6(this, b));
    }

    public final void O(String[] strArr, boolean z) {
        if (strArr != null) {
            byte b = 0;
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                HashMap hashMap = this.C1;
                if (hashMap.get(str) != null) {
                    return;
                }
                if (z && this.D1.contains(str)) {
                    return;
                }
                hashMap.put(str, Boolean.TRUE);
                getMessagesStorage().a.c(new aq6(this, str, b));
            }
        }
    }

    public final void O0(boolean z) {
        if (this.o1 || !getUserConfig().W) {
            return;
        }
        if (z) {
            if (this.n1) {
                return;
            }
            this.o1 = true;
            getMessagesStorage().a.c(new ip6(this, (byte) 14));
            this.n1 = true;
            return;
        }
        this.o1 = true;
        TLRPC.TL_contacts_getTopPeers tL_contacts_getTopPeers = new TLRPC.TL_contacts_getTopPeers();
        tL_contacts_getTopPeers.hash = 0L;
        tL_contacts_getTopPeers.bots_pm = false;
        tL_contacts_getTopPeers.correspondents = true;
        tL_contacts_getTopPeers.groups = false;
        tL_contacts_getTopPeers.channels = false;
        tL_contacts_getTopPeers.bots_inline = true;
        tL_contacts_getTopPeers.bots_guestchat = true;
        tL_contacts_getTopPeers.bots_app = true;
        tL_contacts_getTopPeers.offset = 0;
        tL_contacts_getTopPeers.limit = 20;
        getConnectionsManager().sendRequestTyped(tL_contacts_getTopPeers, new ic((byte) 0), new yt4((Object) this, (byte) 16));
    }

    public final void O1(long j) {
        ArrayList arrayList = this.k1;
        byte b = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((TLRPC.TL_topPeer) arrayList.get(i)).peer.user_id == j) {
                arrayList.remove(i);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsInline();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().j1(j);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new xe2(b));
                getMessagesStorage().a.c(new gr6(this, j, 1));
                getNotificationCenter().k(jn7.T0, new Object[0]);
                return;
            }
        }
    }

    public final void P(TLRPC.InputStickerSet inputStickerSet, icc iccVar) {
        String y0 = y0(inputStickerSet);
        HashMap hashMap = this.L0;
        ArrayList arrayList = (ArrayList) hashMap.get(y0);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(y0, arrayList);
        } else if (arrayList.size() > 0) {
            arrayList.add(iccVar);
            return;
        }
        arrayList.add(iccVar);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = inputStickerSet;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new bq6(this, y0, (byte) 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(final long j, final int i, final int i2, final int i3, final int i4, final long j2, int i5, final int i6, final int i7, w49 w49Var, String str) {
        final boolean z;
        TLRPC.TL_messages_search tL_messages_search;
        if (wf3.y(j)) {
            if (xc2.S(this.currentAccount, -j)) {
                z = true;
                if (f11.a) {
                    cc4.b("load media did " + j + " count = " + i + " max_id " + i2 + " type = " + i4 + " cache = " + i5 + " classGuid = " + i6);
                }
                if ((i5 == 0 && TextUtils.isEmpty(str)) || wf3.B(j)) {
                    fs6 fs6Var = new fs6(this, i, j, i3, j2, i4, w49Var, i2, i6, i5, z, i7);
                    kf7 messagesStorage = getMessagesStorage();
                    messagesStorage.a.c(fs6Var);
                    SparseArray sparseArray = messagesStorage.h;
                    ArrayList arrayList = (ArrayList) sparseArray.get(i6);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        sparseArray.put(i6, arrayList);
                    }
                    arrayList.add(fs6Var);
                    return;
                }
                tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = i;
                if (i3 == 0) {
                    tL_messages_search.offset_id = i3;
                    tL_messages_search.add_offset = -i;
                } else {
                    tL_messages_search.offset_id = i2;
                }
                if (w49Var != null) {
                    tL_messages_search.flags |= 8;
                    tL_messages_search.saved_reaction.add(w49Var.g());
                }
                if (i4 != 0) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                } else if (i4 == 6) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                } else if (i4 == 7) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterVideo();
                } else if (i4 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i4 == 2) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
                } else if (i4 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i4 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                } else if (i4 == 5) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterGif();
                } else if (i4 == 8) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPoll();
                }
                if (TextUtils.isEmpty(str)) {
                    tL_messages_search.q = str;
                } else {
                    tL_messages_search.q = "";
                }
                tL_messages_search.peer = getMessagesController().j1(j);
                if (j2 != 0) {
                    if (j == getUserConfig().e()) {
                        tL_messages_search.saved_peer_id = getMessagesController().j1(j2);
                        tL_messages_search.flags |= 4;
                    } else {
                        tL_messages_search.top_msg_id = (int) j2;
                        tL_messages_search.flags |= 2;
                    }
                }
                if (tL_messages_search.peer != null) {
                    return;
                }
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate(j, i3, i, i2, i4, j2, i6, z, i7) { // from class: vr6
                    public final /* synthetic */ long b;
                    public final /* synthetic */ int c;
                    public final /* synthetic */ byte d;
                    public final /* synthetic */ int e;
                    public final /* synthetic */ int f;
                    public final /* synthetic */ long g;
                    public final /* synthetic */ int h;
                    public final /* synthetic */ int i;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.i = i7;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            ls6 ls6Var = ls6.this;
                            uc7 messagesController = ls6Var.getMessagesController();
                            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                            long j3 = this.b;
                            messagesController.p4(arrayList2, j3);
                            ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                            int i8 = this.c;
                            boolean z2 = false;
                            if (i8 == 0 ? arrayList3.size() == 0 : arrayList3.size() <= 1) {
                                z2 = true;
                            }
                            ls6Var.v1(messages_messages, j3, this.d, this.e, i8, this.f, this.g, 0, this.h, z2, this.i);
                        }
                    }
                }), i6);
                return;
            }
        }
        z = false;
        if (f11.a) {
        }
        if (i5 == 0) {
        }
        tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i;
        if (i3 == 0) {
        }
        if (w49Var != null) {
        }
        if (i4 != 0) {
        }
        if (TextUtils.isEmpty(str)) {
        }
        tL_messages_search.peer = getMessagesController().j1(j);
        if (j2 != 0) {
        }
        if (tL_messages_search.peer != null) {
        }
    }

    public final void P1(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.Z0;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (i == ((r47) arrayList.get(i3)).e1()) {
                this.d1.add((r47) arrayList.remove(i3));
                i3--;
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            ArrayList arrayList2 = this.a1;
            if (i4 >= arrayList2.size()) {
                break;
            }
            if (i == ((r47) arrayList2.get(i4)).e1()) {
                arrayList2.remove(i4);
                i4--;
            }
            i4++;
        }
        while (i2 < this.b1.size()) {
            if (i == ((r47) this.b1.get(i2)).e1()) {
                this.b1.remove(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void Q(ArrayList arrayList, Integer num, boolean z, boolean z2, Runnable runnable) {
        if (arrayList.isEmpty()) {
            runnable.run();
            return;
        }
        ArrayList[] arrayListArr = {t0(5)};
        fr6 fr6Var = new fr6(this, num, arrayList, z2, z, arrayListArr, runnable);
        ArrayList arrayList2 = arrayListArr[0];
        if ((arrayList2 != null && !arrayList2.isEmpty()) || this.E1) {
            fr6Var.run();
            return;
        }
        this.E1 = true;
        boolean[] zArr = new boolean[1];
        hl.c3(new g65(this, zArr, arrayListArr, fr6Var, (byte) 26));
        hl.d3(new mn6((Object) zArr, (Object) fr6Var, (byte) 6), 900L);
    }

    public final void Q0() {
        if (this.g1 || this.M0 != 0) {
            return;
        }
        boolean[] zArr = this.Y0;
        if (zArr[0] && this.O0 == 0 && zArr[1]) {
            return;
        }
        int i = this.f1;
        this.f1 = this.Z0.size();
        this.g1 = true;
        Z1(null, this.Q0, this.O0, this.T0, 1, this.P0, false, this.U0, this.V0, false, this.R0);
        this.f1 = i;
    }

    public final void Q1(long j) {
        byte b = 0;
        for (int i = 0; i < this.j1.size(); i++) {
            if (((TLRPC.TL_topPeer) this.j1.get(i)).peer.user_id == j) {
                this.j1.remove(i);
                getNotificationCenter().k(jn7.S0, new Object[0]);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryCorrespondents();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().j1(j);
                getMessagesStorage().a.c(new gr6(this, j, b));
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new xe2(b));
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (((java.lang.System.currentTimeMillis() / 1000) - r0[1].longValue()) > 1800) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList R() {
        boolean z = this.H0[1];
        ArrayList[] arrayListArr = this.F0;
        if (z) {
            if (arrayListArr[1] != null) {
                Long[] lArr = this.G0;
                if (lArr[1] != null) {
                }
            }
            N(1, false);
        } else {
            N(1, true);
        }
        return arrayListArr[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v9, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, org.telegram.tgnet.TLRPC$Message] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, org.telegram.tgnet.TLRPC$Message] */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r6v3, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r7v8, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    public final ArrayList R0(long j, long j2, ArrayList arrayList, boolean z) {
        Object join;
        CharSequence charSequence;
        ArrayList arrayList2;
        ArrayList arrayList3;
        try {
            ArrayList<Integer> arrayList4 = new ArrayList<>(arrayList);
            if (j2 != 0) {
                join = new StringBuilder();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Integer num = (Integer) arrayList.get(i);
                    if (join.length() != 0) {
                        join.append(",");
                    }
                    join.append(num);
                }
            } else {
                join = TextUtils.join(",", arrayList);
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            int i2 = 1;
            long j3 = getUserConfig().n;
            ?? r10 = 0;
            ?? queryFinalized = getMessagesStorage().b.queryFinalized(String.format(Locale.US, "SELECT data, mid, date FROM messages_v2 WHERE mid IN (%s) AND uid = %d", join, Long.valueOf(j)), new Object[0]);
            while (queryFinalized.next()) {
                ?? byteBufferValue = queryFinalized.byteBufferValue(r10);
                if (byteBufferValue != 0) {
                    ?? TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r10), r10);
                    if (!(TLdeserialize.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                        TLdeserialize.readAttachPath(byteBufferValue, j3);
                        TLdeserialize.id = queryFinalized.intValue(i2);
                        TLdeserialize.date = queryFinalized.intValue(2);
                        TLdeserialize.dialog_id = j;
                        kf7.d(TLdeserialize, arrayList8, arrayList9, null);
                        arrayList5.add(TLdeserialize);
                        arrayList4.remove(Integer.valueOf(TLdeserialize.id));
                    }
                    byteBufferValue.reuse();
                }
                r10 = 0;
                i2 = 1;
            }
            queryFinalized.dispose();
            if (arrayList4.isEmpty()) {
                charSequence = ",";
            } else {
                SQLiteDatabase sQLiteDatabase = getMessagesStorage().b;
                Locale locale = Locale.US;
                charSequence = ",";
                ?? r11 = 0;
                ?? queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT data FROM chat_pinned_v2 WHERE uid = " + j + " AND mid IN (" + TextUtils.join(charSequence, arrayList4) + ")", new Object[0]);
                while (queryFinalized2.next()) {
                    ?? byteBufferValue2 = queryFinalized2.byteBufferValue(r11);
                    if (byteBufferValue2 != 0) {
                        ?? TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(r11), r11);
                        if (!(TLdeserialize2.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                            TLdeserialize2.readAttachPath(byteBufferValue2, j3);
                            TLdeserialize2.dialog_id = j;
                            kf7.d(TLdeserialize2, arrayList8, arrayList9, null);
                            arrayList5.add(TLdeserialize2);
                            arrayList4.remove(Integer.valueOf(TLdeserialize2.id));
                        }
                        byteBufferValue2.reuse();
                    }
                    r11 = 0;
                }
                queryFinalized2.dispose();
            }
            if (arrayList4.isEmpty()) {
                arrayList2 = arrayList9;
            } else if (j2 != 0) {
                TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                tL_channels_getMessages.channel = getMessagesController().h1(j2);
                tL_channels_getMessages.id = arrayList4;
                arrayList2 = arrayList9;
                getConnectionsManager().sendRequest(tL_channels_getMessages, new op6(this, j2, j, tL_channels_getMessages));
            } else {
                arrayList2 = arrayList9;
                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                tL_messages_getMessages.id = arrayList4;
                getConnectionsManager().sendRequest(tL_messages_getMessages, new p87((Object) this, j, (Object) tL_messages_getMessages, (byte) 4));
            }
            if (arrayList5.isEmpty()) {
                return null;
            }
            if (!arrayList8.isEmpty()) {
                getMessagesStorage().m0(arrayList8, arrayList6, false);
            }
            if (arrayList2.isEmpty()) {
                arrayList3 = arrayList7;
            } else {
                arrayList3 = arrayList7;
                getMessagesStorage().R(TextUtils.join(charSequence, arrayList2), arrayList3);
            }
            if (z) {
                return m(arrayList5, arrayList6, arrayList3, true, true);
            }
            m(arrayList5, arrayList6, arrayList3, true, false);
            return null;
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    public final void R1(int i, ArrayList arrayList) {
        ArrayList[] arrayListArr = this.H;
        Collections.sort(arrayListArr[i], new c52(arrayList, (byte) 2));
        this.Y[i] = s(arrayListArr[i]);
        getNotificationCenter().k(jn7.x0, Integer.valueOf(i), Boolean.FALSE);
    }

    public final String S() {
        String str = this.s;
        if (str != null) {
            return str;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        String string = uc7.s1(this.currentAccount).Z3.getString("reaction_on_double_tap", null);
        if (string == null || (this.r.get(string) == null && !string.startsWith("animated_"))) {
            return ((TLRPC.TL_availableReaction) arrayList.get(0)).reaction;
        }
        this.s = string;
        return string;
    }

    public final void S0(final int i, final int i2, final long j) {
        zh6 zh6Var = this.q1;
        if (zh6Var.h(j) >= 0) {
            return;
        }
        zh6Var.k(j, Boolean.TRUE);
        final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.peer = getMessagesController().j1(j);
        tL_messages_search.limit = 40;
        tL_messages_search.offset_id = i;
        tL_messages_search.q = "";
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPinned();
        getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: or6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                int i3;
                boolean z;
                zh6 zh6Var2;
                ls6 ls6Var = ls6.this;
                ls6Var.getClass();
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                boolean z2 = tLObject instanceof TLRPC.messages_Messages;
                int i4 = i2;
                if (z2) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    zh6 zh6Var3 = new zh6();
                    for (int i5 = 0; i5 < messages_messages.users.size(); i5++) {
                        TLRPC.User user = messages_messages.users.get(i5);
                        zh6Var3.k(user.id, user);
                    }
                    zh6 zh6Var4 = new zh6();
                    for (int i6 = 0; i6 < messages_messages.chats.size(); i6++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i6);
                        zh6Var4.k(chat.id, chat);
                    }
                    ls6Var.getMessagesStorage().n1(messages_messages.users, messages_messages.chats, true, true);
                    ls6Var.getMessagesController().j4(messages_messages.users, false);
                    ls6Var.getMessagesController().c4(messages_messages.chats, false);
                    int size = messages_messages.messages.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.Message message = messages_messages.messages.get(i7);
                        if ((message instanceof TLRPC.TL_messageService) || (message instanceof TLRPC.TL_messageEmpty)) {
                            zh6Var2 = zh6Var4;
                        } else {
                            arrayList.add(Integer.valueOf(message.id));
                            zh6Var2 = zh6Var4;
                            hashMap.put(Integer.valueOf(message.id), new r47(ls6Var.currentAccount, message, zh6Var3, zh6Var2, false, false));
                        }
                        i7++;
                        zh6Var4 = zh6Var2;
                    }
                    if (i4 != 0 && arrayList.isEmpty()) {
                        arrayList.add(Integer.valueOf(i4));
                    }
                    r5 = messages_messages.messages.size() >= tL_messages_search.limit ? 0 : 1;
                    i3 = Math.max(messages_messages.count, messages_messages.messages.size());
                    z = r5;
                } else {
                    if (i4 != 0) {
                        arrayList.add(Integer.valueOf(i4));
                    } else {
                        r5 = 0;
                    }
                    i3 = r5;
                    z = false;
                }
                kf7 messagesStorage = ls6Var.getMessagesStorage();
                long j2 = j;
                messagesStorage.e2(j2, arrayList, true, i3, i, z, hashMap);
                hl.c3(new lq6(ls6Var, j2, (byte) 3));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        boolean z;
        boolean z2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.J.f(tL_messages_stickerSet.set.id);
        String str = (String) this.S.f(tL_messages_stickerSet.set.id);
        if (str != null) {
            this.R.put(str, tL_messages_stickerSet);
            I1(str, tL_messages_stickerSet, (int) (System.currentTimeMillis() / 1000));
        }
        if (tL_messages_stickerSet2 == null) {
            tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.O.get(tL_messages_stickerSet.set.short_name);
        }
        byte b = 1;
        if (tL_messages_stickerSet2 == null) {
            tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.N.f(tL_messages_stickerSet.set.id);
            if (tL_messages_stickerSet2 != null) {
                z = true;
                if (tL_messages_stickerSet2 == null) {
                    if ("AnimatedEmojies".equals(tL_messages_stickerSet.set.short_name)) {
                        tL_messages_stickerSet2.documents = tL_messages_stickerSet.documents;
                        tL_messages_stickerSet2.packs = tL_messages_stickerSet.packs;
                        tL_messages_stickerSet2.set = tL_messages_stickerSet.set;
                        hl.c3(new mp6(this, tL_messages_stickerSet, b));
                        z2 = true;
                    } else {
                        zh6 zh6Var = new zh6();
                        int size = tL_messages_stickerSet.documents.size();
                        for (int i = 0; i < size; i++) {
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i);
                            zh6Var.k(document.id, document);
                        }
                        int size2 = tL_messages_stickerSet2.documents.size();
                        z2 = false;
                        for (int i2 = 0; i2 < size2; i2++) {
                            TLRPC.Document document2 = (TLRPC.Document) zh6Var.f(tL_messages_stickerSet2.documents.get(i2).id);
                            if (document2 != null) {
                                tL_messages_stickerSet2.documents.set(i2, document2);
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        if (z) {
                            getMessagesStorage().a.c(new mp6(this, tL_messages_stickerSet2, (byte) 2));
                            return;
                        }
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        int i3 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
                        ArrayList[] arrayListArr = this.H;
                        ArrayList arrayList = arrayListArr[i3];
                        int[] iArr = this.Z;
                        int i4 = iArr[i3];
                        long[] jArr = this.Y;
                        M1(i3, i4, jArr[i3], arrayList);
                        if ("AnimatedEmojies".equals(tL_messages_stickerSet.set.short_name)) {
                            M1(4, iArr[4], jArr[4], arrayListArr[4]);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        if (tL_messages_stickerSet2 == null) {
        }
    }

    public final TLRPC.DraftMessage T(long j, long j2) {
        zh6 zh6Var = (zh6) this.u1.f(j);
        if (zh6Var == null) {
            return null;
        }
        return (TLRPC.DraftMessage) zh6Var.f(j2);
    }

    public final void T0(boolean z) {
        this.F = true;
        if (z) {
            getMessagesStorage().a.c(new ip6(this, (byte) 18));
        } else {
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new fp6(this, (byte) 8));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x0240, code lost:
    
        if (r13.b == r14.b) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0256, code lost:
    
        if (r0.rejected == r9.rejected) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f4, code lost:
    
        if (r0.reply_to_msg_id == r9.reply_to_msg_id) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ee, code lost:
    
        if ((r13 == r14 ? true : (r13 == null || r14 == null) ? false : android.text.TextUtils.equals(ll9.h(r13, null), ll9.h(r14, null))) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0209, code lost:
    
        if (r0.story_id != r9.story_id) goto L165;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T1(long j, long j2, CharSequence charSequence, ArrayList arrayList, TLRPC.Message message, ou1 ou1Var, TLRPC.SuggestedPost suggestedPost, long j3, boolean z, boolean z2, TL_iv.RichMessage richMessage) {
        TLRPC.Message message2;
        int i;
        TLRPC.InputReplyTo inputReplyTo;
        boolean equals;
        TLRPC.Message message3 = (getMessagesController().v2(j) && j2 == 0) ? null : message;
        TLRPC.DraftMessage tL_draftMessageEmpty = (TextUtils.isEmpty(charSequence) && message3 == null && richMessage == null) ? new TLRPC.TL_draftMessageEmpty() : new TLRPC.TL_draftMessage();
        tL_draftMessageEmpty.rich_message = richMessage;
        tL_draftMessageEmpty.date = (int) (System.currentTimeMillis() / 1000);
        tL_draftMessageEmpty.message = charSequence == null ? "" : charSequence.toString();
        tL_draftMessageEmpty.no_webpage = z;
        if (j3 != 0) {
            tL_draftMessageEmpty.flags |= 128;
            tL_draftMessageEmpty.effect = j3;
        }
        if (message3 != null) {
            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
            tL_draftMessageEmpty.reply_to = tL_inputReplyToMessage;
            tL_draftMessageEmpty.flags |= 16;
            tL_inputReplyToMessage.reply_to_msg_id = message3.id;
            if (ou1Var != null) {
                boolean z3 = ou1Var.m;
                if (z3) {
                    ArrayList arrayList2 = ou1Var.n;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        tL_draftMessageEmpty.reply_to.quote_rich = new ArrayList<>(ou1Var.n);
                        TLRPC.InputReplyTo inputReplyTo2 = tL_draftMessageEmpty.reply_to;
                        inputReplyTo2.flags |= 16;
                        inputReplyTo2.quote_offset = z3 ? ou1Var.o : ou1Var.b;
                    }
                } else {
                    String str = ou1Var.i;
                    tL_inputReplyToMessage.quote_text = str;
                    if (str != null) {
                        tL_inputReplyToMessage.flags |= 20;
                        tL_inputReplyToMessage.quote_offset = ou1Var.b;
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList3 = ou1Var.j;
                    tL_inputReplyToMessage.quote_entities = arrayList3;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        tL_draftMessageEmpty.reply_to.quote_entities = new ArrayList<>(tL_draftMessageEmpty.reply_to.quote_entities);
                        tL_draftMessageEmpty.reply_to.flags |= 8;
                    }
                }
                r47 r47Var = ou1Var.a;
                if (r47Var != null && r47Var.k != null) {
                    TLRPC.Peer y1 = getMessagesController().y1(j);
                    TLRPC.Peer peer = ou1Var.a.k.peer_id;
                    if (!r47.u5(y1, peer)) {
                        TLRPC.InputReplyTo inputReplyTo3 = tL_draftMessageEmpty.reply_to;
                        inputReplyTo3.flags |= 2;
                        inputReplyTo3.reply_to_peer_id = getMessagesController().m1(peer);
                    }
                }
            } else if (j != r47.B0(message3)) {
                TLRPC.InputReplyTo inputReplyTo4 = tL_draftMessageEmpty.reply_to;
                inputReplyTo4.flags |= 2;
                inputReplyTo4.reply_to_peer_id = getMessagesController().m1(getMessagesController().y1(r47.B0(message3)));
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            tL_draftMessageEmpty.entities = arrayList;
            tL_draftMessageEmpty.flags |= 8;
        }
        TLRPC.Chat M0 = uc7.s1(this.currentAccount).M0(Long.valueOf(-j));
        if (xc2.p0(M0) && xc2.A(this.currentAccount, M0, 24)) {
            tL_draftMessageEmpty.flags |= 16;
            TLRPC.InputReplyTo inputReplyTo5 = tL_draftMessageEmpty.reply_to;
            if (inputReplyTo5 == null) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_draftMessageEmpty.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = getMessagesController().j1(j2);
            } else {
                inputReplyTo5.monoforum_peer_id = getMessagesController().j1(j2);
                tL_draftMessageEmpty.reply_to.flags |= 32;
            }
        }
        if (suggestedPost != null) {
            tL_draftMessageEmpty.suggested_post = suggestedPost;
        }
        zh6 zh6Var = (zh6) this.u1.f(j);
        TLRPC.DraftMessage draftMessage = zh6Var == null ? null : (TLRPC.DraftMessage) zh6Var.f(j2);
        if (!z2) {
            if (draftMessage == null) {
                message2 = message3;
                if (TextUtils.isEmpty(tL_draftMessageEmpty.message) && (((inputReplyTo = tL_draftMessageEmpty.reply_to) == null || inputReplyTo.reply_to_msg_id == 0) && tL_draftMessageEmpty.effect == 0 && tL_draftMessageEmpty.rich_message == null && tL_draftMessageEmpty.suggested_post == null)) {
                    return;
                }
            } else if (draftMessage.message.equals(tL_draftMessageEmpty.message)) {
                TLRPC.InputReplyTo inputReplyTo6 = draftMessage.reply_to;
                TLRPC.InputReplyTo inputReplyTo7 = tL_draftMessageEmpty.reply_to;
                if (inputReplyTo6 != inputReplyTo7) {
                    boolean z4 = inputReplyTo6 instanceof TLRPC.TL_inputReplyToMessage;
                    if (z4 == (inputReplyTo7 instanceof TLRPC.TL_inputReplyToMessage)) {
                        if (z4) {
                            if (r47.t5(inputReplyTo6.reply_to_peer_id, inputReplyTo7.reply_to_peer_id) && TextUtils.equals(inputReplyTo6.quote_text, inputReplyTo7.quote_text)) {
                                ArrayList<TL_iv.RichText> arrayList4 = inputReplyTo6.quote_rich;
                                if (arrayList4 != null || inputReplyTo7.quote_rich != null) {
                                    ArrayList<TL_iv.RichText> arrayList5 = inputReplyTo7.quote_rich;
                                }
                            }
                        } else if (inputReplyTo6 instanceof TLRPC.TL_inputReplyToStory) {
                            if (r47.t5(inputReplyTo6.peer, inputReplyTo7.peer)) {
                            }
                        }
                    }
                }
                TLRPC.SuggestedPost suggestedPost2 = draftMessage.suggested_post;
                TLRPC.SuggestedPost suggestedPost3 = tL_draftMessageEmpty.suggested_post;
                if (suggestedPost2 == suggestedPost3) {
                    message2 = message3;
                } else if ((suggestedPost2 == null) == (suggestedPost3 == null)) {
                    TL_stars.StarsAmount starsAmount = suggestedPost2.price;
                    TL_stars.StarsAmount starsAmount2 = suggestedPost3.price;
                    oj m = oj.m(starsAmount);
                    oj m2 = oj.m(starsAmount2);
                    if (m != m2) {
                        if (m == null || m2 == null || m.a != m2.a) {
                            message2 = message3;
                        } else {
                            message2 = message3;
                        }
                        if (suggestedPost2.schedule_date == suggestedPost3.schedule_date) {
                            if (suggestedPost2.accepted == suggestedPost3.accepted) {
                            }
                        }
                    }
                }
                TL_iv.RichMessage richMessage2 = draftMessage.rich_message;
                TL_iv.RichMessage richMessage3 = tL_draftMessageEmpty.rich_message;
                if (richMessage2 == richMessage3) {
                    equals = true;
                } else {
                    if ((richMessage2 == null) == (richMessage3 == null)) {
                        try {
                            SerializedData serializedData = new SerializedData(richMessage2.getObjectSize());
                            SerializedData serializedData2 = new SerializedData(richMessage3.getObjectSize());
                            richMessage2.serializeToStream(serializedData);
                            richMessage3.serializeToStream(serializedData2);
                            equals = Arrays.equals(serializedData.toByteArray(), serializedData2.toByteArray());
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                    }
                    equals = false;
                }
                if (equals && draftMessage.no_webpage == tL_draftMessageEmpty.no_webpage && draftMessage.effect == tL_draftMessageEmpty.effect) {
                    return;
                }
            }
            U1(j, j2, tL_draftMessageEmpty, message2, false);
            if (j2 != 0 || xc2.c0(M0) || xc2.p0(M0)) {
                if (wf3.B(j)) {
                    TLRPC.TL_messages_saveDraft tL_messages_saveDraft = new TLRPC.TL_messages_saveDraft();
                    tL_messages_saveDraft.peer = getMessagesController().j1(j);
                    tL_messages_saveDraft.message = tL_draftMessageEmpty.message;
                    tL_messages_saveDraft.no_webpage = tL_draftMessageEmpty.no_webpage;
                    tL_messages_saveDraft.reply_to = tL_draftMessageEmpty.reply_to;
                    tL_messages_saveDraft.suggested_post = tL_draftMessageEmpty.suggested_post;
                    tL_messages_saveDraft.entities = tL_draftMessageEmpty.entities;
                    TL_iv.RichMessage richMessage4 = tL_draftMessageEmpty.rich_message;
                    if (richMessage4 != null) {
                        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
                        tL_inputRichMessage.rtl = richMessage4.rtl;
                        tL_inputRichMessage.blocks = new ArrayList<>(richMessage4.blocks.size());
                        for (int i2 = 0; i2 < richMessage4.blocks.size(); i2++) {
                            tL_inputRichMessage.blocks.add(r7a.x0(richMessage4.blocks.get(i2)));
                        }
                        ArrayList<TLRPC.Photo> arrayList6 = richMessage4.photos;
                        if (arrayList6 != null && !arrayList6.isEmpty()) {
                            for (int i3 = 0; i3 < richMessage4.photos.size(); i3++) {
                                TLRPC.Photo photo = richMessage4.photos.get(i3);
                                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                tL_inputPhoto.id = photo.id;
                                tL_inputPhoto.access_hash = photo.access_hash;
                                byte[] bArr = photo.file_reference;
                                if (bArr == null) {
                                    bArr = new byte[0];
                                }
                                tL_inputPhoto.file_reference = bArr;
                                tL_inputRichMessage.photos.add(tL_inputPhoto);
                            }
                            tL_inputRichMessage.flags |= 4;
                        }
                        ArrayList<TLRPC.Document> arrayList7 = richMessage4.documents;
                        if (arrayList7 != null && !arrayList7.isEmpty()) {
                            for (int i4 = 0; i4 < richMessage4.documents.size(); i4++) {
                                TLRPC.Document document = richMessage4.documents.get(i4);
                                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                                tL_inputDocument.id = document.id;
                                tL_inputDocument.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                if (bArr2 == null) {
                                    bArr2 = new byte[0];
                                }
                                tL_inputDocument.file_reference = bArr2;
                                tL_inputRichMessage.documents.add(tL_inputDocument);
                            }
                            tL_inputRichMessage.flags |= 8;
                        }
                        tL_messages_saveDraft.rich_message = tL_inputRichMessage;
                    }
                    if ((tL_draftMessageEmpty.flags & 128) != 0) {
                        tL_messages_saveDraft.effect = tL_draftMessageEmpty.effect;
                        tL_messages_saveDraft.flags |= 128;
                    }
                    i = 0;
                    getConnectionsManager().sendRequest(tL_messages_saveDraft, new xe2(0 == true ? 1 : 0));
                } else {
                    i = 0;
                }
                getMessagesController().h5(null);
                getNotificationCenter().k(jn7.r, new Object[i]);
            }
            return;
        }
        message2 = message3;
        U1(j, j2, tL_draftMessageEmpty, message2, false);
        if (j2 != 0) {
        }
        if (wf3.B(j)) {
        }
        getMessagesController().h5(null);
        getNotificationCenter().k(jn7.r, new Object[i]);
    }

    public final gs6 U(long j, long j2) {
        if (!this.Q1) {
            Set<Map.Entry<String, ?>> entrySet = a.b.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).getAll().entrySet();
            this.R1.b();
            for (Map.Entry<String, ?> entry : entrySet) {
                String key = entry.getKey();
                String str = (String) entry.getValue();
                gs6 gs6Var = null;
                if (str != null) {
                    try {
                        if (str.startsWith("@")) {
                            String[] split = str.substring(1).split("\n");
                            if (split.length >= 6) {
                                gs6 gs6Var2 = new gs6();
                                gs6Var2.a = split[0];
                                gs6Var2.b = Long.parseLong(split[1]);
                                gs6Var2.c = Integer.parseInt(split[2]);
                                gs6Var2.d = Long.parseLong(split[3]);
                                if (split[4].contains(";")) {
                                    String[] split2 = split[4].split(";");
                                    gs6Var2.g = Integer.parseInt(split2[0]) != 0;
                                    gs6Var2.h = Float.parseFloat(split2[1]);
                                    gs6Var2.i = Float.parseFloat(split2[2]);
                                } else {
                                    gs6Var2.g = Integer.parseInt(split[4]) != 0;
                                    gs6Var2.h = 0.0f;
                                    gs6Var2.i = 1.0f;
                                }
                                int length = split.length - 5;
                                String[] strArr = new String[length];
                                for (int i = 0; i < length; i++) {
                                    strArr[i] = split[i + 5];
                                }
                                String join = TextUtils.join("\n", strArr);
                                gs6Var2.f = new short[join.length()];
                                int i2 = 0;
                                while (true) {
                                    short[] sArr = gs6Var2.f;
                                    if (i2 >= sArr.length) {
                                        break;
                                    }
                                    sArr[i2] = (short) join.charAt(i2);
                                    i2++;
                                }
                                gs6Var = gs6Var2;
                            }
                        }
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                }
                if (gs6Var != null) {
                    this.R1.k(Long.parseLong(key), gs6Var);
                }
            }
            this.Q1 = true;
        }
        return (gs6) this.R1.f(Objects.hash(Long.valueOf(j), Long.valueOf(j2)));
    }

    public final void U0(boolean z, Integer num) {
        this.w = true;
        if (z) {
            getMessagesStorage().a.c(new ip6(this, (byte) 15));
            return;
        }
        TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
        tL_messages_getAvailableReactions.hash = num != null ? num.intValue() : this.f;
        getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new fp6(this, (byte) 4));
    }

    public final void U1(final long j, final long j2, TLRPC.DraftMessage draftMessage, TLRPC.Message message, boolean z) {
        TLRPC.Message message2;
        String str;
        TLRPC.InputReplyTo inputReplyTo;
        TLRPC.Chat M0;
        String str2;
        if (getMessagesController().v2(j) && j2 == 0 && TextUtils.isEmpty(draftMessage.message)) {
            TLRPC.InputReplyTo inputReplyTo2 = draftMessage.reply_to;
            if (inputReplyTo2 instanceof TLRPC.TL_inputReplyToMessage) {
                ((TLRPC.TL_inputReplyToMessage) inputReplyTo2).reply_to_msg_id = 0;
            }
        }
        SharedPreferences sharedPreferences = this.w1;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        uc7 messagesController = getMessagesController();
        zh6 zh6Var = this.u1;
        zh6 zh6Var2 = this.v1;
        if (draftMessage == null || (draftMessage instanceof TLRPC.TL_draftMessageEmpty)) {
            zh6 zh6Var3 = (zh6) zh6Var.f(j);
            if (zh6Var3 != null) {
                zh6Var3.l(j2);
                if (zh6Var3.m() == 0) {
                    zh6Var.l(j);
                }
            }
            zh6 zh6Var4 = (zh6) zh6Var2.f(j);
            if (zh6Var4 != null) {
                zh6Var4.l(j2);
                if (zh6Var4.m() == 0) {
                    zh6Var2.l(j);
                }
            }
            if (j2 == 0) {
                sharedPreferences.edit().remove(String.valueOf(j)).remove("r_" + j).commit();
            } else {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                StringBuilder o = ik8.o(j, "t_", "_");
                o.append(j2);
                SharedPreferences.Editor remove = edit2.remove(o.toString());
                StringBuilder o2 = ik8.o(j, "rt_", "_");
                o2.append(j2);
                remove.remove(o2.toString()).commit();
            }
            zh6 zh6Var5 = messagesController.R;
            TLRPC.Dialog dialog = (TLRPC.Dialog) zh6Var5.f(j);
            if (dialog != null && dialog.top_message == 0) {
                zh6Var5.l(dialog.id);
                messagesController.y.remove(dialog);
            }
        } else {
            zh6 zh6Var6 = (zh6) zh6Var.f(j);
            if (zh6Var6 == null) {
                zh6Var6 = new zh6();
                zh6Var.k(j, zh6Var6);
            }
            zh6Var6.k(j2, draftMessage);
            if (j2 == 0) {
                messagesController.e4(j, draftMessage);
            }
            try {
                SerializedData serializedData = new SerializedData(draftMessage.getObjectSize());
                draftMessage.serializeToStream(serializedData);
                if (j2 == 0) {
                    str2 = String.valueOf(j);
                } else {
                    str2 = "t_" + j + "_" + j2;
                }
                edit.putString(str2, Utilities.f(serializedData.toByteArray()));
                serializedData.cleanup();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        zh6 zh6Var7 = (zh6) zh6Var2.f(j);
        TLRPC.User user = null;
        if (message != null || draftMessage == null || draftMessage.reply_to == null) {
            if (draftMessage != null && draftMessage.reply_to == null) {
                message2 = null;
            }
            message2 = message;
        } else {
            if (zh6Var7 != null) {
                message2 = (TLRPC.Message) zh6Var7.f(j2);
            }
            message2 = message;
        }
        if (message2 == null) {
            if (zh6Var7 != null) {
                zh6Var7.l(j2);
                if (zh6Var7.m() == 0) {
                    zh6Var2.l(j);
                }
            }
            if (j2 == 0) {
                edit.remove("r_" + j);
            } else {
                StringBuilder o3 = ik8.o(j, "rt_", "_");
                o3.append(j2);
                edit.remove(o3.toString());
            }
        } else {
            if (zh6Var7 == null) {
                zh6Var7 = new zh6();
                zh6Var2.k(j, zh6Var7);
            }
            zh6Var7.k(j2, message2);
            try {
                SerializedData serializedData2 = new SerializedData(message2.getObjectSize());
                message2.serializeToStream(serializedData2);
                if (j2 == 0) {
                    str = "r_" + j;
                } else {
                    str = "rt_" + j + "_" + j2;
                }
                edit.putString(str, Utilities.f(serializedData2.toByteArray()));
                serializedData2.cleanup();
            } catch (Exception e3) {
                cc4.g(e3, true);
            }
        }
        edit.commit();
        if (z) {
            if (j2 == 0 || getMessagesController().v2(j)) {
                if (draftMessage != null && (inputReplyTo = draftMessage.reply_to) != null && inputReplyTo.reply_to_msg_id != 0 && (message2 == null || ((message2.reply_to instanceof TLRPC.TL_messageReplyHeader) && message2.replyMessage == null))) {
                    final long m = (inputReplyTo.flags & 2) != 0 ? wf3.m(inputReplyTo.reply_to_peer_id) : j;
                    if (wf3.D(m)) {
                        user = getMessagesController().X1(Long.valueOf(m));
                        M0 = null;
                    } else {
                        M0 = getMessagesController().M0(Long.valueOf(-m));
                    }
                    if (user != null || M0 != null) {
                        final long j3 = xc2.T(M0) ? M0.id : 0L;
                        final int i = draftMessage.reply_to.reply_to_msg_id;
                        getMessagesStorage().a.c(new Runnable() { // from class: yr6
                            @Override // java.lang.Runnable
                            public final void run() {
                                TLRPC.Message message3;
                                NativeByteBuffer byteBufferValue;
                                final ls6 ls6Var = ls6.this;
                                int i2 = i;
                                long j4 = m;
                                try {
                                    SQLiteDatabase sQLiteDatabase = ls6Var.getMessagesStorage().b;
                                    Locale locale = Locale.US;
                                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, replydata FROM messages_v2 WHERE mid = " + i2 + " and uid = " + j4, new Object[0]);
                                    TLRPC.Message message4 = null;
                                    if (queryFinalized.next()) {
                                        NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(0);
                                        if (byteBufferValue2 != null) {
                                            message3 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                            message3.readAttachPath(byteBufferValue2, ls6Var.getUserConfig().n);
                                            byteBufferValue2.reuse();
                                        } else {
                                            message3 = null;
                                        }
                                        if (message3 != null) {
                                            ArrayList arrayList = new ArrayList();
                                            ArrayList arrayList2 = new ArrayList();
                                            zh6 zh6Var8 = new zh6();
                                            zh6 zh6Var9 = new zh6();
                                            try {
                                                TLRPC.MessageReplyHeader messageReplyHeader = message3.reply_to;
                                                if (messageReplyHeader != null && messageReplyHeader.reply_to_msg_id != 0) {
                                                    if (!queryFinalized.isNull(1) && (byteBufferValue = queryFinalized.byteBufferValue(1)) != null) {
                                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                        message3.replyMessage = TLdeserialize;
                                                        TLdeserialize.readAttachPath(byteBufferValue, ls6Var.getUserConfig().n);
                                                        byteBufferValue.reuse();
                                                        TLRPC.Message message5 = message3.replyMessage;
                                                        if (message5 != null) {
                                                            kf7.d(message5, arrayList, arrayList2, null);
                                                        }
                                                    }
                                                    if (message3.replyMessage == null) {
                                                        kf7.c(message3, zh6Var8, zh6Var9);
                                                    }
                                                }
                                            } catch (Exception e4) {
                                                ls6Var.getMessagesStorage().p(e4, true);
                                            }
                                            ls6Var.getMessagesStorage().K0(zh6Var8, zh6Var9, arrayList, arrayList2, 0);
                                        }
                                        message4 = message3;
                                    }
                                    queryFinalized.dispose();
                                    final long j5 = j;
                                    final long j6 = j2;
                                    if (message4 != null) {
                                        hl.c3(new o30((Object) ls6Var, j5, j6, (Object) message4, (byte) 7));
                                        return;
                                    }
                                    long j7 = j3;
                                    if (j7 == 0) {
                                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                        tL_messages_getMessages.id.add(Integer.valueOf(i2));
                                        final byte b = 1;
                                        ls6Var.getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: nq6
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                TLRPC.Message message6;
                                                TLRPC.Message message7;
                                                switch (b) {
                                                    case 0:
                                                        if (tL_error == null) {
                                                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                            if (!messages_messages.messages.isEmpty() && (message6 = messages_messages.messages.get(0)) != null) {
                                                                hl.c3(new o30((Object) ls6Var, j5, j6, (Object) message6, (byte) 7));
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        if (tL_error == null) {
                                                            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                                                            if (!messages_messages2.messages.isEmpty() && (message7 = messages_messages2.messages.get(0)) != null) {
                                                                hl.c3(new o30((Object) ls6Var, j5, j6, (Object) message7, (byte) 7));
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                    tL_channels_getMessages.channel = ls6Var.getMessagesController().h1(j7);
                                    tL_channels_getMessages.id.add(Integer.valueOf(i2));
                                    final byte b3 = 0;
                                    ls6Var.getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: nq6
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            TLRPC.Message message6;
                                            TLRPC.Message message7;
                                            switch (b3) {
                                                case 0:
                                                    if (tL_error == null) {
                                                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                        if (!messages_messages.messages.isEmpty() && (message6 = messages_messages.messages.get(0)) != null) {
                                                            hl.c3(new o30((Object) ls6Var, j5, j6, (Object) message6, (byte) 7));
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    if (tL_error == null) {
                                                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                                                        if (!messages_messages2.messages.isEmpty() && (message7 = messages_messages2.messages.get(0)) != null) {
                                                            hl.c3(new o30((Object) ls6Var, j5, j6, (Object) message7, (byte) 7));
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } catch (Exception e5) {
                                    cc4.g(e5, true);
                                }
                            }
                        });
                    }
                }
                getNotificationCenter().k(jn7.W0, Long.valueOf(j));
            }
        }
    }

    public final TLRPC.Document V(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String replace = charSequence.toString().replace("️", "");
        ArrayList t0 = t0(4);
        int size = t0.size();
        for (int i = 0; i < size; i++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) t0.get(i);
            int size2 = tL_messages_stickerSet.packs.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i2);
                if (!tL_stickerPack.documents.isEmpty() && TextUtils.equals(tL_stickerPack.emoticon, replace)) {
                    return (TLRPC.Document) this.I[4].f(tL_stickerPack.documents.get(0).longValue());
                }
            }
        }
        return null;
    }

    public final void W(String[] strArr, String str, boolean z, is6 is6Var, boolean z2) {
        X(strArr, str, z, is6Var, z2, false, false, false, null);
    }

    public final void W0(boolean z) {
        if (this.I1) {
            return;
        }
        if (!this.J1 || z) {
            final byte b = 0;
            final SharedPreferences k = bp1.k(new StringBuilder("recent_reactions_"), this.currentAccount, a.b, 0);
            final SharedPreferences k2 = bp1.k(new StringBuilder("top_reactions_"), this.currentAccount, a.b, 0);
            this.F1.clear();
            this.G1.clear();
            this.F1.addAll(V0(k));
            this.G1.addAll(V0(k2));
            final byte b3 = 1;
            this.I1 = true;
            this.J1 = true;
            final boolean[] zArr = new boolean[2];
            TLRPC.TL_messages_getRecentReactions tL_messages_getRecentReactions = new TLRPC.TL_messages_getRecentReactions();
            tL_messages_getRecentReactions.hash = k.getLong("hash", 0L);
            tL_messages_getRecentReactions.limit = 50;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getRecentReactions, new RequestDelegate(this) { // from class: br6
                public final /* synthetic */ ls6 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (b) {
                        case 0:
                            final byte b4 = 0;
                            final ls6 ls6Var = this.b;
                            final SharedPreferences sharedPreferences = k;
                            final boolean[] zArr2 = zArr;
                            hl.c3(new Runnable() { // from class: qr6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b5 = b4;
                                    boolean[] zArr3 = zArr2;
                                    SharedPreferences sharedPreferences2 = sharedPreferences;
                                    TLObject tLObject2 = tLObject;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    ls6 ls6Var2 = ls6Var;
                                    switch (b5) {
                                        case 0:
                                            ArrayList arrayList = ls6Var2.F1;
                                            if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_messages_reactions)) {
                                                TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                arrayList.clear();
                                                arrayList.addAll(tL_messages_reactions.reactions);
                                                ls6.V1(sharedPreferences2, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                            }
                                            zArr3[0] = true;
                                            if (zArr3[1]) {
                                                ls6Var2.I1 = false;
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList2 = ls6Var2.G1;
                                            if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_messages_reactions)) {
                                                TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject2;
                                                arrayList2.clear();
                                                arrayList2.addAll(tL_messages_reactions2.reactions);
                                                ls6.V1(sharedPreferences2, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                            }
                                            zArr3[1] = true;
                                            if (zArr3[0]) {
                                                ls6Var2.I1 = false;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final byte b5 = 1;
                            final ls6 ls6Var2 = this.b;
                            final SharedPreferences sharedPreferences2 = k;
                            final boolean[] zArr3 = zArr;
                            hl.c3(new Runnable() { // from class: qr6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b52 = b5;
                                    boolean[] zArr32 = zArr3;
                                    SharedPreferences sharedPreferences22 = sharedPreferences2;
                                    TLObject tLObject2 = tLObject;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    ls6 ls6Var22 = ls6Var2;
                                    switch (b52) {
                                        case 0:
                                            ArrayList arrayList = ls6Var22.F1;
                                            if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_messages_reactions)) {
                                                TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                arrayList.clear();
                                                arrayList.addAll(tL_messages_reactions.reactions);
                                                ls6.V1(sharedPreferences22, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                            }
                                            zArr32[0] = true;
                                            if (zArr32[1]) {
                                                ls6Var22.I1 = false;
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList2 = ls6Var22.G1;
                                            if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_messages_reactions)) {
                                                TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject2;
                                                arrayList2.clear();
                                                arrayList2.addAll(tL_messages_reactions2.reactions);
                                                ls6.V1(sharedPreferences22, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                            }
                                            zArr32[1] = true;
                                            if (zArr32[0]) {
                                                ls6Var22.I1 = false;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            TLRPC.TL_messages_getTopReactions tL_messages_getTopReactions = new TLRPC.TL_messages_getTopReactions();
            tL_messages_getTopReactions.hash = k2.getLong("hash", 0L);
            tL_messages_getTopReactions.limit = 100;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getTopReactions, new RequestDelegate(this) { // from class: br6
                public final /* synthetic */ ls6 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (b3) {
                        case 0:
                            final byte b4 = 0;
                            final ls6 ls6Var = this.b;
                            final SharedPreferences sharedPreferences = k2;
                            final boolean[] zArr2 = zArr;
                            hl.c3(new Runnable() { // from class: qr6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b52 = b4;
                                    boolean[] zArr32 = zArr2;
                                    SharedPreferences sharedPreferences22 = sharedPreferences;
                                    TLObject tLObject2 = tLObject;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    ls6 ls6Var22 = ls6Var;
                                    switch (b52) {
                                        case 0:
                                            ArrayList arrayList = ls6Var22.F1;
                                            if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_messages_reactions)) {
                                                TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                arrayList.clear();
                                                arrayList.addAll(tL_messages_reactions.reactions);
                                                ls6.V1(sharedPreferences22, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                            }
                                            zArr32[0] = true;
                                            if (zArr32[1]) {
                                                ls6Var22.I1 = false;
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList2 = ls6Var22.G1;
                                            if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_messages_reactions)) {
                                                TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject2;
                                                arrayList2.clear();
                                                arrayList2.addAll(tL_messages_reactions2.reactions);
                                                ls6.V1(sharedPreferences22, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                            }
                                            zArr32[1] = true;
                                            if (zArr32[0]) {
                                                ls6Var22.I1 = false;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final byte b5 = 1;
                            final ls6 ls6Var2 = this.b;
                            final SharedPreferences sharedPreferences2 = k2;
                            final boolean[] zArr3 = zArr;
                            hl.c3(new Runnable() { // from class: qr6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b52 = b5;
                                    boolean[] zArr32 = zArr3;
                                    SharedPreferences sharedPreferences22 = sharedPreferences2;
                                    TLObject tLObject2 = tLObject;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    ls6 ls6Var22 = ls6Var2;
                                    switch (b52) {
                                        case 0:
                                            ArrayList arrayList = ls6Var22.F1;
                                            if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_messages_reactions)) {
                                                TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                arrayList.clear();
                                                arrayList.addAll(tL_messages_reactions.reactions);
                                                ls6.V1(sharedPreferences22, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                            }
                                            zArr32[0] = true;
                                            if (zArr32[1]) {
                                                ls6Var22.I1 = false;
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList2 = ls6Var22.G1;
                                            if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_messages_reactions)) {
                                                TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject2;
                                                arrayList2.clear();
                                                arrayList2.addAll(tL_messages_reactions2.reactions);
                                                ls6.V1(sharedPreferences22, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                            }
                                            zArr32[1] = true;
                                            if (zArr32[0]) {
                                                ls6Var22.I1 = false;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
    }

    public final void W1(zh6 zh6Var, ArrayList arrayList, boolean z) {
        getMessagesStorage().a.c(new lg((Object) this, z, (Object) arrayList, (Object) zh6Var, (byte) 26));
    }

    public final void X(final String[] strArr, final String str, final boolean z, final is6 is6Var, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final Integer num) {
        if (TextUtils.isEmpty(str) || strArr == null) {
            is6Var.b(null, new ArrayList());
        } else {
            final ArrayList arrayList = new ArrayList(pv3.i);
            getMessagesStorage().a.c(new Runnable() { // from class: wq6
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:82:0x0168  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x0178  */
                /* JADX WARN: Type inference failed for: r11v14, types: [org.telegram.SQLite.SQLiteDatabase] */
                /* JADX WARN: Type inference failed for: r13v17 */
                /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ls6, rf0] */
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String[]] */
                /* JADX WARN: Type inference failed for: r2v1 */
                /* JADX WARN: Type inference failed for: r2v2 */
                /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List] */
                /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    String str2;
                    SQLiteCursor queryFinalized;
                    ?? r1 = ls6.this;
                    ?? r2 = strArr;
                    is6 is6Var2 = is6Var;
                    ArrayList arrayList2 = new ArrayList();
                    HashMap hashMap = new HashMap();
                    String str3 = null;
                    boolean z6 = false;
                    for (?? r0 : r2) {
                        try {
                            SQLiteCursor queryFinalized2 = r1.getMessagesStorage().b.queryFinalized("SELECT alias FROM emoji_keywords_info_v2 WHERE lang = ?", new Object[]{r0});
                            if (queryFinalized2.next()) {
                                str3 = queryFinalized2.stringValue(0);
                            }
                            queryFinalized2.dispose();
                            if (str3 != null) {
                                z6 = true;
                            }
                        } catch (Exception e) {
                            e = e;
                            r2 = arrayList2;
                        }
                    }
                    try {
                    } catch (Exception e3) {
                        e = e3;
                        cc4.g(e, true);
                        Collections.sort(r2, new c52(arrayList, (byte) 3));
                        if (z2) {
                        }
                    }
                    if (!z6) {
                        hl.c3(new g65(r1, r2, is6Var2, arrayList2, (byte) 27));
                        return;
                    }
                    r2 = arrayList2;
                    boolean z7 = z4;
                    String str4 = str;
                    if (z7) {
                        int[] iArr = new int[1];
                        ArrayList j = pv3.j(str4, iArr);
                        if (iArr[0] > 0) {
                            for (int i = 0; i < j.size(); i++) {
                                String charSequence = ((nv3) j.get(i)).c.toString();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= r2.size()) {
                                        hs6 hs6Var = new hs6();
                                        hs6Var.a = charSequence;
                                        hs6Var.b = "";
                                        r2.add(hs6Var);
                                        break;
                                    }
                                    if (!TextUtils.equals(((hs6) r2.get(i2)).a, charSequence)) {
                                        i2++;
                                    }
                                }
                            }
                        }
                    }
                    String lowerCase = str4.toLowerCase();
                    for (int i3 = 0; i3 < 2; i3++) {
                        if (i3 == 1) {
                            String S0 = ob6.D0().S0(lowerCase, false, false);
                            if (!S0.equals(lowerCase)) {
                                lowerCase = S0;
                            }
                        }
                        StringBuilder sb = new StringBuilder(lowerCase);
                        int length = sb.length();
                        while (true) {
                            if (length <= 0) {
                                str2 = null;
                                break;
                            }
                            length--;
                            char charAt = (char) (sb.charAt(length) + 1);
                            sb.setCharAt(length, charAt);
                            if (charAt != 0) {
                                str2 = sb.toString();
                                break;
                            }
                        }
                        if (z) {
                            queryFinalized = r1.getMessagesStorage().b.queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword = ?", lowerCase);
                        } else if (str2 != null) {
                            queryFinalized = r1.getMessagesStorage().b.queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword >= ? AND keyword < ?", lowerCase, str2);
                        } else {
                            lowerCase = lowerCase + "%";
                            queryFinalized = r1.getMessagesStorage().b.queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword LIKE ?", lowerCase);
                        }
                        while (queryFinalized.next()) {
                            String replace = queryFinalized.stringValue(0).replace("️", "");
                            if (hashMap.get(replace) == null) {
                                hashMap.put(replace, Boolean.TRUE);
                                hs6 hs6Var2 = new hs6();
                                hs6Var2.a = replace;
                                hs6Var2.b = queryFinalized.stringValue(1);
                                r2.add(hs6Var2);
                            }
                        }
                        queryFinalized.dispose();
                    }
                    Collections.sort(r2, new c52(arrayList, (byte) 3));
                    if (z2) {
                        hl.c3(new hr6(is6Var2, r2, str3, (byte) 1));
                    } else {
                        r1.Q(r2, num, z3, z5, new hr6(is6Var2, r2, str3, (byte) 0));
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x001e, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x001c, code lost:
    
        if (r7.i0[r11] != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r7.l0 != false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [org.telegram.tgnet.TLRPC$TL_messages_getFavedStickers] */
    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.tgnet.TLRPC$TL_messages_getStickers] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [org.telegram.tgnet.TLRPC$TL_messages_getStickers] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X0(boolean z, boolean z2, boolean z3, int i) {
        ?? tL_messages_getStickers;
        TLRPC.TL_messages_getRecentStickers tL_messages_getRecentStickers;
        boolean[] zArr = this.h0;
        boolean z4 = false;
        byte b = 1;
        if (z) {
            if (this.k0) {
                return;
            } else {
                this.k0 = true;
            }
        } else if (zArr[i]) {
            return;
        } else {
            zArr[i] = true;
        }
        if (z2) {
            getMessagesStorage().a.c(new wr6(this, z, i, z4 ? 1 : 0));
            return;
        }
        SharedPreferences sharedPreferences = uc7.s1(this.currentAccount).Z3;
        if (!z3) {
            if (Math.abs(System.currentTimeMillis() - (z ? sharedPreferences.getLong("lastGifLoadTime", 0L) : i == 0 ? sharedPreferences.getLong("lastStickersLoadTime", 0L) : i == 1 ? sharedPreferences.getLong("lastStickersLoadTimeMask", 0L) : i == 3 ? sharedPreferences.getLong("lastStickersLoadTimeGreet", 0L) : i == 5 ? sharedPreferences.getLong("lastStickersLoadTimeEmojiPacks", 0L) : i == 7 ? sharedPreferences.getLong("lastStickersLoadTimePremiumStickers", 0L) : sharedPreferences.getLong("lastStickersLoadTimeFavs", 0L))) < 3600000) {
                if (z) {
                    this.k0 = false;
                    return;
                } else {
                    zArr[i] = false;
                    return;
                }
            }
        }
        if (z) {
            TLRPC.TL_messages_getSavedGifs tL_messages_getSavedGifs = new TLRPC.TL_messages_getSavedGifs();
            tL_messages_getSavedGifs.hash = p(jn7.d3, this.j0);
            getConnectionsManager().sendRequest(tL_messages_getSavedGifs, new kr6(this, i, b));
            return;
        }
        byte b3 = 2;
        ArrayList[] arrayListArr = this.g0;
        if (i == 2) {
            ?? tL_messages_getFavedStickers = new TLRPC.TL_messages_getFavedStickers();
            tL_messages_getFavedStickers.hash = p(jn7.d3, arrayListArr[i]);
            tL_messages_getRecentStickers = tL_messages_getFavedStickers;
        } else {
            if (i == 3) {
                tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = "👋".concat(pv3.c("⭐"));
                tL_messages_getStickers.hash = p(jn7.d3, arrayListArr[i]);
            } else if (i == 7) {
                tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = "📂".concat(pv3.c("⭐"));
                tL_messages_getStickers.hash = p(jn7.d3, arrayListArr[i]);
            } else {
                TLRPC.TL_messages_getRecentStickers tL_messages_getRecentStickers2 = new TLRPC.TL_messages_getRecentStickers();
                tL_messages_getRecentStickers2.hash = p(jn7.d3, arrayListArr[i]);
                tL_messages_getRecentStickers2.attached = i == 1;
                tL_messages_getRecentStickers = tL_messages_getRecentStickers2;
            }
            tL_messages_getRecentStickers = tL_messages_getStickers;
        }
        getConnectionsManager().sendRequest(tL_messages_getRecentStickers, new kr6(this, i, b3));
    }

    public final void X1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
            return;
        }
        getMessagesStorage().a.c(new mp6(this, tL_messages_stickerSet, (byte) 3));
        if (this.K0) {
            return;
        }
        this.K0 = true;
        getMessagesStorage().a.c(new ip6(this, (byte) 4));
    }

    public final ArrayList Y(CharSequence[] charSequenceArr, boolean z, boolean z2) {
        int i;
        boolean z3;
        int i2;
        int i3;
        byte b = 0;
        ArrayList arrayList = null;
        if (charSequenceArr[0] == null) {
            return null;
        }
        int i4 = -1;
        int i5 = -1;
        boolean z4 = false;
        int i6 = 0;
        while (true) {
            if (!z2) {
                break;
            }
            int indexOf = TextUtils.indexOf(charSequenceArr[0], !z4 ? "`" : "```", i6);
            if (indexOf == i4) {
                break;
            }
            if (i5 == i4) {
                z4 = charSequenceArr[0].length() - indexOf > 2 && charSequenceArr[0].charAt(indexOf + 1) == '`' && charSequenceArr[0].charAt(indexOf + 2) == '`';
                i5 = indexOf;
                i6 = indexOf + (z4 ? 3 : 1);
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (int i7 = (z4 ? 3 : 1) + indexOf; i7 < charSequenceArr[0].length() && charSequenceArr[0].charAt(i7) == '`'; i7++) {
                    indexOf++;
                }
                int i8 = (z4 ? 3 : 1) + indexOf;
                if (z4) {
                    char charAt = i5 > 0 ? charSequenceArr[0].charAt(i5 - 1) : (char) 0;
                    int i9 = (charAt == ' ' || charAt == '\n') ? 1 : 0;
                    int i10 = i5 + 3;
                    int indexOf2 = TextUtils.indexOf(charSequenceArr[0], '\n', i10);
                    String str = "";
                    String substring = (indexOf2 < 0 || indexOf2 - i10 <= 0) ? "" : charSequenceArr[0].toString().substring(i10, indexOf2);
                    CharSequence f22 = f2(0, i5 - i9, charSequenceArr[0]);
                    int length = substring.length() + i10 + (!substring.isEmpty());
                    if (length >= 0 && length < charSequenceArr[0].length() && length <= indexOf) {
                        CharSequence f23 = f2(length, indexOf, charSequenceArr[0]);
                        int i11 = indexOf + 3;
                        char charAt2 = i11 < charSequenceArr[0].length() ? charSequenceArr[0].charAt(i11) : (char) 0;
                        CharSequence charSequence = charSequenceArr[0];
                        CharSequence f24 = f2(i11 + ((charAt2 == ' ' || charAt2 == '\n') ? 1 : 0), charSequence.length(), charSequence);
                        if (f22.length() != 0) {
                            f22 = hl.C(f22, "\n");
                        } else {
                            i9 = 1;
                        }
                        if (f24.length() > 0 && f24.charAt(0) != '\n') {
                            f24 = hl.C("\n", f24);
                        }
                        if (f23.length() <= 0 || f23.charAt(f23.length() - 1) != '\n') {
                            i3 = 0;
                        } else {
                            f23 = f2(0, f23.length() - 1, f23);
                            i3 = 1;
                        }
                        if (!TextUtils.isEmpty(f23)) {
                            if (f23.length() > 1 && f23.charAt(0) == '\n') {
                                f23 = f23.subSequence(1, f23.length());
                                indexOf--;
                            }
                            charSequenceArr[0] = hl.C(f22, f23, f24);
                            TLRPC.TL_messageEntityPre tL_messageEntityPre = new TLRPC.TL_messageEntityPre();
                            int i12 = i9 ^ 1;
                            tL_messageEntityPre.offset = i5 + i12;
                            tL_messageEntityPre.length = ((((indexOf - i5) - 3) - (substring.length() + (!substring.isEmpty()))) + i12) - i3;
                            if (!TextUtils.isEmpty(substring) && substring.trim().length() != 0) {
                                str = substring;
                            }
                            tL_messageEntityPre.language = str;
                            arrayList.add(tL_messageEntityPre);
                            i8 -= 6;
                        }
                        i6 = i8;
                        z4 = false;
                        i4 = -1;
                        i5 = -1;
                    }
                    i6 = i8;
                    i4 = -1;
                } else {
                    int i13 = i5 + 1;
                    if (i13 != indexOf) {
                        CharSequence charSequence2 = charSequenceArr[0];
                        if (!(charSequence2 instanceof Spanned) || ((jk2[]) ((Spanned) charSequence2).getSpans(Utilities.j(i5, charSequence2.length(), 0), Utilities.j(i13, charSequenceArr[0].length(), 0), jk2.class)).length <= 0) {
                            CharSequence f25 = f2(0, i5, charSequenceArr[0]);
                            CharSequence f26 = f2(i13, indexOf, charSequenceArr[0]);
                            CharSequence charSequence3 = charSequenceArr[0];
                            charSequenceArr[0] = hl.C(f25, f26, f2(indexOf + 1, charSequence3.length(), charSequence3));
                            TLRPC.TL_messageEntityCode tL_messageEntityCode = new TLRPC.TL_messageEntityCode();
                            tL_messageEntityCode.offset = i5;
                            tL_messageEntityCode.length = (indexOf - i5) - 1;
                            arrayList.add(tL_messageEntityCode);
                            i8 -= 2;
                        } else {
                            i6 = i8;
                            i4 = -1;
                        }
                    }
                    i6 = i8;
                    z4 = false;
                    i4 = -1;
                    i5 = -1;
                }
            }
        }
        if (i5 != i4 && z4) {
            CharSequence f27 = f2(0, i5, charSequenceArr[0]);
            CharSequence charSequence4 = charSequenceArr[0];
            charSequenceArr[0] = hl.C(f27, f2(i5 + 2, charSequence4.length(), charSequence4));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            TLRPC.TL_messageEntityCode tL_messageEntityCode2 = new TLRPC.TL_messageEntityCode();
            tL_messageEntityCode2.offset = i5;
            tL_messageEntityCode2.length = 1;
            arrayList.add(tL_messageEntityCode2);
        }
        CharSequence charSequence5 = charSequenceArr[0];
        if (charSequence5 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence5;
            smb[] smbVarArr = (smb[]) spanned.getSpans(0, charSequence5.length(), smb.class);
            if (smbVarArr != null && smbVarArr.length > 0) {
                for (smb smbVar : smbVarArr) {
                    int spanStart = spanned.getSpanStart(smbVar);
                    int spanEnd = spanned.getSpanEnd(smbVar);
                    if (!A(spanStart, arrayList, false) && !A(spanEnd, arrayList, true)) {
                        if (arrayList != null && !arrayList.isEmpty()) {
                            int size = arrayList.size();
                            for (0; i2 < size; i2 + 1) {
                                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i2);
                                int i14 = messageEntity.offset;
                                i2 = (i14 <= spanStart || i14 + messageEntity.length > spanEnd) ? i2 + 1 : 0;
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        e(smbVar.b.a, spanStart, spanEnd, arrayList);
                    }
                }
            }
            i8c[] i8cVarArr = (i8c[]) spanned.getSpans(0, charSequenceArr[0].length(), i8c.class);
            if (i8cVarArr != null && i8cVarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (int i15 = 0; i15 < i8cVarArr.length; i15++) {
                    TLRPC.TL_inputMessageEntityMentionName tL_inputMessageEntityMentionName = new TLRPC.TL_inputMessageEntityMentionName();
                    uc7 messagesController = getMessagesController();
                    tL_inputMessageEntityMentionName.user_id = messagesController.q1(messagesController.X1(Utilities.A(i8cVarArr[i15].getURL())));
                    tL_inputMessageEntityMentionName.offset = spanned.getSpanStart(i8cVarArr[i15]);
                    tL_inputMessageEntityMentionName.length = Math.min(spanned.getSpanEnd(i8cVarArr[i15]), charSequenceArr[0].length()) - tL_inputMessageEntityMentionName.offset;
                    if (charSequenceArr[0].charAt((r10 + r7) - 1) == ' ') {
                        tL_inputMessageEntityMentionName.length--;
                    }
                    arrayList.add(tL_inputMessageEntityMentionName);
                }
            }
            h8c[] h8cVarArr = (h8c[]) spanned.getSpans(0, charSequenceArr[0].length(), h8c.class);
            if (h8cVarArr != null && h8cVarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (int i16 = 0; i16 < h8cVarArr.length; i16++) {
                    TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                    tL_messageEntityTextUrl.offset = spanned.getSpanStart(h8cVarArr[i16]);
                    tL_messageEntityTextUrl.length = Math.min(spanned.getSpanEnd(h8cVarArr[i16]), charSequenceArr[0].length()) - tL_messageEntityTextUrl.offset;
                    tL_messageEntityTextUrl.url = h8cVarArr[i16].getURL();
                    arrayList.add(tL_messageEntityTextUrl);
                    rmb rmbVar = h8cVarArr[i16].a;
                    if (rmbVar != null) {
                        int i17 = rmbVar.a;
                        int i18 = tL_messageEntityTextUrl.offset;
                        e(i17, i18, tL_messageEntityTextUrl.length + i18, arrayList);
                    }
                }
            }
            hm[] hmVarArr = (hm[]) spanned.getSpans(0, charSequenceArr[0].length(), hm.class);
            if (hmVarArr != null && hmVarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (hm hmVar : hmVarArr) {
                    if (hmVar != null) {
                        try {
                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                            tL_messageEntityCustomEmoji.offset = spanned.getSpanStart(hmVar);
                            tL_messageEntityCustomEmoji.length = Math.min(spanned.getSpanEnd(hmVar), charSequenceArr[0].length()) - tL_messageEntityCustomEmoji.offset;
                            tL_messageEntityCustomEmoji.document_id = hmVar.getDocumentId();
                            tL_messageEntityCustomEmoji.document = hmVar.document;
                            arrayList.add(tL_messageEntityCustomEmoji);
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                    }
                }
            }
            jk2[] jk2VarArr = (jk2[]) spanned.getSpans(0, charSequenceArr[0].length(), jk2.class);
            if (jk2VarArr != null && jk2VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (jk2 jk2Var : jk2VarArr) {
                    if (jk2Var != null) {
                        try {
                            TLRPC.TL_messageEntityPre tL_messageEntityPre2 = new TLRPC.TL_messageEntityPre();
                            tL_messageEntityPre2.offset = spanned.getSpanStart(jk2Var);
                            tL_messageEntityPre2.length = Math.min(spanned.getSpanEnd(jk2Var), charSequenceArr[0].length()) - tL_messageEntityPre2.offset;
                            tL_messageEntityPre2.language = jk2Var.a;
                            arrayList.add(tL_messageEntityPre2);
                        } catch (Exception e3) {
                            cc4.g(e3, true);
                        }
                    }
                }
            }
            r19[] r19VarArr = (r19[]) spanned.getSpans(0, charSequenceArr[0].length(), r19.class);
            if (r19VarArr != null && r19VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (r19 r19Var : r19VarArr) {
                    if (r19Var != null) {
                        try {
                            TLRPC.TL_messageEntityBlockquote tL_messageEntityBlockquote = new TLRPC.TL_messageEntityBlockquote();
                            tL_messageEntityBlockquote.offset = spanned.getSpanStart(r19Var);
                            tL_messageEntityBlockquote.length = Math.min(spanned.getSpanEnd(r19Var), charSequenceArr[0].length()) - tL_messageEntityBlockquote.offset;
                            tL_messageEntityBlockquote.collapsed = r19Var.e;
                            arrayList.add(tL_messageEntityBlockquote);
                        } catch (Exception e4) {
                            cc4.g(e4, true);
                        }
                    }
                }
            }
            no4[] no4VarArr = (no4[]) spanned.getSpans(0, charSequenceArr[0].length(), no4.class);
            if (no4VarArr != null && no4VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (no4 no4Var : no4VarArr) {
                    if (no4Var != null) {
                        try {
                            TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                            tL_messageEntityFormattedDate.offset = spanned.getSpanStart(no4Var);
                            tL_messageEntityFormattedDate.length = Math.min(spanned.getSpanEnd(no4Var), charSequenceArr[0].length()) - tL_messageEntityFormattedDate.offset;
                            TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate2 = no4Var.b;
                            tL_messageEntityFormattedDate.relative = tL_messageEntityFormattedDate2.relative;
                            tL_messageEntityFormattedDate.short_time = tL_messageEntityFormattedDate2.short_time;
                            tL_messageEntityFormattedDate.long_time = tL_messageEntityFormattedDate2.long_time;
                            tL_messageEntityFormattedDate.long_date = tL_messageEntityFormattedDate2.long_date;
                            tL_messageEntityFormattedDate.short_date = tL_messageEntityFormattedDate2.short_date;
                            tL_messageEntityFormattedDate.day_of_week = tL_messageEntityFormattedDate2.day_of_week;
                            tL_messageEntityFormattedDate.date = tL_messageEntityFormattedDate2.date;
                            arrayList.add(tL_messageEntityFormattedDate);
                        } catch (Exception e5) {
                            cc4.g(e5, true);
                        }
                    }
                }
            }
            if (spanned instanceof Spannable) {
                Spannable spannable = (Spannable) spanned;
                hl.c(spannable, 1, false, false);
                URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, charSequenceArr[0].length(), URLSpan.class);
                if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    for (int i19 = 0; i19 < uRLSpanArr.length; i19++) {
                        URLSpan uRLSpan = uRLSpanArr[i19];
                        if (!(uRLSpan instanceof h8c) && !(uRLSpan instanceof i8c) && !(uRLSpan instanceof no4)) {
                            TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                            tL_messageEntityUrl.offset = spanned.getSpanStart(uRLSpanArr[i19]);
                            tL_messageEntityUrl.length = Math.min(spanned.getSpanEnd(uRLSpanArr[i19]), charSequenceArr[0].length()) - tL_messageEntityUrl.offset;
                            tL_messageEntityUrl.url = uRLSpanArr[i19].getURL();
                            arrayList.add(tL_messageEntityUrl);
                            spannable.removeSpan(uRLSpanArr[i19]);
                        }
                    }
                }
            }
        }
        CharSequence charSequence6 = charSequenceArr[0];
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (charSequence6 != null && charSequence6.length() >= 48) {
            Matcher matcher = h2.matcher(charSequence6);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                while (true) {
                    if (i < arrayList.size()) {
                        TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i);
                        int i20 = messageEntity2.offset;
                        i = (hl.z1(start, end, i20, messageEntity2.length + i20) && ((messageEntity2 instanceof TLRPC.TL_messageEntityPre) || (messageEntity2 instanceof TLRPC.TL_messageEntityCode) || (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) || (messageEntity2 instanceof TLRPC.TL_messageEntityTonAddress) || (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl))) ? 0 : i + 1;
                    } else {
                        try {
                            z3 = WalletEngine2.isValidAddress(matcher.group());
                        } catch (Throwable th) {
                            cc4.g(th, true);
                            z3 = false;
                        }
                        if (z3) {
                            TLRPC.TL_messageEntityTonAddress tL_messageEntityTonAddress = new TLRPC.TL_messageEntityTonAddress();
                            tL_messageEntityTonAddress.offset = start;
                            tL_messageEntityTonAddress.length = end - start;
                            arrayList.add(tL_messageEntityTonAddress);
                        }
                    }
                }
            }
        }
        if (z2) {
            charSequence6 = k1(k1(k1(charSequence6, U1, arrayList, new lq5((byte) 28)), V1, arrayList, new lq5((byte) 29)), W1, arrayList, new tq6(b));
            if (z) {
                charSequence6 = k1(charSequence6, X1, arrayList, new tq6((byte) 1));
            }
        }
        while (charSequence6.length() > 0 && (charSequence6.charAt(0) == '\n' || charSequence6.charAt(0) == ' ')) {
            int i21 = 1;
            charSequence6 = charSequence6.subSequence(1, charSequence6.length());
            int i22 = 0;
            while (i22 < arrayList.size()) {
                TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) arrayList.get(i22);
                int i23 = messageEntity3.offset;
                if (i23 == 0) {
                    messageEntity3.length -= i21;
                }
                messageEntity3.offset = Math.max(0, i23 - 1);
                i22++;
                i21 = 1;
            }
        }
        while (charSequence6.length() > 0 && (charSequence6.charAt(charSequence6.length() - 1) == '\n' || charSequence6.charAt(charSequence6.length() - 1) == ' ')) {
            charSequence6 = charSequence6.subSequence(0, charSequence6.length() - 1);
            for (int i24 = 0; i24 < arrayList.size(); i24++) {
                TLRPC.MessageEntity messageEntity4 = (TLRPC.MessageEntity) arrayList.get(i24);
                if (messageEntity4.offset + messageEntity4.length > charSequence6.length()) {
                    messageEntity4.length--;
                }
            }
        }
        charSequenceArr[0] = charSequence6;
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v15 long, still in use, count: 2, list:
          (r13v15 long) from 0x01e5: PHI (r13v16 long) = (r13v15 long), (r13v18 long), (r13v19 long) binds: [B:196:0x01e1, B:162:0x01e3, B:161:0x01d8] A[DONT_GENERATE, DONT_INLINE]
          (r13v15 long) from 0x01df: CMP_L (r13v15 long), (0 long) A[WRAPPED] (LINE:480)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0382 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y0(java.util.ArrayList r21, long r22, int r24, long r25, java.lang.Runnable r27, int r28, qsb r29) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ls6.Y0(java.util.ArrayList, long, int, long, java.lang.Runnable, int, qsb):void");
    }

    public final boolean Y1() {
        boolean[] zArr = this.Y0;
        return (zArr[0] && this.O0 == 0 && zArr[1]) || this.h1 || this.i1;
    }

    public final long Z() {
        long j = 0;
        int i = 0;
        while (true) {
            ArrayList[] arrayListArr = this.t0;
            if (i >= arrayListArr[0].size()) {
                return j;
            }
            TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) arrayListArr[0].get(i)).set;
            if (!stickerSet.archived) {
                j = r(j, stickerSet.id);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0() {
        Throwable th;
        TLRPC.TL_emojiList tL_emojiList;
        SharedPreferences k = bp1.k(new StringBuilder("restrictedstatuses_"), this.currentAccount, a.b, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        String string = k.getString("restrictedstatuses", null);
        long j = k.getLong("restrictedstatuses_last_check", 0L);
        byte b = 1;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                tL_emojiList = (TLRPC.TL_emojiList) TLRPC.EmojiList.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                try {
                    this.P1 = tL_emojiList;
                } catch (Throwable th2) {
                    th = th2;
                    cc4.g(th, true);
                    tL_emojiList2 = tL_emojiList;
                    if (tL_emojiList2 != null) {
                    }
                    TL_account.getChannelRestrictedStatusEmojis getchannelrestrictedstatusemojis = new TL_account.getChannelRestrictedStatusEmojis();
                    if (tL_emojiList2 != null) {
                    }
                    getConnectionsManager().sendRequest(getchannelrestrictedstatusemojis, new hp6(this, k, b));
                }
            } catch (Throwable th3) {
                th = th3;
                tL_emojiList = null;
            }
            tL_emojiList2 = tL_emojiList;
        }
        if (tL_emojiList2 != null || System.currentTimeMillis() - j > 86400000) {
            TL_account.getChannelRestrictedStatusEmojis getchannelrestrictedstatusemojis2 = new TL_account.getChannelRestrictedStatusEmojis();
            if (tL_emojiList2 != null) {
                getchannelrestrictedstatusemojis2.hash = tL_emojiList2.hash;
            }
            getConnectionsManager().sendRequest(getchannelrestrictedstatusemojis2, new hp6(this, k, b));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z1(String str, final long j, final long j2, final int i, final int i2, final long j3, boolean z, final TLRPC.User user, final TLRPC.Chat chat, final boolean z2, final w49 w49Var) {
        long j4;
        String str2;
        long j5;
        int i3;
        int i4;
        boolean z3;
        long j6;
        TLRPC.User user2;
        TLRPC.Chat chat2;
        w49 w49Var2;
        SparseArray[] sparseArrayArr;
        int i5;
        boolean z4;
        final String str3;
        final int i6;
        final int i7;
        TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags;
        int e1;
        long j7;
        boolean z5 = !z;
        if (this.M0 != 0) {
            this.g1 = false;
            getConnectionsManager().cancelRequest(this.M0, true);
            this.M0 = 0;
        }
        if (this.N0 != 0) {
            getConnectionsManager().cancelRequest(this.N0, true);
            this.N0 = 0;
        }
        int[] iArr = this.X0;
        SparseArray[] sparseArrayArr2 = this.c1;
        boolean[] zArr = this.Y0;
        ArrayList arrayList = this.Z0;
        if (str != null) {
            j4 = 0;
            if (!z) {
                zArr[1] = false;
                zArr[0] = false;
                iArr[1] = 0;
                iArr[0] = 0;
                arrayList.clear();
                this.b1.clear();
                sparseArrayArr2[0].clear();
                sparseArrayArr2[1].clear();
                getNotificationCenter().k(jn7.J0, Integer.valueOf(i));
            }
            str2 = str;
            j5 = j;
            i3 = 0;
        } else {
            if (arrayList.isEmpty()) {
                this.g1 = false;
                return;
            }
            j4 = 0;
            int i8 = jn7.H0;
            if (i2 != 1) {
                if (i2 != 2) {
                    this.g1 = false;
                    return;
                }
                int i9 = this.f1 - 1;
                this.f1 = i9;
                if (i9 < 0) {
                    this.f1 = 0;
                    return;
                }
                if (i9 >= arrayList.size()) {
                    this.f1 = arrayList.size() - 1;
                }
                r47 r47Var = (r47) arrayList.get(this.f1);
                getNotificationCenter().k(i8, Integer.valueOf(i), Integer.valueOf(r47Var.e1()), Integer.valueOf(e0()), Long.valueOf(r47.B0(r47Var.k)), Integer.valueOf(this.f1), Integer.valueOf(k0()), Boolean.valueOf(z2));
                this.g1 = false;
                return;
            }
            int i10 = this.f1 + 1;
            this.f1 = i10;
            if (i10 < arrayList.size()) {
                r47 r47Var2 = (r47) arrayList.get(this.f1);
                getNotificationCenter().k(i8, Integer.valueOf(i), Integer.valueOf(r47Var2.e1()), Integer.valueOf(e0()), Long.valueOf(r47.B0(r47Var2.k)), Integer.valueOf(this.f1), Integer.valueOf(k0()), Boolean.valueOf(z2));
                this.g1 = false;
                return;
            }
            if (zArr[0] && j2 == 0 && zArr[1]) {
                this.f1--;
                this.g1 = false;
                return;
            }
            String str4 = this.e1;
            r47 r47Var3 = (r47) c00.g(1, arrayList);
            if (r47.B0(r47Var3.k) != j || zArr[0]) {
                e1 = r47.B0(r47Var3.k) == j2 ? r47Var3.e1() : 0;
                zArr[1] = false;
                j7 = j2;
            } else {
                e1 = r47Var3.e1();
                j7 = j;
            }
            j5 = j7;
            i3 = e1;
            str2 = str4;
            z5 = false;
        }
        if (str2 != null) {
            i4 = 1;
            if (str2.trim().startsWith("#") || str2.trim().startsWith("$")) {
                z3 = true;
                if (zArr[0] && !zArr[i4] && j2 != j4) {
                    j5 = j2;
                }
                if (j5 == j || !z5) {
                    j6 = j;
                    user2 = user;
                    chat2 = chat;
                    w49Var2 = w49Var;
                    sparseArrayArr = sparseArrayArr2;
                } else {
                    if (j2 != j4) {
                        TLRPC.InputPeer j1 = getMessagesController().j1(j2);
                        final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.peer = j1;
                        this.O0 = j2;
                        int i11 = i4;
                        tL_messages_search.limit = i11;
                        tL_messages_search.q = str2;
                        if (user != null) {
                            tL_messages_search.from_id = uc7.n1(user);
                            tL_messages_search.flags |= i11;
                        } else if (chat != null) {
                            tL_messages_search.from_id = uc7.l1(chat);
                            tL_messages_search.flags |= i11;
                        }
                        if (j3 != j4) {
                            if (j == getUserConfig().e() || getMessagesController().B2(j5)) {
                                tL_messages_search.saved_peer_id = getMessagesController().j1(j3);
                                tL_messages_search.flags |= 4;
                            } else {
                                tL_messages_search.top_msg_id = (int) j3;
                                tL_messages_search.flags |= 2;
                            }
                        }
                        if (w49Var != null) {
                            tL_messages_search.saved_reaction.add(w49Var.g());
                            tL_messages_search.flags |= 8;
                        }
                        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                        this.N0 = getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: sr6
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                final ls6 ls6Var = ls6.this;
                                final long j8 = j2;
                                final TLRPC.TL_messages_search tL_messages_search2 = tL_messages_search;
                                final long j9 = j;
                                final int i12 = i;
                                final byte b = i2;
                                final long j10 = j3;
                                final TLRPC.User user3 = user;
                                final TLRPC.Chat chat3 = chat;
                                final boolean z6 = z2;
                                final w49 w49Var3 = w49Var;
                                hl.c3(new Runnable() { // from class: pp6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ls6 ls6Var2 = ls6.this;
                                        int[] iArr2 = ls6Var2.X0;
                                        boolean[] zArr2 = ls6Var2.Y0;
                                        long j11 = ls6Var2.O0;
                                        long j12 = j8;
                                        if (j11 == j12) {
                                            ls6Var2.N0 = 0;
                                            TLObject tLObject2 = tLObject;
                                            TLRPC.TL_messages_search tL_messages_search3 = tL_messages_search2;
                                            long j13 = j9;
                                            int i13 = i12;
                                            byte b3 = b;
                                            long j14 = j10;
                                            TLRPC.User user4 = user3;
                                            TLRPC.Chat chat4 = chat3;
                                            boolean z7 = z6;
                                            w49 w49Var4 = w49Var3;
                                            if (tLObject2 == null) {
                                                zArr2[1] = true;
                                                iArr2[1] = 0;
                                                ls6Var2.Z1(tL_messages_search3.q, j13, j12, i13, b3, j14, true, user4, chat4, z7, w49Var4);
                                            } else {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                zArr2[1] = messages_messages.messages.isEmpty();
                                                iArr2[1] = messages_messages instanceof TLRPC.TL_messages_messagesSlice ? messages_messages.count : messages_messages.messages.size();
                                                ls6Var2.Z1(tL_messages_search3.q, j13, j12, i13, b3, j14, true, user4, chat4, z7, w49Var4);
                                            }
                                        }
                                    }
                                });
                            }
                        }, 2);
                        return;
                    }
                    j6 = j;
                    user2 = user;
                    chat2 = chat;
                    w49Var2 = w49Var;
                    sparseArrayArr = sparseArrayArr2;
                    this.O0 = j4;
                    zArr[1] = true;
                    iArr[1] = 0;
                }
                final TLRPC.TL_messages_search tL_messages_search2 = new TLRPC.TL_messages_search();
                tL_messages_search2.peer = getMessagesController().j1(j5);
                this.T0 = i;
                this.Q0 = j6;
                this.U0 = user2;
                this.V0 = chat2;
                this.P0 = j3;
                this.R0 = w49Var2;
                tL_messages_search2.limit = 21;
                tL_messages_search2.q = str2 == null ? str2 : "";
                tL_messages_search2.offset_id = i3;
                if (user2 == null) {
                    tL_messages_search2.from_id = uc7.n1(user2);
                    tL_messages_search2.flags |= 1;
                } else if (chat2 != null) {
                    tL_messages_search2.from_id = uc7.l1(chat2);
                    tL_messages_search2.flags |= 1;
                }
                this.h1 = false;
                this.i1 = false;
                i5 = this.S0 + 1;
                this.S0 = i5;
                z4 = j6 != getUserConfig().e();
                if (z4 || w49Var2 == null || !z5) {
                    str3 = str2;
                    i6 = i5;
                } else {
                    this.f1 = 0;
                    this.a1.clear();
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    uc7 messagesController = getMessagesController();
                    long j8 = this.P0;
                    zh6 zh6Var = messagesController.Q4;
                    if (zh6Var != null && (tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) zh6Var.f(j8)) != null) {
                        for (int i12 = 0; i12 < tL_messages_savedReactionsTags.tags.size(); i12++) {
                            if (w49Var2.f(tL_messages_savedReactionsTags.tags.get(i12).reaction)) {
                                i7 = tL_messages_savedReactionsTags.tags.get(i12).count;
                                break;
                            }
                        }
                    }
                    i7 = 0;
                    this.W0 = TextUtils.isEmpty(tL_messages_search2.q) ? i7 : 0;
                    this.h1 = true;
                    this.i1 = false;
                    kf7 messagesStorage = getMessagesStorage();
                    TLRPC.Reaction g = w49Var.g();
                    long j9 = this.P0;
                    ArrayList arrayList2 = this.b1;
                    int size = arrayList2 != null ? arrayList2.size() : 0;
                    i6 = i5;
                    mcc mccVar = new mcc() { // from class: tr6
                        @Override // mcc
                        public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            ArrayList arrayList4 = (ArrayList) obj2;
                            ArrayList arrayList5 = (ArrayList) obj3;
                            ArrayList arrayList6 = (ArrayList) obj4;
                            ls6 ls6Var = ls6.this;
                            if (i6 == ls6Var.S0) {
                                ls6Var.i1 = arrayList3.size() == i7;
                                ls6Var.h1 = false;
                                ls6Var.getMessagesController().j4(arrayList4, true);
                                ls6Var.getMessagesController().c4(arrayList5, true);
                                wl.g(ls6Var.currentAccount).d(arrayList6);
                                ls6Var.b1 = arrayList3;
                                ls6Var.m2();
                                ls6Var.getNotificationCenter().k(jn7.H0, Integer.valueOf(i), 0, Integer.valueOf(ls6Var.e0()), Long.valueOf(j), Integer.valueOf(ls6Var.f1), Integer.valueOf(ls6Var.k0()), Boolean.TRUE);
                            }
                        }
                    };
                    to3 to3Var = messagesStorage.a;
                    String str5 = str2;
                    ze7 ze7Var = new ze7(messagesStorage, str5, j9, g, jn7.W4, size, true, mccVar);
                    str3 = str5;
                    to3Var.c(ze7Var);
                }
                if (this.P0 != 0) {
                    if (j5 == getUserConfig().e() || getMessagesController().B2(j5)) {
                        tL_messages_search2.saved_peer_id = getMessagesController().j1(this.P0);
                        tL_messages_search2.flags |= 4;
                    } else {
                        tL_messages_search2.top_msg_id = (int) this.P0;
                        tL_messages_search2.flags |= 2;
                    }
                }
                if (w49Var != null) {
                    tL_messages_search2.saved_reaction.add(w49Var.g());
                    tL_messages_search2.flags |= 8;
                }
                tL_messages_search2.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                this.e1 = str3;
                final int i13 = i6;
                final TLRPC.User user3 = user2;
                final boolean z6 = z4;
                final boolean z7 = z3;
                final long j10 = j5;
                this.M0 = getConnectionsManager().sendRequest(tL_messages_search2, new RequestDelegate() { // from class: ur6
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                        final ArrayList arrayList3 = new ArrayList();
                        final ls6 ls6Var = ls6.this;
                        final TLRPC.TL_messages_search tL_messages_search3 = tL_messages_search2;
                        boolean z8 = z6;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            int min = Math.min(messages_messages.messages.size(), tL_messages_search3.limit - 1);
                            int i14 = 0;
                            while (i14 < min) {
                                boolean z9 = z8;
                                r47 r47Var4 = new r47(ls6Var.currentAccount, messages_messages.messages.get(i14), null, null, null, null, null, true, true, 0L, false, false, z9, 0);
                                if (r47Var4.z2()) {
                                    r47Var4.S2 = true;
                                }
                                r47Var4.J5(str3, !z7);
                                arrayList3.add(r47Var4);
                                i14++;
                                z8 = z9;
                            }
                        }
                        final boolean z10 = z8;
                        final int i15 = i13;
                        final boolean z11 = z2;
                        final long j11 = j10;
                        final long j12 = j;
                        final int i16 = i;
                        final long j13 = j2;
                        final long j14 = j3;
                        final TLRPC.User user4 = user3;
                        final TLRPC.Chat chat3 = chat;
                        hl.c3(new Runnable() { // from class: qp6
                            @Override // java.lang.Runnable
                            public final void run() {
                                final ls6 ls6Var2 = ls6.this;
                                if (i15 == ls6Var2.S0) {
                                    ls6Var2.M0 = 0;
                                    final boolean z12 = z11;
                                    if (!z12) {
                                        ls6Var2.g1 = false;
                                    }
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 != null) {
                                        final TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                        int i17 = 0;
                                        while (i17 < messages_messages2.messages.size()) {
                                            TLRPC.Message message = messages_messages2.messages.get(i17);
                                            if ((message instanceof TLRPC.TL_messageEmpty) || (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                                messages_messages2.messages.remove(i17);
                                                i17--;
                                            }
                                            i17++;
                                        }
                                        ls6Var2.getMessagesStorage().n1(messages_messages2.users, messages_messages2.chats, true, true);
                                        ls6Var2.getMessagesController().j4(messages_messages2.users, false);
                                        ls6Var2.getMessagesController().c4(messages_messages2.chats, false);
                                        final TLRPC.TL_messages_search tL_messages_search4 = tL_messages_search3;
                                        final long j15 = j11;
                                        final long j16 = j12;
                                        final int i18 = i16;
                                        final ArrayList arrayList4 = arrayList3;
                                        final boolean z13 = z10;
                                        final long j17 = j13;
                                        final long j18 = j14;
                                        final TLRPC.User user5 = user4;
                                        final TLRPC.Chat chat4 = chat3;
                                        Runnable runnable = new Runnable() { // from class: hq6
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                long j19;
                                                boolean z14;
                                                ls6 ls6Var3 = ls6.this;
                                                boolean[] zArr2 = ls6Var3.Y0;
                                                int[] iArr2 = ls6Var3.X0;
                                                ArrayList arrayList5 = ls6Var3.Z0;
                                                SparseArray[] sparseArrayArr3 = ls6Var3.c1;
                                                ArrayList arrayList6 = ls6Var3.a1;
                                                TLRPC.TL_messages_search tL_messages_search5 = tL_messages_search4;
                                                int i19 = tL_messages_search5.offset_id;
                                                long j20 = j15;
                                                long j21 = j16;
                                                int i20 = i18;
                                                boolean z15 = true;
                                                if (i19 == 0 && j20 == j21) {
                                                    ls6Var3.f1 = 0;
                                                    arrayList6.clear();
                                                    sparseArrayArr3[0].clear();
                                                    sparseArrayArr3[1].clear();
                                                    iArr2[0] = 0;
                                                    j19 = j21;
                                                    ls6Var3.getNotificationCenter().k(jn7.J0, Integer.valueOf(i20));
                                                } else {
                                                    j19 = j21;
                                                }
                                                TLRPC.messages_Messages messages_messages3 = messages_messages2;
                                                int min2 = Math.min(messages_messages3.messages.size(), tL_messages_search5.limit - 1);
                                                int i21 = 0;
                                                boolean z16 = false;
                                                while (true) {
                                                    z14 = z15;
                                                    if (i21 >= min2) {
                                                        break;
                                                    }
                                                    r47 r47Var5 = (r47) arrayList4.get(i21);
                                                    arrayList6.add(r47Var5);
                                                    int i22 = min2;
                                                    sparseArrayArr3[j20 == j19 ? (char) 0 : z14 ? 1 : 0].put(r47Var5.e1(), r47Var5);
                                                    i21++;
                                                    z15 = z14 ? 1 : 0;
                                                    z16 = z15;
                                                    min2 = i22;
                                                    sparseArrayArr3 = sparseArrayArr3;
                                                }
                                                ls6Var3.m2();
                                                zArr2[j20 == j19 ? (char) 0 : z14 ? 1 : 0] = messages_messages3.messages.size() < tL_messages_search5.limit ? z14 ? 1 : 0 : false;
                                                iArr2[j20 == j19 ? (char) 0 : z14 ? 1 : 0] = ((messages_messages3 instanceof TLRPC.TL_messages_messagesSlice) || (messages_messages3 instanceof TLRPC.TL_messages_channelMessages)) ? messages_messages3.count : messages_messages3.messages.size();
                                                boolean isEmpty = arrayList6.isEmpty();
                                                int i23 = jn7.H0;
                                                boolean z17 = z12;
                                                if (isEmpty) {
                                                    jn7 notificationCenter = ls6Var3.getNotificationCenter();
                                                    Integer valueOf = Integer.valueOf(i20);
                                                    Integer valueOf2 = Integer.valueOf(ls6Var3.e0());
                                                    Boolean valueOf3 = Boolean.valueOf(z17);
                                                    Object[] objArr = new Object[7];
                                                    objArr[0] = valueOf;
                                                    objArr[z14 ? 1 : 0] = 0;
                                                    objArr[2] = valueOf2;
                                                    objArr[3] = 0L;
                                                    objArr[4] = 0;
                                                    objArr[5] = 0;
                                                    objArr[6] = valueOf3;
                                                    notificationCenter.k(i23, objArr);
                                                } else if (z16) {
                                                    if (ls6Var3.f1 >= arrayList5.size()) {
                                                        ls6Var3.f1 = arrayList5.size() - 1;
                                                    }
                                                    r47 r47Var6 = (r47) arrayList5.get(ls6Var3.f1);
                                                    jn7 notificationCenter2 = ls6Var3.getNotificationCenter();
                                                    Integer valueOf4 = Integer.valueOf(i20);
                                                    Integer valueOf5 = Integer.valueOf(r47Var6.e1());
                                                    Integer valueOf6 = Integer.valueOf(ls6Var3.e0());
                                                    Long valueOf7 = Long.valueOf(r47.B0(r47Var6.k));
                                                    Integer valueOf8 = Integer.valueOf(ls6Var3.f1);
                                                    Integer valueOf9 = Integer.valueOf(ls6Var3.k0());
                                                    Boolean valueOf10 = Boolean.valueOf(z17);
                                                    Object[] objArr2 = new Object[7];
                                                    objArr2[0] = valueOf4;
                                                    objArr2[z14 ? 1 : 0] = valueOf5;
                                                    objArr2[2] = valueOf6;
                                                    objArr2[3] = valueOf7;
                                                    objArr2[4] = valueOf8;
                                                    objArr2[5] = valueOf9;
                                                    objArr2[6] = valueOf10;
                                                    notificationCenter2.k(i23, objArr2);
                                                } else if (z13) {
                                                    jn7 notificationCenter3 = ls6Var3.getNotificationCenter();
                                                    Integer valueOf11 = Integer.valueOf(i20);
                                                    Integer valueOf12 = Integer.valueOf(ls6Var3.e0());
                                                    Long valueOf13 = Long.valueOf(j19);
                                                    Integer valueOf14 = Integer.valueOf(ls6Var3.f1);
                                                    Integer valueOf15 = Integer.valueOf(ls6Var3.k0());
                                                    Object[] objArr3 = new Object[7];
                                                    objArr3[0] = valueOf11;
                                                    objArr3[z14 ? 1 : 0] = 0;
                                                    objArr3[2] = valueOf12;
                                                    objArr3[3] = valueOf13;
                                                    objArr3[4] = valueOf14;
                                                    objArr3[5] = valueOf15;
                                                    objArr3[6] = Boolean.FALSE;
                                                    notificationCenter3.k(i23, objArr3);
                                                }
                                                if (j20 == j19 && zArr2[0]) {
                                                    long j22 = j17;
                                                    if (j22 == 0 || zArr2[z14 ? 1 : 0]) {
                                                        return;
                                                    }
                                                    ls6Var3.Z1(ls6Var3.e1, j19, j22, i20, 0, j18, true, user5, chat4, z17, ls6Var3.R0);
                                                }
                                            }
                                        };
                                        if (z13) {
                                            ls6Var2.Y0(arrayList4, j16, 0, ls6Var2.P0, runnable, i18, null);
                                        } else {
                                            runnable.run();
                                        }
                                    }
                                }
                            }
                        });
                    }
                }, 2);
            }
        } else {
            i4 = 1;
        }
        z3 = false;
        if (zArr[0]) {
            j5 = j2;
        }
        if (j5 == j) {
        }
        j6 = j;
        user2 = user;
        chat2 = chat;
        w49Var2 = w49Var;
        sparseArrayArr = sparseArrayArr2;
        final TLRPC.TL_messages_search tL_messages_search22 = new TLRPC.TL_messages_search();
        tL_messages_search22.peer = getMessagesController().j1(j5);
        this.T0 = i;
        this.Q0 = j6;
        this.U0 = user2;
        this.V0 = chat2;
        this.P0 = j3;
        this.R0 = w49Var2;
        tL_messages_search22.limit = 21;
        tL_messages_search22.q = str2 == null ? str2 : "";
        tL_messages_search22.offset_id = i3;
        if (user2 == null) {
        }
        this.h1 = false;
        this.i1 = false;
        i5 = this.S0 + 1;
        this.S0 = i5;
        if (j6 != getUserConfig().e()) {
        }
        if (z4) {
        }
        str3 = str2;
        i6 = i5;
        if (this.P0 != 0) {
        }
        if (w49Var != null) {
        }
        tL_messages_search22.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        this.e1 = str3;
        final int i132 = i6;
        final TLRPC.User user32 = user2;
        final boolean z62 = z4;
        final boolean z72 = z3;
        final long j102 = j5;
        this.M0 = getConnectionsManager().sendRequest(tL_messages_search22, new RequestDelegate() { // from class: ur6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final ArrayList arrayList3 = new ArrayList();
                final ls6 ls6Var = ls6.this;
                final TLRPC.TL_messages_search tL_messages_search3 = tL_messages_search22;
                boolean z8 = z62;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int min = Math.min(messages_messages.messages.size(), tL_messages_search3.limit - 1);
                    int i14 = 0;
                    while (i14 < min) {
                        boolean z9 = z8;
                        r47 r47Var4 = new r47(ls6Var.currentAccount, messages_messages.messages.get(i14), null, null, null, null, null, true, true, 0L, false, false, z9, 0);
                        if (r47Var4.z2()) {
                            r47Var4.S2 = true;
                        }
                        r47Var4.J5(str3, !z72);
                        arrayList3.add(r47Var4);
                        i14++;
                        z8 = z9;
                    }
                }
                final boolean z10 = z8;
                final int i15 = i132;
                final boolean z11 = z2;
                final long j11 = j102;
                final long j12 = j;
                final int i16 = i;
                final long j13 = j2;
                final long j14 = j3;
                final TLRPC.User user4 = user32;
                final TLRPC.Chat chat3 = chat;
                hl.c3(new Runnable() { // from class: qp6
                    @Override // java.lang.Runnable
                    public final void run() {
                        final ls6 ls6Var2 = ls6.this;
                        if (i15 == ls6Var2.S0) {
                            ls6Var2.M0 = 0;
                            final boolean z12 = z11;
                            if (!z12) {
                                ls6Var2.g1 = false;
                            }
                            TLObject tLObject2 = tLObject;
                            if (tLObject2 != null) {
                                final TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                int i17 = 0;
                                while (i17 < messages_messages2.messages.size()) {
                                    TLRPC.Message message = messages_messages2.messages.get(i17);
                                    if ((message instanceof TLRPC.TL_messageEmpty) || (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                        messages_messages2.messages.remove(i17);
                                        i17--;
                                    }
                                    i17++;
                                }
                                ls6Var2.getMessagesStorage().n1(messages_messages2.users, messages_messages2.chats, true, true);
                                ls6Var2.getMessagesController().j4(messages_messages2.users, false);
                                ls6Var2.getMessagesController().c4(messages_messages2.chats, false);
                                final TLRPC.TL_messages_search tL_messages_search4 = tL_messages_search3;
                                final long j15 = j11;
                                final long j16 = j12;
                                final int i18 = i16;
                                final ArrayList arrayList4 = arrayList3;
                                final boolean z13 = z10;
                                final long j17 = j13;
                                final long j18 = j14;
                                final TLRPC.User user5 = user4;
                                final TLRPC.Chat chat4 = chat3;
                                Runnable runnable = new Runnable() { // from class: hq6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        long j19;
                                        boolean z14;
                                        ls6 ls6Var3 = ls6.this;
                                        boolean[] zArr2 = ls6Var3.Y0;
                                        int[] iArr2 = ls6Var3.X0;
                                        ArrayList arrayList5 = ls6Var3.Z0;
                                        SparseArray[] sparseArrayArr3 = ls6Var3.c1;
                                        ArrayList arrayList6 = ls6Var3.a1;
                                        TLRPC.TL_messages_search tL_messages_search5 = tL_messages_search4;
                                        int i19 = tL_messages_search5.offset_id;
                                        long j20 = j15;
                                        long j21 = j16;
                                        int i20 = i18;
                                        boolean z15 = true;
                                        if (i19 == 0 && j20 == j21) {
                                            ls6Var3.f1 = 0;
                                            arrayList6.clear();
                                            sparseArrayArr3[0].clear();
                                            sparseArrayArr3[1].clear();
                                            iArr2[0] = 0;
                                            j19 = j21;
                                            ls6Var3.getNotificationCenter().k(jn7.J0, Integer.valueOf(i20));
                                        } else {
                                            j19 = j21;
                                        }
                                        TLRPC.messages_Messages messages_messages3 = messages_messages2;
                                        int min2 = Math.min(messages_messages3.messages.size(), tL_messages_search5.limit - 1);
                                        int i21 = 0;
                                        boolean z16 = false;
                                        while (true) {
                                            z14 = z15;
                                            if (i21 >= min2) {
                                                break;
                                            }
                                            r47 r47Var5 = (r47) arrayList4.get(i21);
                                            arrayList6.add(r47Var5);
                                            int i22 = min2;
                                            sparseArrayArr3[j20 == j19 ? (char) 0 : z14 ? 1 : 0].put(r47Var5.e1(), r47Var5);
                                            i21++;
                                            z15 = z14 ? 1 : 0;
                                            z16 = z15;
                                            min2 = i22;
                                            sparseArrayArr3 = sparseArrayArr3;
                                        }
                                        ls6Var3.m2();
                                        zArr2[j20 == j19 ? (char) 0 : z14 ? 1 : 0] = messages_messages3.messages.size() < tL_messages_search5.limit ? z14 ? 1 : 0 : false;
                                        iArr2[j20 == j19 ? (char) 0 : z14 ? 1 : 0] = ((messages_messages3 instanceof TLRPC.TL_messages_messagesSlice) || (messages_messages3 instanceof TLRPC.TL_messages_channelMessages)) ? messages_messages3.count : messages_messages3.messages.size();
                                        boolean isEmpty = arrayList6.isEmpty();
                                        int i23 = jn7.H0;
                                        boolean z17 = z12;
                                        if (isEmpty) {
                                            jn7 notificationCenter = ls6Var3.getNotificationCenter();
                                            Integer valueOf = Integer.valueOf(i20);
                                            Integer valueOf2 = Integer.valueOf(ls6Var3.e0());
                                            Boolean valueOf3 = Boolean.valueOf(z17);
                                            Object[] objArr = new Object[7];
                                            objArr[0] = valueOf;
                                            objArr[z14 ? 1 : 0] = 0;
                                            objArr[2] = valueOf2;
                                            objArr[3] = 0L;
                                            objArr[4] = 0;
                                            objArr[5] = 0;
                                            objArr[6] = valueOf3;
                                            notificationCenter.k(i23, objArr);
                                        } else if (z16) {
                                            if (ls6Var3.f1 >= arrayList5.size()) {
                                                ls6Var3.f1 = arrayList5.size() - 1;
                                            }
                                            r47 r47Var6 = (r47) arrayList5.get(ls6Var3.f1);
                                            jn7 notificationCenter2 = ls6Var3.getNotificationCenter();
                                            Integer valueOf4 = Integer.valueOf(i20);
                                            Integer valueOf5 = Integer.valueOf(r47Var6.e1());
                                            Integer valueOf6 = Integer.valueOf(ls6Var3.e0());
                                            Long valueOf7 = Long.valueOf(r47.B0(r47Var6.k));
                                            Integer valueOf8 = Integer.valueOf(ls6Var3.f1);
                                            Integer valueOf9 = Integer.valueOf(ls6Var3.k0());
                                            Boolean valueOf10 = Boolean.valueOf(z17);
                                            Object[] objArr2 = new Object[7];
                                            objArr2[0] = valueOf4;
                                            objArr2[z14 ? 1 : 0] = valueOf5;
                                            objArr2[2] = valueOf6;
                                            objArr2[3] = valueOf7;
                                            objArr2[4] = valueOf8;
                                            objArr2[5] = valueOf9;
                                            objArr2[6] = valueOf10;
                                            notificationCenter2.k(i23, objArr2);
                                        } else if (z13) {
                                            jn7 notificationCenter3 = ls6Var3.getNotificationCenter();
                                            Integer valueOf11 = Integer.valueOf(i20);
                                            Integer valueOf12 = Integer.valueOf(ls6Var3.e0());
                                            Long valueOf13 = Long.valueOf(j19);
                                            Integer valueOf14 = Integer.valueOf(ls6Var3.f1);
                                            Integer valueOf15 = Integer.valueOf(ls6Var3.k0());
                                            Object[] objArr3 = new Object[7];
                                            objArr3[0] = valueOf11;
                                            objArr3[z14 ? 1 : 0] = 0;
                                            objArr3[2] = valueOf12;
                                            objArr3[3] = valueOf13;
                                            objArr3[4] = valueOf14;
                                            objArr3[5] = valueOf15;
                                            objArr3[6] = Boolean.FALSE;
                                            notificationCenter3.k(i23, objArr3);
                                        }
                                        if (j20 == j19 && zArr2[0]) {
                                            long j22 = j17;
                                            if (j22 == 0 || zArr2[z14 ? 1 : 0]) {
                                                return;
                                            }
                                            ls6Var3.Z1(ls6Var3.e1, j19, j22, i20, 0, j18, true, user5, chat4, z17, ls6Var3.R0);
                                        }
                                    }
                                };
                                if (z13) {
                                    ls6Var2.Y0(arrayList4, j16, 0, ls6Var2.P0, runnable, i18, null);
                                } else {
                                    runnable.run();
                                }
                            }
                        }
                    }
                });
            }
        }, 2);
    }

    public final TLRPC.TL_messages_stickerSet a0(TLRPC.StickerSet stickerSet) {
        TLRPC.StickerSet stickerSet2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.J.f(stickerSet.id);
        if (tL_messages_stickerSet == null) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.N.f(stickerSet.id);
            if (tL_messages_stickerSet != null && (stickerSet2 = tL_messages_stickerSet.set) != null) {
                if (stickerSet2.hash != stickerSet.hash) {
                    N0(stickerSet, false);
                }
                return tL_messages_stickerSet;
            }
            N0(stickerSet, true);
        }
        return tL_messages_stickerSet;
    }

    public final void a1(boolean z) {
        if (this.K1) {
            return;
        }
        if (!this.L1 || z) {
            SharedPreferences k = bp1.k(new StringBuilder("saved_reactions_"), this.currentAccount, a.b, 0);
            this.H1.clear();
            this.H1.addAll(V0(k));
            this.K1 = true;
            this.L1 = true;
            TLRPC.TL_messages_getDefaultTagReactions tL_messages_getDefaultTagReactions = new TLRPC.TL_messages_getDefaultTagReactions();
            tL_messages_getDefaultTagReactions.hash = k.getLong("hash", 0L);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDefaultTagReactions, new hp6(this, k, (byte) 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a2(boolean z, String str, pcc pccVar) {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        if (z) {
            TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
            tL_messages_searchEmojiStickerSets.q = str;
            tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
        } else {
            TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
            tL_messages_searchStickerSets2.q = str;
            tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_searchStickerSets, new ic((byte) 0), new jv4(pccVar, (byte) 1));
    }

    public final void b(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        long j = tL_messages_stickerSet.set.id;
        zh6 zh6Var = this.J;
        if (zh6Var.h(j) < 0) {
            String str = tL_messages_stickerSet.set.short_name;
            ConcurrentHashMap concurrentHashMap = this.O;
            if (concurrentHashMap.containsKey(str)) {
                return;
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            int i = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
            ArrayList[] arrayListArr = this.H;
            arrayListArr[i].add(0, tL_messages_stickerSet);
            zh6Var.k(tL_messages_stickerSet.set.id, tL_messages_stickerSet);
            this.K.k(tL_messages_stickerSet.set.id, tL_messages_stickerSet);
            concurrentHashMap.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
            zh6 zh6Var2 = new zh6();
            for (int i2 = 0; i2 < tL_messages_stickerSet.documents.size(); i2++) {
                TLRPC.Document document = tL_messages_stickerSet.documents.get(i2);
                zh6Var2.k(document.id, document);
            }
            for (int i3 = 0; i3 < tL_messages_stickerSet.packs.size(); i3++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i3);
                String replace = tL_stickerPack.emoticon.replace("️", "");
                tL_stickerPack.emoticon = replace;
                ArrayList arrayList = (ArrayList) this.e0.get(replace);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.e0.put(tL_stickerPack.emoticon, arrayList);
                }
                for (int i4 = 0; i4 < tL_stickerPack.documents.size(); i4++) {
                    Long l = tL_stickerPack.documents.get(i4);
                    if (this.d0.h(l.longValue()) < 0) {
                        this.d0.k(l.longValue(), tL_stickerPack.emoticon);
                    }
                    TLRPC.Document document2 = (TLRPC.Document) zh6Var2.f(l.longValue());
                    if (document2 != null) {
                        arrayList.add(document2);
                    }
                }
            }
            this.Y[i] = s(arrayListArr[i]);
            getNotificationCenter().k(jn7.x0, Integer.valueOf(i), Boolean.TRUE);
            b1(i, false, true);
        }
    }

    public final void b1(int i, boolean z, boolean z2) {
        c1(i, z, z2, false, null);
    }

    public final js6 b2(boolean z, String str, String str2, pcc pccVar, boolean z2) {
        js6 js6Var = new js6(str, str2, z);
        ks6 ks6Var = (ks6) this.T1.get(js6Var);
        if (ks6Var == null || (ks6Var.b != null && z2)) {
            HashMap hashMap = this.S1;
            if (!hashMap.containsKey(js6Var)) {
                hashMap.put(js6Var, 0);
                d0(this.currentAccount).W(new String[]{str}, str2, true, new pt((Object) this, (Object) js6Var, (Object) ks6Var, (Object) pccVar, (byte) 15), false);
                return js6Var;
            }
        }
        if (ks6Var != null) {
            pccVar.a(ks6Var.a);
            return js6Var;
        }
        pccVar.a(new ArrayList());
        return js6Var;
    }

    public final void c(TLRPC.Document document, int i, boolean z) {
        if (document == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            int size = this.j0.size();
            ArrayList arrayList = this.j0;
            if (i2 >= size) {
                arrayList.add(0, document);
                break;
            }
            TLRPC.Document document2 = (TLRPC.Document) arrayList.get(i2);
            if (document2.id == document.id) {
                this.j0.remove(i2);
                this.j0.add(0, document2);
                break;
            }
            i2++;
        }
        if ((this.j0.size() > getMessagesController().l4.b1.f() && !yac.h(this.currentAccount).p()) || this.j0.size() > getMessagesController().l4.c1.f()) {
            getMessagesStorage().a.c(new lp6(this, (TLRPC.Document) qd4.l(1, this.j0), (byte) 1));
            if (z) {
                hl.c3(new z96(document, (byte) 19));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(document);
        z1(0, arrayList2, true, i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c1(int i, boolean z, boolean z2, boolean z3, pcc pccVar) {
        long j;
        TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers;
        boolean[] zArr = this.W;
        if (zArr[i]) {
            if (z3) {
                this.V[i] = new ps1(this, i, z2, pccVar);
                return;
            } else {
                if (pccVar != null) {
                    pccVar.a(null);
                    return;
                }
                return;
            }
        }
        byte b = 6;
        ArrayList[] arrayListArr = this.t0;
        if (i == 3) {
            if (arrayListArr[0].isEmpty() || !getMessagesController().m3) {
                if (pccVar != null) {
                    pccVar.a(null);
                    return;
                }
                return;
            }
        } else if (i == 6) {
            if (arrayListArr[1].isEmpty() || !getMessagesController().m3) {
                if (pccVar != null) {
                    pccVar.a(null);
                    return;
                }
                return;
            }
        } else if (i != 4) {
            E0(i, z);
        }
        zArr[i] = true;
        if (z) {
            getMessagesStorage().a.c(new l65(this, i, pccVar, b));
            return;
        }
        if (i == 3 || i == 6) {
            char c = i != 6 ? (char) 0 : (char) 1;
            TLRPC.TL_messages_allStickers tL_messages_allStickers = new TLRPC.TL_messages_allStickers();
            tL_messages_allStickers.hash2 = this.q0[c];
            int size = arrayListArr[c].size();
            for (int i2 = 0; i2 < size; i2++) {
                tL_messages_allStickers.sets.add(((TLRPC.StickerSetCovered) arrayListArr[c].get(i2)).set);
            }
            s1(i, tL_messages_allStickers, new jn0(pccVar, b));
            return;
        }
        if (i == 4) {
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetAnimatedEmoji();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new hb7((Object) this, i, (Object) pccVar, (byte) 9));
            return;
        }
        long[] jArr = this.Y;
        if (i == 0) {
            TLRPC.TL_messages_getAllStickers tL_messages_getAllStickers = new TLRPC.TL_messages_getAllStickers();
            j = z2 ? 0L : jArr[i];
            tL_messages_getAllStickers.hash = j;
            tL_messages_getMaskStickers = tL_messages_getAllStickers;
        } else if (i == 5) {
            TLRPC.TL_messages_getEmojiStickers tL_messages_getEmojiStickers = new TLRPC.TL_messages_getEmojiStickers();
            j = z2 ? 0L : jArr[i];
            tL_messages_getEmojiStickers.hash = j;
            tL_messages_getMaskStickers = tL_messages_getEmojiStickers;
        } else {
            TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers2 = new TLRPC.TL_messages_getMaskStickers();
            j = z2 ? 0L : jArr[i];
            tL_messages_getMaskStickers2.hash = j;
            tL_messages_getMaskStickers = tL_messages_getMaskStickers2;
        }
        getConnectionsManager().sendRequest(tL_messages_getMaskStickers, new gg((Object) this, i, (Object) pccVar, j, (byte) 3));
    }

    public final void c2(String str) {
        uc7.s1(this.currentAccount).Z3.edit().putString("reaction_on_double_tap", str).apply();
        this.s = str;
    }

    public final void d(int i, Object obj, TLRPC.Document document, int i2, boolean z) {
        ArrayList[] arrayListArr;
        int i3;
        if (i != 3) {
            if (r47.t4(document) || r47.K2(document, true)) {
                int i4 = 0;
                while (true) {
                    arrayListArr = this.g0;
                    if (i4 < arrayListArr[i].size()) {
                        TLRPC.Document document2 = (TLRPC.Document) arrayListArr[i].get(i4);
                        if (document2.id == document.id) {
                            arrayListArr[i].remove(i4);
                            if (!z) {
                                arrayListArr[i].add(0, document2);
                            }
                        } else {
                            i4++;
                        }
                    } else if (!z) {
                        arrayListArr[i].add(0, document);
                    }
                }
                byte b = 6;
                int i5 = jn7.S4;
                if (i == 2) {
                    if (z) {
                        jn7.e().k(i5, 0, document, 4);
                    } else {
                        jn7.e().k(i5, 0, document, Integer.valueOf(arrayListArr[i].size() > getMessagesController().X2 ? 6 : 5));
                    }
                    TLRPC.TL_messages_faveSticker tL_messages_faveSticker = new TLRPC.TL_messages_faveSticker();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_messages_faveSticker.id = tL_inputDocument;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr = document.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_faveSticker.unfave = z;
                    getConnectionsManager().sendRequest(tL_messages_faveSticker, new m65(this, obj, tL_messages_faveSticker, (byte) 11));
                    i3 = getMessagesController().X2;
                } else {
                    if (i == 0 && z) {
                        jn7.e().k(i5, 0, document, 3);
                        TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = new TLRPC.TL_messages_saveRecentSticker();
                        TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                        tL_messages_saveRecentSticker.id = tL_inputDocument2;
                        tL_inputDocument2.id = document.id;
                        tL_inputDocument2.access_hash = document.access_hash;
                        byte[] bArr2 = document.file_reference;
                        tL_inputDocument2.file_reference = bArr2;
                        if (bArr2 == null) {
                            tL_inputDocument2.file_reference = new byte[0];
                        }
                        tL_messages_saveRecentSticker.unsave = true;
                        getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new m65(this, obj, tL_messages_saveRecentSticker, (byte) 12));
                    }
                    i3 = getMessagesController().W2;
                }
                if (arrayListArr[i].size() > i3 || z) {
                    getMessagesStorage().a.c(new sb4(this, i, z ? document : (TLRPC.Document) qd4.l(1, arrayListArr[i]), b));
                }
                if (!z) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(document);
                    z1(i, arrayList, false, i2, false);
                }
                if (i == 2 || (i == 0 && z)) {
                    getNotificationCenter().k(jn7.X0, Boolean.FALSE, Integer.valueOf(i));
                }
            }
        }
    }

    public final void d1(String str, boolean z, boolean z2) {
        HashSet hashSet = this.T;
        if (hashSet.contains(str)) {
            return;
        }
        if (!z || this.R.get(str) == null) {
            hashSet.add(str);
            if (z2) {
                getMessagesStorage().a.c(new rp6(this, str, z, (byte) 1));
                return;
            }
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            if (Objects.equals(getUserConfig().c0, str)) {
                tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
            } else if (z) {
                TLRPC.TL_inputStickerSetDice tL_inputStickerSetDice = new TLRPC.TL_inputStickerSetDice();
                tL_inputStickerSetDice.emoticon = str;
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetDice;
            } else {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = str;
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
            }
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new vi1((Object) this, (Object) str, z, (byte) 6));
        }
    }

    public final void d2(long j, long j2, float f, float f3) {
        gs6 U = U(j, j2);
        if (U != null) {
            if (Math.abs(U.h - f) >= 0.001f || Math.abs(U.i - f3) >= 0.001f) {
                U.h = f;
                U.i = f3;
                a.b.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit().putString(Objects.hash(Long.valueOf(j), Long.valueOf(j2)) + "", U.toString()).apply();
            }
        }
    }

    public final int e0() {
        int i = 1;
        if (this.f1 >= this.Z0.size() - 1) {
            boolean[] zArr = this.Y0;
            if (zArr[0] && zArr[1]) {
                i = 0;
            }
        }
        return this.f1 > 0 ? i | 2 : i;
    }

    public final void e1(boolean z, boolean z2) {
        ArrayList[] arrayListArr = this.v0;
        if (arrayListArr[z ? 1 : 0].isEmpty()) {
            return;
        }
        arrayListArr[z ? 1 : 0].clear();
        ArrayList[] arrayListArr2 = this.t0;
        long q = q(arrayListArr2[z ? 1 : 0], z);
        long[] jArr = this.q0;
        jArr[z ? 1 : 0] = q;
        byte b = 0;
        getNotificationCenter().k(z ? jn7.A0 : jn7.z0, new Object[0]);
        J1(z, arrayListArr2[z ? 1 : 0], arrayListArr[z ? 1 : 0], this.r0[z ? 1 : 0], jArr[z ? 1 : 0], this.s0);
        if (z2) {
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_readFeaturedStickers(), new xe2(b));
        }
    }

    public final void e2(de0 de0Var, String str, String str2, String str3) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = str;
        d0(this.currentAccount).m0(tL_inputStickerSetShortName, 0, false, false, new gt(str2, de0Var, str3, (byte) 27));
    }

    public final void f0(final int i, final int i2, final long j, final long j2, boolean z) {
        if (z || wf3.B(j)) {
            getMessagesStorage().a.c(new Runnable() { // from class: vq6
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z2;
                    SQLiteCursor queryFinalized;
                    int i3;
                    int i4;
                    long j3;
                    ls6 ls6Var;
                    int i5 = i2;
                    long j4 = j2;
                    ls6 ls6Var2 = ls6.this;
                    long j5 = j;
                    byte b = i;
                    try {
                        if (j4 != 0) {
                            SQLiteDatabase sQLiteDatabase = ls6Var2.getMessagesStorage().b;
                            Locale locale = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT count, old FROM media_counts_topics WHERE uid = " + j5 + " AND topic_id = " + j4 + " AND type = " + ((int) b) + " LIMIT 1", new Object[0]);
                        } else {
                            SQLiteDatabase sQLiteDatabase2 = ls6Var2.getMessagesStorage().b;
                            Locale locale2 = Locale.US;
                            queryFinalized = sQLiteDatabase2.queryFinalized("SELECT count, old FROM media_counts_v2 WHERE uid = " + j5 + " AND type = " + ((int) b) + " LIMIT 1", new Object[0]);
                        }
                        if (queryFinalized.next()) {
                            i3 = queryFinalized.intValue(0);
                            i4 = queryFinalized.intValue(1);
                        } else {
                            i3 = -1;
                            i4 = 0;
                        }
                        queryFinalized.dispose();
                        if (i3 == -1 && wf3.B(j5)) {
                            SQLiteCursor queryFinalized2 = ls6Var2.getMessagesStorage().b.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j5 + " AND type = " + ((int) b) + " LIMIT 1", new Object[0]);
                            if (queryFinalized2.next()) {
                                i3 = queryFinalized2.intValue(0);
                            }
                            int i6 = i3;
                            queryFinalized2.dispose();
                            if (i6 != -1) {
                                j3 = j4;
                                ls6Var2.K1(b, i6, j5, j3);
                                ls6Var = ls6Var2;
                            } else {
                                j3 = j4;
                                ls6Var = ls6Var2;
                            }
                            i3 = i6;
                        } else {
                            j3 = j4;
                            ls6Var = ls6Var2;
                        }
                        z2 = true;
                    } catch (Exception e) {
                        e = e;
                        z2 = true;
                    }
                    try {
                        hl.c3(new gq6(ls6Var, j5, true, i3, b, i4, j3, i5));
                    } catch (Exception e3) {
                        e = e3;
                        cc4.g(e, z2);
                    }
                }
            });
            return;
        }
        TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
        if (i == 0) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
        } else if (i == 1) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterDocument());
        } else if (i == 2) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterRoundVoice());
        } else if (i == 3) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterUrl());
        } else if (i == 4) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterMusic());
        } else if (i == 5) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterGif());
        } else if (i == 8) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPoll());
        }
        if (j2 != 0) {
            if (j == getUserConfig().e()) {
                tL_messages_getSearchCounters.saved_peer_id = getMessagesController().j1(j2);
                tL_messages_getSearchCounters.flags |= 4;
            } else {
                tL_messages_getSearchCounters.top_msg_id = (int) j2;
                tL_messages_getSearchCounters.flags |= 1;
            }
        }
        tL_messages_getSearchCounters.peer = getMessagesController().j1(j);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new RequestDelegate() { // from class: kp6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (vector.objects.isEmpty()) {
                        return;
                    }
                    hl.c3(new gq6(ls6.this, j, false, ((TLRPC.TL_messages_searchCounter) vector.objects.get(0)).count, i, 0, j2, i2));
                }
            }
        }), i2);
    }

    public final void f1(long j) {
        byte b = 0;
        if (this.v0[0].contains(Long.valueOf(j))) {
            ArrayList[] arrayListArr = this.w0;
            if (arrayListArr[0].contains(Long.valueOf(j))) {
                return;
            }
            arrayListArr[0].add(Long.valueOf(j));
            TLRPC.TL_messages_readFeaturedStickers tL_messages_readFeaturedStickers = new TLRPC.TL_messages_readFeaturedStickers();
            tL_messages_readFeaturedStickers.id.add(Long.valueOf(j));
            getConnectionsManager().sendRequest(tL_messages_readFeaturedStickers, new xe2(b));
            hl.d3(new lq6(this, j, (byte) 1), 1000L);
        }
    }

    public final void g0(long j, int i, long j2) {
        getMessagesStorage().a.c(new m30((rf0) this, j2, j, i, (byte) 3));
    }

    public final void g1(long j, boolean z) {
        this.M.remove(Long.valueOf(j));
        ArrayList arrayList = this.L;
        if (z && !arrayList.contains(Long.valueOf(j))) {
            arrayList.add(Long.valueOf(j));
        }
        if (z) {
            return;
        }
        arrayList.remove(Long.valueOf(j));
    }

    public final void g2(long j, long j2, boolean z) {
        gs6 U = U(j, j2);
        if (U == null || U.g == z) {
            return;
        }
        U.g = z;
        a.b.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit().putString(Objects.hash(Long.valueOf(j), Long.valueOf(j2)) + "", U.toString()).apply();
    }

    public final void h1(long j, boolean z) {
        this.L.remove(Long.valueOf(j));
        ArrayList arrayList = this.M;
        if (z && !arrayList.contains(Long.valueOf(j))) {
            arrayList.add(Long.valueOf(j));
        }
        if (z) {
            return;
        }
        arrayList.remove(Long.valueOf(j));
    }

    public final void h2(Context context, TLObject tLObject, int i, e eVar, boolean z, boolean z2) {
        i2(context, tLObject, null, i, eVar, null, z, z2, null, true);
    }

    public final Integer i0(boolean z) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList;
        double d;
        int i;
        double d3;
        wo8 wo8Var;
        vo8 vo8Var;
        vo8 vo8Var2;
        double d4;
        int i2;
        wo8 wo8Var2;
        vo8 vo8Var3;
        if ((z && (!di0.h().j() || di0.h().e == null)) || (tL_help_premiumPromo = this.E) == null) {
            return null;
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = tL_help_premiumPromo.period_options;
        int size = arrayList2.size();
        int i3 = 0;
        double d5 = 0.0d;
        boolean z2 = false;
        int i4 = 0;
        while (i4 < size) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i4);
            i4++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
            if (!z) {
                vo8Var2 = null;
                if (tL_premiumSubscriptionOption2.months == 1) {
                    if (f11.b()) {
                    }
                    d4 = tL_premiumSubscriptionOption2.amount;
                    i2 = tL_premiumSubscriptionOption2.months;
                    d5 = d4 / i2;
                    z2 = true;
                }
            } else if (tL_premiumSubscriptionOption2.current) {
                vo8Var2 = null;
                if (Objects.equals(tL_premiumSubscriptionOption2.transaction.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1"), di0.h().e)) {
                    if (!f11.b() || (wo8Var2 = di0.l) == null) {
                        d4 = tL_premiumSubscriptionOption2.amount;
                        i2 = tL_premiumSubscriptionOption2.months;
                    } else {
                        ArrayList arrayList3 = wo8Var2.h;
                        int size2 = arrayList3.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size2) {
                                vo8Var3 = vo8Var2;
                                break;
                            }
                            Object obj = arrayList3.get(i5);
                            i5++;
                            vo8Var3 = (vo8) obj;
                            String str = ((uo8) vo8Var3.b.a.get(0)).d;
                            int i6 = tL_premiumSubscriptionOption2.months;
                            if (i6 != 12) {
                                Locale locale = Locale.ROOT;
                                if (str.equals("P" + i6 + "M")) {
                                    break;
                                }
                            } else if (str.equals("P1Y")) {
                                break;
                            }
                        }
                        if (vo8Var3 == null) {
                            d4 = tL_premiumSubscriptionOption2.amount;
                            i2 = tL_premiumSubscriptionOption2.months;
                        } else {
                            d4 = ((uo8) vo8Var3.b.a.get(0)).b;
                            i2 = tL_premiumSubscriptionOption2.months;
                        }
                    }
                    d5 = d4 / i2;
                    z2 = true;
                }
            }
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList4 = this.E.period_options;
        int size3 = arrayList4.size();
        int i7 = 0;
        int i8 = 0;
        while (i8 < size3) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = arrayList4.get(i8);
            i8++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption4 = tL_premiumSubscriptionOption3;
            if (z2 && tL_premiumSubscriptionOption4.months == 12) {
                if (f11.b() || (wo8Var = di0.l) == null) {
                    arrayList = arrayList4;
                    d = tL_premiumSubscriptionOption4.amount;
                    i = tL_premiumSubscriptionOption4.months;
                } else {
                    ArrayList arrayList5 = wo8Var.h;
                    int size4 = arrayList5.size();
                    int i9 = i3;
                    while (true) {
                        if (i9 >= size4) {
                            arrayList = arrayList4;
                            vo8Var = null;
                            break;
                        }
                        Object obj2 = arrayList5.get(i9);
                        i9++;
                        vo8Var = (vo8) obj2;
                        String str2 = ((uo8) vo8Var.b.a.get(i3)).d;
                        int i10 = tL_premiumSubscriptionOption4.months;
                        arrayList = arrayList4;
                        if (i10 != 12) {
                            Locale locale2 = Locale.ROOT;
                            if (str2.equals("P" + i10 + "M")) {
                                break;
                            }
                            arrayList4 = arrayList;
                            i3 = 0;
                        } else {
                            if (str2.equals("P1Y")) {
                                break;
                            }
                            arrayList4 = arrayList;
                            i3 = 0;
                        }
                    }
                    if (vo8Var == null) {
                        d3 = tL_premiumSubscriptionOption4.amount / tL_premiumSubscriptionOption4.months;
                        i3 = 0;
                        i7 = (int) ((1.0d - (d3 / d5)) * 100.0d);
                    } else {
                        i3 = 0;
                        d = ((uo8) vo8Var.b.a.get(0)).b;
                        i = tL_premiumSubscriptionOption4.months;
                    }
                }
                d3 = d / i;
                i7 = (int) ((1.0d - (d3 / d5)) * 100.0d);
            } else {
                arrayList = arrayList4;
            }
            arrayList4 = arrayList;
        }
        if (!z2 || i7 <= 0) {
            return null;
        }
        return Integer.valueOf(i7);
    }

    public final void i1(long j, boolean z, boolean z2) {
        int i = z ? 5 : z2 ? 1 : 0;
        ArrayList t0 = t0(i);
        if (t0 != null) {
            for (int i2 = 0; i2 < t0.size(); i2++) {
                if (((TLRPC.TL_messages_stickerSet) t0.get(i2)).set.id == j) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) t0.get(i2);
                    t0.remove(i2);
                    t0.add(0, tL_messages_stickerSet);
                    getNotificationCenter().k(jn7.x0, Integer.valueOf(i), Boolean.FALSE);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i2(final Context context, final TLObject tLObject, final TLRPC.Document document, final int i, final e eVar, final FrameLayout frameLayout, final boolean z, boolean z2, final Runnable runnable, boolean z3) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        int i2;
        int i3;
        ArrayList[] arrayListArr;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3;
        int i4;
        boolean z4 = tLObject instanceof TLRPC.TL_messages_stickerSet;
        zh6 zh6Var = this.J;
        if (z4) {
            tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject;
            stickerSet = tL_messages_stickerSet2.set;
        } else {
            if (!(tLObject instanceof TLRPC.StickerSetCovered)) {
                c22.b(tLObject.getClass(), "Invalid type of the given stickerSetObject: ");
                return;
            }
            stickerSet = ((TLRPC.StickerSetCovered) tLObject).set;
            if (i == 2) {
                stickerSet2 = stickerSet;
                tL_messages_stickerSet = null;
                i2 = !stickerSet2.masks ? 1 : stickerSet2.emojis ? 5 : 0;
                stickerSet2.archived = i != 1;
                i3 = 0;
                while (true) {
                    arrayListArr = this.H;
                    if (i3 < arrayListArr[i2].size()) {
                        tL_messages_stickerSet3 = tL_messages_stickerSet;
                        i4 = 0;
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayListArr[i2].get(i3);
                    tL_messages_stickerSet3 = tL_messages_stickerSet;
                    if (tL_messages_stickerSet4.set.id == stickerSet2.id) {
                        arrayListArr[i2].remove(i3);
                        if (i == 2) {
                            tL_messages_stickerSet4.set.title = stickerSet2.title;
                            arrayListArr[i2].add(0, tL_messages_stickerSet4);
                        } else if (z3) {
                            zh6Var.l(tL_messages_stickerSet4.set.id);
                            this.K.l(tL_messages_stickerSet4.set.id);
                            this.O.remove(tL_messages_stickerSet4.set.short_name);
                        }
                        i4 = i3;
                    } else {
                        i3++;
                        tL_messages_stickerSet = tL_messages_stickerSet3;
                    }
                }
                long s = s(arrayListArr[i2]);
                this.Y[i2] = s;
                int i5 = i2;
                M1(i5, this.Z[i2], s, arrayListArr[i2]);
                final int i6 = i5;
                zh6 zh6Var2 = this.U;
                if (i != 2) {
                    Runnable runnable2 = (Runnable) zh6Var2.f(stickerSet2.id);
                    if (runnable2 != null) {
                        runnable2.run();
                    } else {
                        j2(context, i, eVar, frameLayout, z, tLObject, stickerSet2, document, i6, z2);
                    }
                } else if (!z2 || eVar == null) {
                    j2(context, i, eVar, frameLayout, z, tLObject, stickerSet2, document, i6, false);
                } else {
                    l3b l3bVar = new l3b(context, tLObject, 1, i, document, eVar.getResourceProvider());
                    final boolean[] zArr = new boolean[1];
                    h1(stickerSet2.id, true);
                    t21 t21Var = new t21(null, context, false);
                    final int i7 = i4;
                    final TLRPC.StickerSet stickerSet3 = stickerSet2;
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = tL_messages_stickerSet3;
                    t21Var.b = new Runnable() { // from class: vp6
                        @Override // java.lang.Runnable
                        public final void run() {
                            ls6 ls6Var = ls6.this;
                            long[] jArr = ls6Var.Y;
                            ArrayList[] arrayListArr2 = ls6Var.H;
                            boolean[] zArr2 = zArr;
                            if (zArr2[0]) {
                                return;
                            }
                            zArr2[0] = true;
                            TLRPC.StickerSet stickerSet4 = stickerSet3;
                            ls6Var.h1(stickerSet4.id, false);
                            stickerSet4.archived = false;
                            byte b = i6;
                            ArrayList arrayList = arrayListArr2[b];
                            int i8 = i7;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = tL_messages_stickerSet5;
                            arrayList.add(i8, tL_messages_stickerSet6);
                            ls6Var.J.k(stickerSet4.id, tL_messages_stickerSet6);
                            ls6Var.K.k(stickerSet4.id, tL_messages_stickerSet6);
                            String str = stickerSet4.short_name;
                            if (str != null) {
                                ls6Var.O.put(str.toLowerCase(), tL_messages_stickerSet6);
                            }
                            ls6Var.U.l(stickerSet4.id);
                            long s2 = ls6.s(arrayListArr2[b]);
                            jArr[b] = s2;
                            ls6Var.M1(b, ls6Var.Z[b], s2, arrayListArr2[b]);
                            Runnable runnable3 = runnable;
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                            ls6Var.getNotificationCenter().k(jn7.x0, Integer.valueOf(b), Boolean.TRUE);
                        }
                    };
                    Runnable runnable3 = new Runnable() { // from class: wp6
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean[] zArr2 = zArr;
                            if (zArr2[0]) {
                                return;
                            }
                            zArr2[0] = true;
                            ls6.this.j2(context, i, eVar, frameLayout, z, tLObject, stickerSet3, document, i6, false);
                        }
                    };
                    i6 = i6;
                    t21Var.c = runnable3;
                    l3bVar.setButton(t21Var);
                    zh6Var2.k(stickerSet3.id, new z96(t21Var, (byte) 17));
                    if (frameLayout != null) {
                        v21.f(frameLayout, l3bVar, 2750).j();
                    } else {
                        v21.g(eVar, l3bVar, 2750).j();
                    }
                }
                getNotificationCenter().k(jn7.x0, Integer.valueOf(i6), Boolean.TRUE);
            }
            tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) zh6Var.f(stickerSet.id);
            if (tL_messages_stickerSet2 == null) {
                return;
            }
        }
        tL_messages_stickerSet = tL_messages_stickerSet2;
        stickerSet2 = stickerSet;
        if (!stickerSet2.masks) {
        }
        stickerSet2.archived = i != 1;
        i3 = 0;
        while (true) {
            arrayListArr = this.H;
            if (i3 < arrayListArr[i2].size()) {
            }
            i3++;
            tL_messages_stickerSet = tL_messages_stickerSet3;
        }
        long s2 = s(arrayListArr[i2]);
        this.Y[i2] = s2;
        int i52 = i2;
        M1(i52, this.Z[i2], s2, arrayListArr[i2]);
        final int i62 = i52;
        zh6 zh6Var22 = this.U;
        if (i != 2) {
        }
        getNotificationCenter().k(jn7.x0, Integer.valueOf(i62), Boolean.TRUE);
    }

    public final ArrayList j0(int i, boolean z) {
        ArrayList[] arrayListArr = this.g0;
        ArrayList arrayList = arrayListArr[i];
        if (i == 7) {
            return new ArrayList(arrayListArr[i]);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(0, Math.min(arrayList.size(), 20)));
        if (z && !arrayList2.isEmpty()) {
            arrayList2.add(0, new TLRPC.TL_documentEmpty());
        }
        return arrayList2;
    }

    public final void j1(String str, TLRPC.Document document, boolean z) {
        this.a0.remove(str);
        wm9 wm9Var = this.A0;
        ArrayList arrayList = wm9Var.e;
        boolean z2 = true;
        if (z) {
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    z2 = false;
                    break;
                } else {
                    if (((vm9) arrayList.get(i)).d && str.equals(((vm9) arrayList.get(i)).b)) {
                        arrayList.remove(i);
                        break;
                    }
                    i++;
                }
            }
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    z2 = false;
                    break;
                } else {
                    if (((vm9) arrayList.get(i2)).d && str.equals(((vm9) arrayList.get(i2)).b)) {
                        ((vm9) arrayList.get(i2)).d = false;
                        ((vm9) arrayList.get(i2)).a = document;
                        break;
                    }
                    i2++;
                }
            }
            if (z2) {
                wm9Var.h();
            }
        }
        if (z2) {
            jn7.f(wm9Var.c).k(jn7.h5, new Object[0]);
        }
    }

    public final void j2(final Context context, int i, final e eVar, final FrameLayout frameLayout, final boolean z, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final int i2, final boolean z2) {
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        long j = stickerSet.id;
        tL_inputStickerSetID.id = j;
        if (i == 0) {
            h1(j, true);
            TLRPC.TL_messages_uninstallStickerSet tL_messages_uninstallStickerSet = new TLRPC.TL_messages_uninstallStickerSet();
            tL_messages_uninstallStickerSet.stickerset = tL_inputStickerSetID;
            getConnectionsManager().sendRequest(tL_messages_uninstallStickerSet, new RequestDelegate() { // from class: sq6
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    hl.c3(new sb4((Object) ls6.this, (Object) stickerSet, (int) i2, (byte) 8));
                }
            });
            return;
        }
        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
        tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
        tL_messages_installStickerSet.archived = i == 1;
        g1(stickerSet.id, true);
        getConnectionsManager().sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: rq6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                final ls6 ls6Var = ls6.this;
                final TLRPC.StickerSet stickerSet2 = stickerSet;
                final e eVar2 = eVar;
                final boolean z3 = z;
                final byte b = i2;
                final boolean z4 = z2;
                final FrameLayout frameLayout2 = frameLayout;
                final Context context2 = context;
                final TLObject tLObject3 = tLObject;
                final TLRPC.Document document2 = document;
                hl.c3(new Runnable() { // from class: yq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        ls6 ls6Var2 = ls6.this;
                        zh6 zh6Var = ls6Var2.U;
                        TLRPC.StickerSet stickerSet3 = stickerSet2;
                        zh6Var.l(stickerSet3.id);
                        TLObject tLObject4 = tLObject2;
                        boolean z5 = tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive;
                        e eVar3 = eVar2;
                        byte b3 = b;
                        if (z5) {
                            ls6Var2.C1(eVar3, z3, b3, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                        }
                        ls6Var2.c1(b3, false, false, true, new jr6(ls6Var2, stickerSet3, (byte) 0));
                        if (tL_error == null && z4) {
                            FrameLayout frameLayout3 = frameLayout2;
                            Context context3 = context2;
                            TLObject tLObject5 = tLObject3;
                            TLRPC.Document document3 = document2;
                            if (frameLayout3 != null) {
                                v21.f(frameLayout3, new l3b(context3, tLObject5, 1, 2, document3, eVar3.getResourceProvider()), 1500).j();
                            } else if (eVar3 != null) {
                                v21.g(eVar3, new l3b(context3, tLObject5, 1, 2, document3, eVar3.getResourceProvider()), 1500).j();
                            }
                        }
                    }
                });
            }
        });
    }

    public final SharedPreferences k() {
        if (this.s1 == null) {
            SharedPreferences k = bp1.k(new StringBuilder("ai_chat_styles"), this.currentAccount, a.b, 0);
            this.s1 = k;
            for (Map.Entry<String, ?> entry : k.getAll().entrySet()) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.v((String) entry.getValue()));
                    TL_aicompose.inputAiComposeStyle TLdeserialize = TL_aicompose.inputAiComposeStyle.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                    if (TLdeserialize != null) {
                        this.r1.k(Utilities.A(entry.getKey()).longValue(), TLdeserialize);
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
        return this.s1;
    }

    public final int k0() {
        ArrayList arrayList = this.a1;
        boolean isEmpty = arrayList.isEmpty();
        int[] iArr = this.X0;
        return isEmpty ? Math.max(Math.max(iArr[0] + iArr[1], this.W0), arrayList.size()) : Math.max(iArr[0] + iArr[1], arrayList.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1 A[Catch: Exception -> 0x00f9, TryCatch #0 {Exception -> 0x00f9, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x0013, B:8:0x0031, B:10:0x0035, B:11:0x0044, B:13:0x004d, B:17:0x005f, B:19:0x0066, B:21:0x007b, B:26:0x00b8, B:28:0x00d1, B:29:0x00da, B:31:0x00d6, B:34:0x00bd, B:35:0x00c6, B:37:0x00ca, B:40:0x008a, B:42:0x0090, B:43:0x00a0, B:45:0x00a6), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6 A[Catch: Exception -> 0x00f9, TryCatch #0 {Exception -> 0x00f9, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x0013, B:8:0x0031, B:10:0x0035, B:11:0x0044, B:13:0x004d, B:17:0x005f, B:19:0x0066, B:21:0x007b, B:26:0x00b8, B:28:0x00d1, B:29:0x00da, B:31:0x00d6, B:34:0x00bd, B:35:0x00c6, B:37:0x00ca, B:40:0x008a, B:42:0x0090, B:43:0x00a0, B:45:0x00a6), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k2(int i, long j) {
        TLRPC.Chat M0;
        TLRPC.User X12;
        String m;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26) {
                ArrayList arrayList = new ArrayList();
                if (i == 0) {
                    arrayList.add("sdid_" + j);
                    arrayList.add("ndid_" + j);
                }
                if (i == f2) {
                    arrayList.add("bdid_" + j);
                }
                mka.o(a.b, arrayList);
                if (i2 >= 30) {
                    vr9.b(a.b.getSystemService(vr9.i())).removeLongLivedShortcuts(arrayList);
                    return;
                }
                return;
            }
            TLRPC.User user = null;
            if (wf3.B(j)) {
                TLRPC.EncryptedChat a1 = getMessagesController().a1(Integer.valueOf((int) (4294967295L & j)));
                if (a1 == null) {
                    return;
                } else {
                    X12 = getMessagesController().X1(Long.valueOf(a1.user_id));
                }
            } else {
                if (!wf3.D(j)) {
                    if (wf3.y(j)) {
                        M0 = getMessagesController().M0(Long.valueOf(-j));
                        if (user == null) {
                            m = i == 0 ? lv2.m(0, user.first_name, user.last_name) : i == f2 ? user.first_name : "";
                        } else if (M0 == null) {
                            return;
                        } else {
                            m = M0.title;
                        }
                        Intent K = i != 0 ? K(j) : J(j);
                        Intent intent = new Intent();
                        intent.putExtra("android.intent.extra.shortcut.INTENT", K);
                        intent.putExtra("android.intent.extra.shortcut.NAME", m);
                        intent.putExtra("duplicate", false);
                        intent.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
                        a.b.sendBroadcast(intent);
                    }
                    return;
                }
                X12 = getMessagesController().X1(Long.valueOf(j));
            }
            user = X12;
            M0 = null;
            if (user == null) {
            }
            if (i != 0) {
            }
            Intent intent2 = new Intent();
            intent2.putExtra("android.intent.extra.shortcut.INTENT", K);
            intent2.putExtra("android.intent.extra.shortcut.NAME", m);
            intent2.putExtra("duplicate", false);
            intent2.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
            a.b.sendBroadcast(intent2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final boolean l(long j) {
        for (int i = 0; i < this.b.bots.size(); i++) {
            if (this.b.bots.get(i).bot_id == j) {
                return true;
            }
        }
        return false;
    }

    public final void l1() {
        ArrayList arrayList = this.h;
        if (arrayList == null || this.y || !i86.e(8200) || this.currentAccount != yac.t0) {
            return;
        }
        this.y = true;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int min = Math.min(arrayList2.size(), 10);
        for (int i = 0; i < min; i++) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList2.get(i);
            m1(jn5.b(tL_availableReaction.activate_animation), 0);
            m1(jn5.b(tL_availableReaction.appear_animation), 0);
        }
        for (int i2 = 0; i2 < min; i2++) {
            m1(jn5.b(((TLRPC.TL_availableReaction) arrayList2.get(i2)).effect_animation), 0);
        }
    }

    public final void l2(long j, TL_update.TL_updateBotCommands tL_updateBotCommands) {
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.y1.get(tL_updateBotCommands.bot_id + "_" + j);
        if (botInfo != null) {
            botInfo.commands = tL_updateBotCommands.commands;
            getNotificationCenter().k(jn7.D0, botInfo, 0);
        }
        getMessagesStorage().a.c(new cq6((Object) this, (Object) tL_updateBotCommands, j, (byte) 0));
    }

    public final ArrayList m(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean z, boolean z2) {
        if (arrayList.isEmpty()) {
            return null;
        }
        zh6 zh6Var = new zh6();
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i);
            zh6Var.k(user.id, user);
        }
        zh6 zh6Var2 = new zh6();
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i2);
            zh6Var2.k(chat.id, chat);
        }
        ArrayList arrayList4 = new ArrayList();
        if (!z2) {
            hl.c3(new oq6(this, arrayList2, z, arrayList3, arrayList, arrayList4, zh6Var, zh6Var2, (byte) 0));
            return null;
        }
        hl.c3(new lg((Object) this, (Object) arrayList2, z, (Object) arrayList3, (byte) 25));
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i4);
            if ((r47.n1(message) instanceof TLRPC.TL_messageMediaDocument) || (r47.n1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                i3++;
            }
            zh6 zh6Var3 = zh6Var2;
            int i5 = i3;
            arrayList4.add(new r47(this.currentAccount, message, zh6Var, zh6Var3, false, i5 < 30));
            i4++;
            zh6Var2 = zh6Var3;
            i3 = i5;
        }
        return arrayList4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TLRPC.TL_messages_stickerSet m0(final TLRPC.InputStickerSet inputStickerSet, final Integer num, final boolean z, boolean z2, final pcc pccVar) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        if (inputStickerSet != null) {
            boolean z3 = inputStickerSet instanceof TLRPC.TL_inputStickerSetID;
            if (z3) {
                long j = inputStickerSet.id;
                zh6 zh6Var = this.J;
                if (zh6Var.d(j)) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) zh6Var.f(inputStickerSet.id);
                    if (tL_messages_stickerSet != null) {
                        if (!z2 && pccVar != null) {
                            pccVar.a(tL_messages_stickerSet);
                        }
                        return tL_messages_stickerSet;
                    }
                    final String y0 = y0(inputStickerSet);
                    HashSet hashSet = this.J0;
                    if (pccVar != null || !hashSet.contains(y0)) {
                        hashSet.add(y0);
                        if (z3) {
                            final byte b = 0;
                            getMessagesStorage().a.c(new Runnable(this) { // from class: ir6
                                public final /* synthetic */ ls6 b;

                                {
                                    this.b = this;
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
                                
                                    if (r5 != null) goto L29;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:95:0x0110, code lost:
                                
                                    if (r5 != null) goto L75;
                                 */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                                    SQLiteCursor sQLiteCursor;
                                    SQLiteCursor sQLiteCursor2;
                                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet3;
                                    int intValue;
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4;
                                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet5;
                                    int intValue2;
                                    byte b3 = b;
                                    NativeByteBuffer nativeByteBuffer = null;
                                    Integer num2 = num;
                                    switch (b3) {
                                        case 0:
                                            final ls6 ls6Var = this.b;
                                            final TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
                                            try {
                                                sQLiteCursor = ls6Var.getMessagesStorage().b.queryFinalized("SELECT data, hash FROM stickersets2 WHERE id = ? LIMIT 1", Long.valueOf(inputStickerSet2.id));
                                                try {
                                                } catch (Throwable th) {
                                                    th = th;
                                                    tL_messages_stickerSet2 = null;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                tL_messages_stickerSet2 = null;
                                                sQLiteCursor = null;
                                            }
                                            if (!sQLiteCursor.next() || sQLiteCursor.isNull(0)) {
                                                tL_messages_stickerSet2 = null;
                                            } else {
                                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                                                if (byteBufferValue != null) {
                                                    try {
                                                        tL_messages_stickerSet2 = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        tL_messages_stickerSet2 = null;
                                                    }
                                                    try {
                                                        intValue = sQLiteCursor.intValue(1);
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        nativeByteBuffer = byteBufferValue;
                                                        try {
                                                            cc4.g(th, true);
                                                            if (nativeByteBuffer != null) {
                                                                nativeByteBuffer.reuse();
                                                                break;
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    if (num2 != null && num2.intValue() != 0) {
                                                        if (num2.intValue() != intValue) {
                                                            byteBufferValue.reuse();
                                                            sQLiteCursor.dispose();
                                                            tL_messages_stickerSet3 = null;
                                                            final byte b4 = 1;
                                                            final String str2 = y0;
                                                            final pcc pccVar2 = pccVar;
                                                            final boolean z4 = z;
                                                            hl.c3(new Runnable() { // from class: pr6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    byte b5 = b4;
                                                                    TLRPC.InputStickerSet inputStickerSet3 = inputStickerSet2;
                                                                    boolean z5 = z4;
                                                                    final pcc pccVar3 = pccVar2;
                                                                    final String str3 = str2;
                                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = tL_messages_stickerSet3;
                                                                    final ls6 ls6Var2 = ls6Var;
                                                                    final byte b6 = 1;
                                                                    final byte b7 = 0;
                                                                    switch (b5) {
                                                                        case 0:
                                                                            HashSet hashSet2 = ls6Var2.J0;
                                                                            if (tL_messages_stickerSet6 == null) {
                                                                                if (!z5) {
                                                                                    ls6Var2.P(inputStickerSet3, new icc() { // from class: jp6
                                                                                        @Override // icc
                                                                                        public final void a(Object obj, Object obj2) {
                                                                                            TLRPC.StickerSet stickerSet;
                                                                                            TLRPC.StickerSet stickerSet2;
                                                                                            byte b8 = b6;
                                                                                            pcc pccVar4 = pccVar3;
                                                                                            String str4 = str3;
                                                                                            ls6 ls6Var3 = ls6Var2;
                                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                                            switch (b8) {
                                                                                                case 0:
                                                                                                    ls6Var3.J0.remove(str4);
                                                                                                    if (pccVar4 != null) {
                                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet = tL_messages_stickerSet7.set) != null) {
                                                                                                        ls6Var3.J.k(stickerSet.id, tL_messages_stickerSet7);
                                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    ls6Var3.J0.remove(str4);
                                                                                                    if (pccVar4 != null) {
                                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                                        ls6Var3.J.k(stickerSet2.id, tL_messages_stickerSet7);
                                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    });
                                                                                    break;
                                                                                } else {
                                                                                    hashSet2.remove(str3);
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                hashSet2.remove(str3);
                                                                                if (pccVar3 != null) {
                                                                                    pccVar3.a(tL_messages_stickerSet6);
                                                                                }
                                                                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet6.set;
                                                                                if (stickerSet != null) {
                                                                                    ls6Var2.J.k(stickerSet.id, tL_messages_stickerSet6);
                                                                                    ls6Var2.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                                }
                                                                                ls6Var2.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                                break;
                                                                            }
                                                                        default:
                                                                            HashSet hashSet3 = ls6Var2.J0;
                                                                            if (tL_messages_stickerSet6 == null) {
                                                                                if (!z5) {
                                                                                    ls6Var2.P(inputStickerSet3, new icc() { // from class: jp6
                                                                                        @Override // icc
                                                                                        public final void a(Object obj, Object obj2) {
                                                                                            TLRPC.StickerSet stickerSet2;
                                                                                            TLRPC.StickerSet stickerSet22;
                                                                                            byte b8 = b7;
                                                                                            pcc pccVar4 = pccVar3;
                                                                                            String str4 = str3;
                                                                                            ls6 ls6Var3 = ls6Var2;
                                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                                            switch (b8) {
                                                                                                case 0:
                                                                                                    ls6Var3.J0.remove(str4);
                                                                                                    if (pccVar4 != null) {
                                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                                        ls6Var3.J.k(stickerSet2.id, tL_messages_stickerSet7);
                                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    ls6Var3.J0.remove(str4);
                                                                                                    if (pccVar4 != null) {
                                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                                        ls6Var3.J.k(stickerSet22.id, tL_messages_stickerSet7);
                                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    });
                                                                                    break;
                                                                                } else {
                                                                                    hashSet3.remove(str3);
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                hashSet3.remove(str3);
                                                                                if (pccVar3 != null) {
                                                                                    pccVar3.a(tL_messages_stickerSet6);
                                                                                }
                                                                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet6.set;
                                                                                if (stickerSet2 != null) {
                                                                                    ls6Var2.J.k(stickerSet2.id, tL_messages_stickerSet6);
                                                                                    ls6Var2.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                                }
                                                                                ls6Var2.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    tL_messages_stickerSet2 = null;
                                                }
                                                nativeByteBuffer = byteBufferValue;
                                            }
                                            if (nativeByteBuffer != null) {
                                                nativeByteBuffer.reuse();
                                            }
                                            sQLiteCursor.dispose();
                                            tL_messages_stickerSet3 = tL_messages_stickerSet2;
                                            final byte b42 = 1;
                                            final String str22 = y0;
                                            final pcc pccVar22 = pccVar;
                                            final boolean z42 = z;
                                            hl.c3(new Runnable() { // from class: pr6
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b5 = b42;
                                                    TLRPC.InputStickerSet inputStickerSet3 = inputStickerSet2;
                                                    boolean z5 = z42;
                                                    final pcc pccVar3 = pccVar22;
                                                    final String str3 = str22;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = tL_messages_stickerSet3;
                                                    final ls6 ls6Var2 = ls6Var;
                                                    final byte b6 = 1;
                                                    final byte b7 = 0;
                                                    switch (b5) {
                                                        case 0:
                                                            HashSet hashSet2 = ls6Var2.J0;
                                                            if (tL_messages_stickerSet6 == null) {
                                                                if (!z5) {
                                                                    ls6Var2.P(inputStickerSet3, new icc() { // from class: jp6
                                                                        @Override // icc
                                                                        public final void a(Object obj, Object obj2) {
                                                                            TLRPC.StickerSet stickerSet2;
                                                                            TLRPC.StickerSet stickerSet22;
                                                                            byte b8 = b6;
                                                                            pcc pccVar4 = pccVar3;
                                                                            String str4 = str3;
                                                                            ls6 ls6Var3 = ls6Var2;
                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                            switch (b8) {
                                                                                case 0:
                                                                                    ls6Var3.J0.remove(str4);
                                                                                    if (pccVar4 != null) {
                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                        ls6Var3.J.k(stickerSet2.id, tL_messages_stickerSet7);
                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    ls6Var3.J0.remove(str4);
                                                                                    if (pccVar4 != null) {
                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                        ls6Var3.J.k(stickerSet22.id, tL_messages_stickerSet7);
                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                                } else {
                                                                    hashSet2.remove(str3);
                                                                    break;
                                                                }
                                                            } else {
                                                                hashSet2.remove(str3);
                                                                if (pccVar3 != null) {
                                                                    pccVar3.a(tL_messages_stickerSet6);
                                                                }
                                                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet6.set;
                                                                if (stickerSet != null) {
                                                                    ls6Var2.J.k(stickerSet.id, tL_messages_stickerSet6);
                                                                    ls6Var2.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                }
                                                                ls6Var2.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                break;
                                                            }
                                                        default:
                                                            HashSet hashSet3 = ls6Var2.J0;
                                                            if (tL_messages_stickerSet6 == null) {
                                                                if (!z5) {
                                                                    ls6Var2.P(inputStickerSet3, new icc() { // from class: jp6
                                                                        @Override // icc
                                                                        public final void a(Object obj, Object obj2) {
                                                                            TLRPC.StickerSet stickerSet2;
                                                                            TLRPC.StickerSet stickerSet22;
                                                                            byte b8 = b7;
                                                                            pcc pccVar4 = pccVar3;
                                                                            String str4 = str3;
                                                                            ls6 ls6Var3 = ls6Var2;
                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                            switch (b8) {
                                                                                case 0:
                                                                                    ls6Var3.J0.remove(str4);
                                                                                    if (pccVar4 != null) {
                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                        ls6Var3.J.k(stickerSet2.id, tL_messages_stickerSet7);
                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    ls6Var3.J0.remove(str4);
                                                                                    if (pccVar4 != null) {
                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                        ls6Var3.J.k(stickerSet22.id, tL_messages_stickerSet7);
                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                                } else {
                                                                    hashSet3.remove(str3);
                                                                    break;
                                                                }
                                                            } else {
                                                                hashSet3.remove(str3);
                                                                if (pccVar3 != null) {
                                                                    pccVar3.a(tL_messages_stickerSet6);
                                                                }
                                                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet6.set;
                                                                if (stickerSet2 != null) {
                                                                    ls6Var2.J.k(stickerSet2.id, tL_messages_stickerSet6);
                                                                    ls6Var2.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                }
                                                                ls6Var2.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                break;
                                                            }
                                                    }
                                                }
                                            });
                                            return;
                                        default:
                                            final ls6 ls6Var2 = this.b;
                                            final TLRPC.InputStickerSet inputStickerSet3 = inputStickerSet;
                                            try {
                                                sQLiteCursor2 = ls6Var2.getMessagesStorage().b.queryFinalized("SELECT data, hash FROM stickersets2 WHERE short_name = ? LIMIT 1", inputStickerSet3.short_name.toLowerCase());
                                                try {
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    tL_messages_stickerSet4 = null;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                tL_messages_stickerSet4 = null;
                                                sQLiteCursor2 = null;
                                            }
                                            if (!sQLiteCursor2.next() || sQLiteCursor2.isNull(0)) {
                                                tL_messages_stickerSet4 = null;
                                            } else {
                                                NativeByteBuffer byteBufferValue2 = sQLiteCursor2.byteBufferValue(0);
                                                if (byteBufferValue2 != null) {
                                                    try {
                                                        tL_messages_stickerSet4 = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                                        try {
                                                            intValue2 = sQLiteCursor2.intValue(1);
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            nativeByteBuffer = byteBufferValue2;
                                                            try {
                                                                cc4.g(th, true);
                                                                if (nativeByteBuffer != null) {
                                                                    nativeByteBuffer.reuse();
                                                                    break;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        tL_messages_stickerSet4 = null;
                                                    }
                                                    if (num2 != null && num2.intValue() != 0) {
                                                        if (num2.intValue() != intValue2) {
                                                            byteBufferValue2.reuse();
                                                            sQLiteCursor2.dispose();
                                                            tL_messages_stickerSet5 = null;
                                                            final byte b5 = 0;
                                                            final String str3 = y0;
                                                            final pcc pccVar3 = pccVar;
                                                            final boolean z5 = z;
                                                            hl.c3(new Runnable() { // from class: pr6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    byte b52 = b5;
                                                                    TLRPC.InputStickerSet inputStickerSet32 = inputStickerSet3;
                                                                    boolean z52 = z5;
                                                                    final pcc pccVar32 = pccVar3;
                                                                    final String str32 = str3;
                                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = tL_messages_stickerSet5;
                                                                    final ls6 ls6Var22 = ls6Var2;
                                                                    final byte b6 = 1;
                                                                    final byte b7 = 0;
                                                                    switch (b52) {
                                                                        case 0:
                                                                            HashSet hashSet2 = ls6Var22.J0;
                                                                            if (tL_messages_stickerSet6 == null) {
                                                                                if (!z52) {
                                                                                    ls6Var22.P(inputStickerSet32, new icc() { // from class: jp6
                                                                                        @Override // icc
                                                                                        public final void a(Object obj, Object obj2) {
                                                                                            TLRPC.StickerSet stickerSet2;
                                                                                            TLRPC.StickerSet stickerSet22;
                                                                                            byte b8 = b6;
                                                                                            pcc pccVar4 = pccVar32;
                                                                                            String str4 = str32;
                                                                                            ls6 ls6Var3 = ls6Var22;
                                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                                            switch (b8) {
                                                                                                case 0:
                                                                                                    ls6Var3.J0.remove(str4);
                                                                                                    if (pccVar4 != null) {
                                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                                        ls6Var3.J.k(stickerSet2.id, tL_messages_stickerSet7);
                                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    ls6Var3.J0.remove(str4);
                                                                                                    if (pccVar4 != null) {
                                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                                        ls6Var3.J.k(stickerSet22.id, tL_messages_stickerSet7);
                                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    });
                                                                                    break;
                                                                                } else {
                                                                                    hashSet2.remove(str32);
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                hashSet2.remove(str32);
                                                                                if (pccVar32 != null) {
                                                                                    pccVar32.a(tL_messages_stickerSet6);
                                                                                }
                                                                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet6.set;
                                                                                if (stickerSet != null) {
                                                                                    ls6Var22.J.k(stickerSet.id, tL_messages_stickerSet6);
                                                                                    ls6Var22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                                }
                                                                                ls6Var22.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                                break;
                                                                            }
                                                                        default:
                                                                            HashSet hashSet3 = ls6Var22.J0;
                                                                            if (tL_messages_stickerSet6 == null) {
                                                                                if (!z52) {
                                                                                    ls6Var22.P(inputStickerSet32, new icc() { // from class: jp6
                                                                                        @Override // icc
                                                                                        public final void a(Object obj, Object obj2) {
                                                                                            TLRPC.StickerSet stickerSet2;
                                                                                            TLRPC.StickerSet stickerSet22;
                                                                                            byte b8 = b7;
                                                                                            pcc pccVar4 = pccVar32;
                                                                                            String str4 = str32;
                                                                                            ls6 ls6Var3 = ls6Var22;
                                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                                            switch (b8) {
                                                                                                case 0:
                                                                                                    ls6Var3.J0.remove(str4);
                                                                                                    if (pccVar4 != null) {
                                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                                        ls6Var3.J.k(stickerSet2.id, tL_messages_stickerSet7);
                                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    ls6Var3.J0.remove(str4);
                                                                                                    if (pccVar4 != null) {
                                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                                        ls6Var3.J.k(stickerSet22.id, tL_messages_stickerSet7);
                                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    });
                                                                                    break;
                                                                                } else {
                                                                                    hashSet3.remove(str32);
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                hashSet3.remove(str32);
                                                                                if (pccVar32 != null) {
                                                                                    pccVar32.a(tL_messages_stickerSet6);
                                                                                }
                                                                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet6.set;
                                                                                if (stickerSet2 != null) {
                                                                                    ls6Var22.J.k(stickerSet2.id, tL_messages_stickerSet6);
                                                                                    ls6Var22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                                }
                                                                                ls6Var22.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    tL_messages_stickerSet4 = null;
                                                }
                                                nativeByteBuffer = byteBufferValue2;
                                            }
                                            if (nativeByteBuffer != null) {
                                                nativeByteBuffer.reuse();
                                            }
                                            sQLiteCursor2.dispose();
                                            tL_messages_stickerSet5 = tL_messages_stickerSet4;
                                            final byte b52 = 0;
                                            final String str32 = y0;
                                            final pcc pccVar32 = pccVar;
                                            final boolean z52 = z;
                                            hl.c3(new Runnable() { // from class: pr6
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b522 = b52;
                                                    TLRPC.InputStickerSet inputStickerSet32 = inputStickerSet3;
                                                    boolean z522 = z52;
                                                    final pcc pccVar322 = pccVar32;
                                                    final String str322 = str32;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = tL_messages_stickerSet5;
                                                    final ls6 ls6Var22 = ls6Var2;
                                                    final byte b6 = 1;
                                                    final byte b7 = 0;
                                                    switch (b522) {
                                                        case 0:
                                                            HashSet hashSet2 = ls6Var22.J0;
                                                            if (tL_messages_stickerSet6 == null) {
                                                                if (!z522) {
                                                                    ls6Var22.P(inputStickerSet32, new icc() { // from class: jp6
                                                                        @Override // icc
                                                                        public final void a(Object obj, Object obj2) {
                                                                            TLRPC.StickerSet stickerSet2;
                                                                            TLRPC.StickerSet stickerSet22;
                                                                            byte b8 = b6;
                                                                            pcc pccVar4 = pccVar322;
                                                                            String str4 = str322;
                                                                            ls6 ls6Var3 = ls6Var22;
                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                            switch (b8) {
                                                                                case 0:
                                                                                    ls6Var3.J0.remove(str4);
                                                                                    if (pccVar4 != null) {
                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                        ls6Var3.J.k(stickerSet2.id, tL_messages_stickerSet7);
                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    ls6Var3.J0.remove(str4);
                                                                                    if (pccVar4 != null) {
                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                        ls6Var3.J.k(stickerSet22.id, tL_messages_stickerSet7);
                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                                } else {
                                                                    hashSet2.remove(str322);
                                                                    break;
                                                                }
                                                            } else {
                                                                hashSet2.remove(str322);
                                                                if (pccVar322 != null) {
                                                                    pccVar322.a(tL_messages_stickerSet6);
                                                                }
                                                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet6.set;
                                                                if (stickerSet != null) {
                                                                    ls6Var22.J.k(stickerSet.id, tL_messages_stickerSet6);
                                                                    ls6Var22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                }
                                                                ls6Var22.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                break;
                                                            }
                                                        default:
                                                            HashSet hashSet3 = ls6Var22.J0;
                                                            if (tL_messages_stickerSet6 == null) {
                                                                if (!z522) {
                                                                    ls6Var22.P(inputStickerSet32, new icc() { // from class: jp6
                                                                        @Override // icc
                                                                        public final void a(Object obj, Object obj2) {
                                                                            TLRPC.StickerSet stickerSet2;
                                                                            TLRPC.StickerSet stickerSet22;
                                                                            byte b8 = b7;
                                                                            pcc pccVar4 = pccVar322;
                                                                            String str4 = str322;
                                                                            ls6 ls6Var3 = ls6Var22;
                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                            switch (b8) {
                                                                                case 0:
                                                                                    ls6Var3.J0.remove(str4);
                                                                                    if (pccVar4 != null) {
                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                        ls6Var3.J.k(stickerSet2.id, tL_messages_stickerSet7);
                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    ls6Var3.J0.remove(str4);
                                                                                    if (pccVar4 != null) {
                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                        ls6Var3.J.k(stickerSet22.id, tL_messages_stickerSet7);
                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                                } else {
                                                                    hashSet3.remove(str322);
                                                                    break;
                                                                }
                                                            } else {
                                                                hashSet3.remove(str322);
                                                                if (pccVar322 != null) {
                                                                    pccVar322.a(tL_messages_stickerSet6);
                                                                }
                                                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet6.set;
                                                                if (stickerSet2 != null) {
                                                                    ls6Var22.J.k(stickerSet2.id, tL_messages_stickerSet6);
                                                                    ls6Var22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                }
                                                                ls6Var22.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                break;
                                                            }
                                                    }
                                                }
                                            });
                                            return;
                                    }
                                }
                            });
                            return null;
                        }
                        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) {
                            final byte b3 = 1;
                            getMessagesStorage().a.c(new Runnable(this) { // from class: ir6
                                public final /* synthetic */ ls6 b;

                                {
                                    this.b = this;
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
                                
                                    if (r5 != null) goto L29;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:95:0x0110, code lost:
                                
                                    if (r5 != null) goto L75;
                                 */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                                    SQLiteCursor sQLiteCursor;
                                    SQLiteCursor sQLiteCursor2;
                                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet3;
                                    int intValue;
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4;
                                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet5;
                                    int intValue2;
                                    byte b32 = b3;
                                    NativeByteBuffer nativeByteBuffer = null;
                                    Integer num2 = num;
                                    switch (b32) {
                                        case 0:
                                            final ls6 ls6Var = this.b;
                                            final TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
                                            try {
                                                sQLiteCursor = ls6Var.getMessagesStorage().b.queryFinalized("SELECT data, hash FROM stickersets2 WHERE id = ? LIMIT 1", Long.valueOf(inputStickerSet2.id));
                                                try {
                                                } catch (Throwable th) {
                                                    th = th;
                                                    tL_messages_stickerSet2 = null;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                tL_messages_stickerSet2 = null;
                                                sQLiteCursor = null;
                                            }
                                            if (!sQLiteCursor.next() || sQLiteCursor.isNull(0)) {
                                                tL_messages_stickerSet2 = null;
                                            } else {
                                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                                                if (byteBufferValue != null) {
                                                    try {
                                                        tL_messages_stickerSet2 = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        tL_messages_stickerSet2 = null;
                                                    }
                                                    try {
                                                        intValue = sQLiteCursor.intValue(1);
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        nativeByteBuffer = byteBufferValue;
                                                        try {
                                                            cc4.g(th, true);
                                                            if (nativeByteBuffer != null) {
                                                                nativeByteBuffer.reuse();
                                                                break;
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    if (num2 != null && num2.intValue() != 0) {
                                                        if (num2.intValue() != intValue) {
                                                            byteBufferValue.reuse();
                                                            sQLiteCursor.dispose();
                                                            tL_messages_stickerSet3 = null;
                                                            final byte b42 = 1;
                                                            final String str22 = y0;
                                                            final pcc pccVar22 = pccVar;
                                                            final boolean z42 = z;
                                                            hl.c3(new Runnable() { // from class: pr6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    byte b522 = b42;
                                                                    TLRPC.InputStickerSet inputStickerSet32 = inputStickerSet2;
                                                                    boolean z522 = z42;
                                                                    final pcc pccVar322 = pccVar22;
                                                                    final String str322 = str22;
                                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = tL_messages_stickerSet3;
                                                                    final ls6 ls6Var22 = ls6Var;
                                                                    final byte b6 = 1;
                                                                    final byte b7 = 0;
                                                                    switch (b522) {
                                                                        case 0:
                                                                            HashSet hashSet2 = ls6Var22.J0;
                                                                            if (tL_messages_stickerSet6 == null) {
                                                                                if (!z522) {
                                                                                    ls6Var22.P(inputStickerSet32, new icc() { // from class: jp6
                                                                                        @Override // icc
                                                                                        public final void a(Object obj, Object obj2) {
                                                                                            TLRPC.StickerSet stickerSet2;
                                                                                            TLRPC.StickerSet stickerSet22;
                                                                                            byte b8 = b6;
                                                                                            pcc pccVar4 = pccVar322;
                                                                                            String str4 = str322;
                                                                                            ls6 ls6Var3 = ls6Var22;
                                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                                            switch (b8) {
                                                                                                case 0:
                                                                                                    ls6Var3.J0.remove(str4);
                                                                                                    if (pccVar4 != null) {
                                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                                        ls6Var3.J.k(stickerSet2.id, tL_messages_stickerSet7);
                                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    ls6Var3.J0.remove(str4);
                                                                                                    if (pccVar4 != null) {
                                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                                        ls6Var3.J.k(stickerSet22.id, tL_messages_stickerSet7);
                                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    });
                                                                                    break;
                                                                                } else {
                                                                                    hashSet2.remove(str322);
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                hashSet2.remove(str322);
                                                                                if (pccVar322 != null) {
                                                                                    pccVar322.a(tL_messages_stickerSet6);
                                                                                }
                                                                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet6.set;
                                                                                if (stickerSet != null) {
                                                                                    ls6Var22.J.k(stickerSet.id, tL_messages_stickerSet6);
                                                                                    ls6Var22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                                }
                                                                                ls6Var22.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                                break;
                                                                            }
                                                                        default:
                                                                            HashSet hashSet3 = ls6Var22.J0;
                                                                            if (tL_messages_stickerSet6 == null) {
                                                                                if (!z522) {
                                                                                    ls6Var22.P(inputStickerSet32, new icc() { // from class: jp6
                                                                                        @Override // icc
                                                                                        public final void a(Object obj, Object obj2) {
                                                                                            TLRPC.StickerSet stickerSet2;
                                                                                            TLRPC.StickerSet stickerSet22;
                                                                                            byte b8 = b7;
                                                                                            pcc pccVar4 = pccVar322;
                                                                                            String str4 = str322;
                                                                                            ls6 ls6Var3 = ls6Var22;
                                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                                            switch (b8) {
                                                                                                case 0:
                                                                                                    ls6Var3.J0.remove(str4);
                                                                                                    if (pccVar4 != null) {
                                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                                        ls6Var3.J.k(stickerSet2.id, tL_messages_stickerSet7);
                                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    ls6Var3.J0.remove(str4);
                                                                                                    if (pccVar4 != null) {
                                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                                        ls6Var3.J.k(stickerSet22.id, tL_messages_stickerSet7);
                                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    });
                                                                                    break;
                                                                                } else {
                                                                                    hashSet3.remove(str322);
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                hashSet3.remove(str322);
                                                                                if (pccVar322 != null) {
                                                                                    pccVar322.a(tL_messages_stickerSet6);
                                                                                }
                                                                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet6.set;
                                                                                if (stickerSet2 != null) {
                                                                                    ls6Var22.J.k(stickerSet2.id, tL_messages_stickerSet6);
                                                                                    ls6Var22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                                }
                                                                                ls6Var22.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    tL_messages_stickerSet2 = null;
                                                }
                                                nativeByteBuffer = byteBufferValue;
                                            }
                                            if (nativeByteBuffer != null) {
                                                nativeByteBuffer.reuse();
                                            }
                                            sQLiteCursor.dispose();
                                            tL_messages_stickerSet3 = tL_messages_stickerSet2;
                                            final byte b422 = 1;
                                            final String str222 = y0;
                                            final pcc pccVar222 = pccVar;
                                            final boolean z422 = z;
                                            hl.c3(new Runnable() { // from class: pr6
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b522 = b422;
                                                    TLRPC.InputStickerSet inputStickerSet32 = inputStickerSet2;
                                                    boolean z522 = z422;
                                                    final pcc pccVar322 = pccVar222;
                                                    final String str322 = str222;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = tL_messages_stickerSet3;
                                                    final ls6 ls6Var22 = ls6Var;
                                                    final byte b6 = 1;
                                                    final byte b7 = 0;
                                                    switch (b522) {
                                                        case 0:
                                                            HashSet hashSet2 = ls6Var22.J0;
                                                            if (tL_messages_stickerSet6 == null) {
                                                                if (!z522) {
                                                                    ls6Var22.P(inputStickerSet32, new icc() { // from class: jp6
                                                                        @Override // icc
                                                                        public final void a(Object obj, Object obj2) {
                                                                            TLRPC.StickerSet stickerSet2;
                                                                            TLRPC.StickerSet stickerSet22;
                                                                            byte b8 = b6;
                                                                            pcc pccVar4 = pccVar322;
                                                                            String str4 = str322;
                                                                            ls6 ls6Var3 = ls6Var22;
                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                            switch (b8) {
                                                                                case 0:
                                                                                    ls6Var3.J0.remove(str4);
                                                                                    if (pccVar4 != null) {
                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                        ls6Var3.J.k(stickerSet2.id, tL_messages_stickerSet7);
                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    ls6Var3.J0.remove(str4);
                                                                                    if (pccVar4 != null) {
                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                        ls6Var3.J.k(stickerSet22.id, tL_messages_stickerSet7);
                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                                } else {
                                                                    hashSet2.remove(str322);
                                                                    break;
                                                                }
                                                            } else {
                                                                hashSet2.remove(str322);
                                                                if (pccVar322 != null) {
                                                                    pccVar322.a(tL_messages_stickerSet6);
                                                                }
                                                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet6.set;
                                                                if (stickerSet != null) {
                                                                    ls6Var22.J.k(stickerSet.id, tL_messages_stickerSet6);
                                                                    ls6Var22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                }
                                                                ls6Var22.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                break;
                                                            }
                                                        default:
                                                            HashSet hashSet3 = ls6Var22.J0;
                                                            if (tL_messages_stickerSet6 == null) {
                                                                if (!z522) {
                                                                    ls6Var22.P(inputStickerSet32, new icc() { // from class: jp6
                                                                        @Override // icc
                                                                        public final void a(Object obj, Object obj2) {
                                                                            TLRPC.StickerSet stickerSet2;
                                                                            TLRPC.StickerSet stickerSet22;
                                                                            byte b8 = b7;
                                                                            pcc pccVar4 = pccVar322;
                                                                            String str4 = str322;
                                                                            ls6 ls6Var3 = ls6Var22;
                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                            switch (b8) {
                                                                                case 0:
                                                                                    ls6Var3.J0.remove(str4);
                                                                                    if (pccVar4 != null) {
                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                        ls6Var3.J.k(stickerSet2.id, tL_messages_stickerSet7);
                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    ls6Var3.J0.remove(str4);
                                                                                    if (pccVar4 != null) {
                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                        ls6Var3.J.k(stickerSet22.id, tL_messages_stickerSet7);
                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                                } else {
                                                                    hashSet3.remove(str322);
                                                                    break;
                                                                }
                                                            } else {
                                                                hashSet3.remove(str322);
                                                                if (pccVar322 != null) {
                                                                    pccVar322.a(tL_messages_stickerSet6);
                                                                }
                                                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet6.set;
                                                                if (stickerSet2 != null) {
                                                                    ls6Var22.J.k(stickerSet2.id, tL_messages_stickerSet6);
                                                                    ls6Var22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                }
                                                                ls6Var22.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                break;
                                                            }
                                                    }
                                                }
                                            });
                                            return;
                                        default:
                                            final ls6 ls6Var2 = this.b;
                                            final TLRPC.InputStickerSet inputStickerSet3 = inputStickerSet;
                                            try {
                                                sQLiteCursor2 = ls6Var2.getMessagesStorage().b.queryFinalized("SELECT data, hash FROM stickersets2 WHERE short_name = ? LIMIT 1", inputStickerSet3.short_name.toLowerCase());
                                                try {
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    tL_messages_stickerSet4 = null;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                tL_messages_stickerSet4 = null;
                                                sQLiteCursor2 = null;
                                            }
                                            if (!sQLiteCursor2.next() || sQLiteCursor2.isNull(0)) {
                                                tL_messages_stickerSet4 = null;
                                            } else {
                                                NativeByteBuffer byteBufferValue2 = sQLiteCursor2.byteBufferValue(0);
                                                if (byteBufferValue2 != null) {
                                                    try {
                                                        tL_messages_stickerSet4 = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                                        try {
                                                            intValue2 = sQLiteCursor2.intValue(1);
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            nativeByteBuffer = byteBufferValue2;
                                                            try {
                                                                cc4.g(th, true);
                                                                if (nativeByteBuffer != null) {
                                                                    nativeByteBuffer.reuse();
                                                                    break;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        tL_messages_stickerSet4 = null;
                                                    }
                                                    if (num2 != null && num2.intValue() != 0) {
                                                        if (num2.intValue() != intValue2) {
                                                            byteBufferValue2.reuse();
                                                            sQLiteCursor2.dispose();
                                                            tL_messages_stickerSet5 = null;
                                                            final byte b52 = 0;
                                                            final String str32 = y0;
                                                            final pcc pccVar32 = pccVar;
                                                            final boolean z52 = z;
                                                            hl.c3(new Runnable() { // from class: pr6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    byte b522 = b52;
                                                                    TLRPC.InputStickerSet inputStickerSet32 = inputStickerSet3;
                                                                    boolean z522 = z52;
                                                                    final pcc pccVar322 = pccVar32;
                                                                    final String str322 = str32;
                                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = tL_messages_stickerSet5;
                                                                    final ls6 ls6Var22 = ls6Var2;
                                                                    final byte b6 = 1;
                                                                    final byte b7 = 0;
                                                                    switch (b522) {
                                                                        case 0:
                                                                            HashSet hashSet2 = ls6Var22.J0;
                                                                            if (tL_messages_stickerSet6 == null) {
                                                                                if (!z522) {
                                                                                    ls6Var22.P(inputStickerSet32, new icc() { // from class: jp6
                                                                                        @Override // icc
                                                                                        public final void a(Object obj, Object obj2) {
                                                                                            TLRPC.StickerSet stickerSet2;
                                                                                            TLRPC.StickerSet stickerSet22;
                                                                                            byte b8 = b6;
                                                                                            pcc pccVar4 = pccVar322;
                                                                                            String str4 = str322;
                                                                                            ls6 ls6Var3 = ls6Var22;
                                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                                            switch (b8) {
                                                                                                case 0:
                                                                                                    ls6Var3.J0.remove(str4);
                                                                                                    if (pccVar4 != null) {
                                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                                        ls6Var3.J.k(stickerSet2.id, tL_messages_stickerSet7);
                                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    ls6Var3.J0.remove(str4);
                                                                                                    if (pccVar4 != null) {
                                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                                        ls6Var3.J.k(stickerSet22.id, tL_messages_stickerSet7);
                                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    });
                                                                                    break;
                                                                                } else {
                                                                                    hashSet2.remove(str322);
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                hashSet2.remove(str322);
                                                                                if (pccVar322 != null) {
                                                                                    pccVar322.a(tL_messages_stickerSet6);
                                                                                }
                                                                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet6.set;
                                                                                if (stickerSet != null) {
                                                                                    ls6Var22.J.k(stickerSet.id, tL_messages_stickerSet6);
                                                                                    ls6Var22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                                }
                                                                                ls6Var22.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                                break;
                                                                            }
                                                                        default:
                                                                            HashSet hashSet3 = ls6Var22.J0;
                                                                            if (tL_messages_stickerSet6 == null) {
                                                                                if (!z522) {
                                                                                    ls6Var22.P(inputStickerSet32, new icc() { // from class: jp6
                                                                                        @Override // icc
                                                                                        public final void a(Object obj, Object obj2) {
                                                                                            TLRPC.StickerSet stickerSet2;
                                                                                            TLRPC.StickerSet stickerSet22;
                                                                                            byte b8 = b7;
                                                                                            pcc pccVar4 = pccVar322;
                                                                                            String str4 = str322;
                                                                                            ls6 ls6Var3 = ls6Var22;
                                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                                            switch (b8) {
                                                                                                case 0:
                                                                                                    ls6Var3.J0.remove(str4);
                                                                                                    if (pccVar4 != null) {
                                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                                        ls6Var3.J.k(stickerSet2.id, tL_messages_stickerSet7);
                                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    ls6Var3.J0.remove(str4);
                                                                                                    if (pccVar4 != null) {
                                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                                        ls6Var3.J.k(stickerSet22.id, tL_messages_stickerSet7);
                                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    });
                                                                                    break;
                                                                                } else {
                                                                                    hashSet3.remove(str322);
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                hashSet3.remove(str322);
                                                                                if (pccVar322 != null) {
                                                                                    pccVar322.a(tL_messages_stickerSet6);
                                                                                }
                                                                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet6.set;
                                                                                if (stickerSet2 != null) {
                                                                                    ls6Var22.J.k(stickerSet2.id, tL_messages_stickerSet6);
                                                                                    ls6Var22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                                }
                                                                                ls6Var22.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    tL_messages_stickerSet4 = null;
                                                }
                                                nativeByteBuffer = byteBufferValue2;
                                            }
                                            if (nativeByteBuffer != null) {
                                                nativeByteBuffer.reuse();
                                            }
                                            sQLiteCursor2.dispose();
                                            tL_messages_stickerSet5 = tL_messages_stickerSet4;
                                            final byte b522 = 0;
                                            final String str322 = y0;
                                            final pcc pccVar322 = pccVar;
                                            final boolean z522 = z;
                                            hl.c3(new Runnable() { // from class: pr6
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b5222 = b522;
                                                    TLRPC.InputStickerSet inputStickerSet32 = inputStickerSet3;
                                                    boolean z5222 = z522;
                                                    final pcc pccVar3222 = pccVar322;
                                                    final String str3222 = str322;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = tL_messages_stickerSet5;
                                                    final ls6 ls6Var22 = ls6Var2;
                                                    final byte b6 = 1;
                                                    final byte b7 = 0;
                                                    switch (b5222) {
                                                        case 0:
                                                            HashSet hashSet2 = ls6Var22.J0;
                                                            if (tL_messages_stickerSet6 == null) {
                                                                if (!z5222) {
                                                                    ls6Var22.P(inputStickerSet32, new icc() { // from class: jp6
                                                                        @Override // icc
                                                                        public final void a(Object obj, Object obj2) {
                                                                            TLRPC.StickerSet stickerSet2;
                                                                            TLRPC.StickerSet stickerSet22;
                                                                            byte b8 = b6;
                                                                            pcc pccVar4 = pccVar3222;
                                                                            String str4 = str3222;
                                                                            ls6 ls6Var3 = ls6Var22;
                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                            switch (b8) {
                                                                                case 0:
                                                                                    ls6Var3.J0.remove(str4);
                                                                                    if (pccVar4 != null) {
                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                        ls6Var3.J.k(stickerSet2.id, tL_messages_stickerSet7);
                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    ls6Var3.J0.remove(str4);
                                                                                    if (pccVar4 != null) {
                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                        ls6Var3.J.k(stickerSet22.id, tL_messages_stickerSet7);
                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                                } else {
                                                                    hashSet2.remove(str3222);
                                                                    break;
                                                                }
                                                            } else {
                                                                hashSet2.remove(str3222);
                                                                if (pccVar3222 != null) {
                                                                    pccVar3222.a(tL_messages_stickerSet6);
                                                                }
                                                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet6.set;
                                                                if (stickerSet != null) {
                                                                    ls6Var22.J.k(stickerSet.id, tL_messages_stickerSet6);
                                                                    ls6Var22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                }
                                                                ls6Var22.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                break;
                                                            }
                                                        default:
                                                            HashSet hashSet3 = ls6Var22.J0;
                                                            if (tL_messages_stickerSet6 == null) {
                                                                if (!z5222) {
                                                                    ls6Var22.P(inputStickerSet32, new icc() { // from class: jp6
                                                                        @Override // icc
                                                                        public final void a(Object obj, Object obj2) {
                                                                            TLRPC.StickerSet stickerSet2;
                                                                            TLRPC.StickerSet stickerSet22;
                                                                            byte b8 = b7;
                                                                            pcc pccVar4 = pccVar3222;
                                                                            String str4 = str3222;
                                                                            ls6 ls6Var3 = ls6Var22;
                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                            switch (b8) {
                                                                                case 0:
                                                                                    ls6Var3.J0.remove(str4);
                                                                                    if (pccVar4 != null) {
                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                        ls6Var3.J.k(stickerSet2.id, tL_messages_stickerSet7);
                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    ls6Var3.J0.remove(str4);
                                                                                    if (pccVar4 != null) {
                                                                                        pccVar4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                        ls6Var3.J.k(stickerSet22.id, tL_messages_stickerSet7);
                                                                                        ls6Var3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        ls6Var3.X1(tL_messages_stickerSet7);
                                                                                        ls6Var3.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                                } else {
                                                                    hashSet3.remove(str3222);
                                                                    break;
                                                                }
                                                            } else {
                                                                hashSet3.remove(str3222);
                                                                if (pccVar3222 != null) {
                                                                    pccVar3222.a(tL_messages_stickerSet6);
                                                                }
                                                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet6.set;
                                                                if (stickerSet2 != null) {
                                                                    ls6Var22.J.k(stickerSet2.id, tL_messages_stickerSet6);
                                                                    ls6Var22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                }
                                                                ls6Var22.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                break;
                                                            }
                                                    }
                                                }
                                            });
                                            return;
                                    }
                                }
                            });
                            return null;
                        }
                        if (z) {
                            hashSet.remove(y0);
                            return null;
                        }
                        P(inputStickerSet, new nu0((Object) this, y0, (Object) pccVar, (Object) inputStickerSet, (byte) 12));
                        return null;
                    }
                }
            }
            if ((inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) && (str = inputStickerSet.short_name) != null) {
                String lowerCase = str.toLowerCase();
                ConcurrentHashMap concurrentHashMap = this.O;
                if (concurrentHashMap.containsKey(lowerCase)) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) concurrentHashMap.get(inputStickerSet.short_name.toLowerCase());
                    if (tL_messages_stickerSet != null) {
                    }
                }
            }
            if ((!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses) || (tL_messages_stickerSet = this.P) == null) && (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses) || (tL_messages_stickerSet = this.Q) == null)) {
                tL_messages_stickerSet = null;
            }
            if (tL_messages_stickerSet != null) {
            }
        }
        return null;
    }

    public final void m1(jn5 jn5Var, int i) {
        getFileLoader().V(jn5Var, null, null, i, 11);
    }

    public final void m2() {
        r47 r47Var;
        ArrayList arrayList = this.Z0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList3 = this.a1;
            r47 r47Var2 = null;
            if (i >= arrayList3.size()) {
                break;
            }
            r47 r47Var3 = (r47) arrayList3.get(i);
            if ((!r47Var3.z2() || r47Var3.S2) && !hashSet.contains(Integer.valueOf(r47Var3.e1()))) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList2.size()) {
                        break;
                    }
                    if (((r47) arrayList2.get(i2)).e1() == r47Var3.e1()) {
                        r47Var2 = (r47) arrayList2.get(i2);
                        break;
                    }
                    i2++;
                }
                if (r47Var2 != null) {
                    r47Var3.N(r47Var2);
                    r47Var3.z0 = r47Var2.z0;
                    r47Var3.y0 = r47Var2.y0;
                }
                r47Var3.o2 = true;
                arrayList.add(r47Var3);
                hashSet.add(Integer.valueOf(r47Var3.e1()));
            }
            i++;
        }
        for (int i3 = 0; i3 < this.b1.size(); i3++) {
            r47 r47Var4 = (r47) this.b1.get(i3);
            if (!hashSet.contains(Integer.valueOf(r47Var4.e1()))) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList2.size()) {
                        r47Var = null;
                        break;
                    } else {
                        if (((r47) arrayList2.get(i4)).e1() == r47Var4.e1()) {
                            r47Var = (r47) arrayList2.get(i4);
                            break;
                        }
                        i4++;
                    }
                }
                if (r47Var != null) {
                    r47Var4.N(r47Var);
                    r47Var4.z0 = r47Var.z0;
                    r47Var4.y0 = r47Var.y0;
                }
                r47Var4.o2 = true;
                arrayList.add(r47Var4);
                hashSet.add(Integer.valueOf(r47Var4.e1()));
            }
        }
    }

    public final void n(ArrayList arrayList, zh6 zh6Var, ArrayList arrayList2, ArrayList arrayList3, long j, boolean z) {
        zh6 zh6Var2 = new zh6();
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i);
            zh6Var2.k(user.id, user);
        }
        zh6 zh6Var3 = new zh6();
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i2);
            zh6Var3.k(chat.id, chat);
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList4.add(new r47(this.currentAccount, (TLRPC.Message) arrayList.get(i3), zh6Var2, zh6Var3, false, false));
        }
        hl.c3(new ss0(this, arrayList2, z, arrayList3, arrayList4, zh6Var, j));
    }

    public final TLRPC.TL_messages_stickerSet n0(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        return m0(inputStickerSet, null, z, false, null);
    }

    public final void n2(String str) {
        HashMap hashMap = this.a0;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(str, new xm9(str, this.currentAccount));
        wm9 wm9Var = this.A0;
        wm9Var.getClass();
        vm9 vm9Var = new vm9();
        vm9Var.b = str;
        int i = wm9Var.d;
        wm9Var.d = i + 1;
        vm9Var.c = i;
        vm9Var.d = true;
        wm9Var.e.add(vm9Var);
    }

    public final void o() {
        int g = mka.g(a.b) - 2;
        if (g <= 0) {
            g = 5;
        }
        ArrayList arrayList = new ArrayList();
        if (xea.r.length() <= 0) {
            for (int i = 0; i < this.j1.size(); i++) {
                arrayList.add((TLRPC.TL_topPeer) this.j1.get(i));
                if (arrayList.size() == g - 2) {
                    break;
                }
            }
        }
        Utilities.e.c(new ds6((Object) this, Build.VERSION.SDK_INT >= 30, (Object) arrayList, (byte) 0));
    }

    public final TLRPC.TL_messages_stickerSet o0(String str) {
        return (TLRPC.TL_messages_stickerSet) this.R.get(str);
    }

    public final void o1() {
        ArrayList[] arrayListArr = this.g0;
        if (arrayListArr[3].isEmpty()) {
            return;
        }
        ArrayList arrayList = arrayListArr[3];
        this.z0 = (TLRPC.Document) arrayList.get(Utilities.b.nextInt(arrayList.size()));
        getFileLoader().V(jn5.b(this.z0), this.z0, null, 0, 1);
    }

    public final void o2(TLRPC.Message message) {
        p2(message, false);
    }

    public final TLRPC.TL_messages_stickerSet p0(long j) {
        return (TLRPC.TL_messages_stickerSet) this.J.f(j);
    }

    public final void p1() {
        boolean z = this.D0;
        byte b = 3;
        ArrayList arrayList = this.C0;
        if (!z && arrayList.isEmpty()) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = pv3.c("⭐").concat(pv3.c("⭐"));
            tL_messages_getStickers.hash = 0L;
            this.D0 = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickers, new fp6(this, b));
            return;
        }
        int i = 0;
        while (i < Math.min(arrayList.size(), 3)) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i == 2 ? arrayList.size() - 1 : i);
            if (r47.W3(document)) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.A1 = false;
                imageReceiver.d0(jn5.b(document), null, null, "webp", null, 1);
                in5.z().I(imageReceiver, null);
                ImageReceiver imageReceiver2 = new ImageReceiver(null);
                imageReceiver2.A1 = false;
                imageReceiver2.b0(jn5.d(r47.F1(document), document), null, null, null, "tgs", null, 1);
                in5.z().I(imageReceiver2, null);
            }
            i++;
        }
    }

    public final void p2(TLRPC.Message message, boolean z) {
        if (message != null) {
            TLRPC.Document G0 = r47.G0(message);
            String str = null;
            if (G0 != null) {
                int i = 0;
                while (true) {
                    if (i >= G0.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = G0.attributes.get(i);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                        if (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                            str = inputStickerSet.short_name;
                        }
                    } else {
                        i++;
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.O.get(str);
            if (tL_messages_stickerSet == null) {
                if (z) {
                    hl.c3(new yg6(this, message, str, (byte) 4));
                    return;
                } else {
                    q2(message, str);
                    return;
                }
            }
            int size = tL_messages_stickerSet.documents.size();
            for (int i2 = 0; i2 < size; i2++) {
                TLRPC.Document document = tL_messages_stickerSet.documents.get(i2);
                if (document.id == G0.id && document.dc_id == G0.dc_id) {
                    message.stickerVerified = 1;
                    return;
                }
            }
        }
    }

    public final long q(ArrayList arrayList, boolean z) {
        long j = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) arrayList.get(i)).set;
                if (!stickerSet.archived) {
                    j = r(j, stickerSet.id);
                    if (this.v0[z ? 1 : 0].contains(Long.valueOf(stickerSet.id))) {
                        j = r(j, 1L);
                    }
                }
            }
        }
        return j;
    }

    public final TLRPC.TL_messages_stickerSet q0(String str) {
        if (str == null) {
            return null;
        }
        return (TLRPC.TL_messages_stickerSet) this.O.get(str.toLowerCase());
    }

    public final void q1(TLRPC.StickerSetCovered stickerSetCovered) {
        TLRPC.StickerSet stickerSet;
        TLRPC.PhotoSize w;
        if (stickerSetCovered == null || (stickerSet = stickerSetCovered.set) == null || (w = xb4.w(stickerSet.thumbs, 90, false, null, false)) == null) {
            return;
        }
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            if (stickerSetCovered.covers.isEmpty()) {
                return;
            } else {
                document = stickerSetCovered.covers.get(0);
            }
        }
        jn5 k = jn5.k(w, document, stickerSetCovered.set.thumb_version);
        if (k != null) {
            getFileLoader().V(k, stickerSetCovered, k.p == 1 ? "tgs" : "webp", 3, 1);
        }
    }

    public final void q2(TLRPC.Message message, String str) {
        HashMap hashMap = this.b0;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(message);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = r47.j1(message);
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new bq6(this, str, (byte) 0));
    }

    public final void r1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        TLRPC.PhotoSize w;
        ArrayList<TLRPC.Document> arrayList;
        jn5 k;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || (w = xb4.w(stickerSet.thumbs, 90, false, null, false)) == null || (arrayList = tL_messages_stickerSet.documents) == null || arrayList.isEmpty() || (k = jn5.k(w, arrayList.get(0), tL_messages_stickerSet.set.thumb_version)) == null) {
            return;
        }
        getFileLoader().V(k, tL_messages_stickerSet, k.p == 1 ? "tgs" : "webp", 3, 1);
    }

    public final String s0(long j) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.J.f(j);
        if (tL_messages_stickerSet != null) {
            return tL_messages_stickerSet.set.short_name;
        }
        zh6[] zh6VarArr = this.u0;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) zh6VarArr[0].f(j);
        if (stickerSetCovered != null) {
            return stickerSetCovered.set.short_name;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) zh6VarArr[1].f(j);
        if (stickerSetCovered2 != null) {
            return stickerSetCovered2.set.short_name;
        }
        return null;
    }

    public final void s1(int i, TLRPC.TL_messages_allStickers tL_messages_allStickers, Runnable runnable) {
        final zh6 zh6Var;
        final TLRPC.TL_messages_allStickers tL_messages_allStickers2;
        final int i2;
        final ArrayList arrayList = new ArrayList();
        if (tL_messages_allStickers.sets.isEmpty()) {
            A1(i, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, runnable);
            return;
        }
        ls6 ls6Var = this;
        int i3 = i;
        zh6 zh6Var2 = new zh6();
        int i4 = 0;
        while (i4 < tL_messages_allStickers.sets.size()) {
            final TLRPC.StickerSet stickerSet = tL_messages_allStickers.sets.get(i4);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) ls6Var.J.f(stickerSet.id);
            if (tL_messages_stickerSet != null) {
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                if (stickerSet2.hash == stickerSet.hash) {
                    stickerSet2.archived = stickerSet.archived;
                    stickerSet2.installed = stickerSet.installed;
                    stickerSet2.official = stickerSet.official;
                    zh6Var2.k(stickerSet2.id, tL_messages_stickerSet);
                    arrayList.add(tL_messages_stickerSet);
                    if (zh6Var2.m() == tL_messages_allStickers.sets.size()) {
                        ls6Var.A1(i3, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, null);
                    }
                    zh6Var = zh6Var2;
                    tL_messages_allStickers2 = tL_messages_allStickers;
                    i2 = i4;
                    i4 = i2 + 1;
                    zh6Var2 = zh6Var;
                    tL_messages_allStickers = tL_messages_allStickers2;
                }
            }
            arrayList.add(null);
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
            tL_inputStickerSetID.id = stickerSet.id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            ConnectionsManager connectionsManager = ls6Var.getConnectionsManager();
            final int i5 = i3;
            final ls6 ls6Var2 = ls6Var;
            zh6Var = zh6Var2;
            tL_messages_allStickers2 = tL_messages_allStickers;
            i2 = i4;
            RequestDelegate requestDelegate = new RequestDelegate() { // from class: xr6
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    hl.c3(new jl3(ls6.this, tLObject, arrayList, i2, zh6Var, stickerSet, tL_messages_allStickers2, i5));
                }
            };
            ls6Var = ls6Var2;
            i3 = i5;
            connectionsManager.sendRequest(tL_messages_getStickerSet, requestDelegate);
            i4 = i2 + 1;
            zh6Var2 = zh6Var;
            tL_messages_allStickers = tL_messages_allStickers2;
        }
        runnable.run();
    }

    public final ArrayList t0(int i) {
        ArrayList[] arrayListArr = this.H;
        return i == 3 ? arrayListArr[2] : arrayListArr[i];
    }

    public final void t1(String str, boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z2, int i) {
        hl.c3(new aq6(this, str, (byte) 5));
        Utilities.d.c(new nr6(this, z2, tL_messages_stickerSet, i, str, z));
    }

    public final boolean u() {
        return (this.X[0] && this.H[0].size() < 5 && this.g0[2].isEmpty()) ? false : true;
    }

    public final void u1(final boolean z, final ArrayList arrayList, final ArrayList arrayList2, final boolean z2, final boolean z3, final int i, final long j) {
        hl.c3(new lr6(this, z, (byte) 0));
        Utilities.d.c(new Runnable() { // from class: mr6
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0033, code lost:
            
                if (r4 == 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
            
                if (java.lang.Math.abs((java.lang.System.currentTimeMillis() / 1000) - r8) < 3600) goto L23;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                long j2;
                boolean z4;
                ls6 ls6Var;
                boolean z5;
                boolean z6;
                long j3;
                int i2;
                ls6 ls6Var2 = ls6.this;
                boolean z7 = z3;
                ArrayList arrayList3 = arrayList;
                int i3 = i;
                long j4 = j;
                boolean z8 = z;
                if (z7) {
                    j2 = arrayList3 != null ? 0L : 0L;
                    z4 = z8;
                    ls6Var = ls6Var2;
                    hl.d3(new j61(ls6Var, arrayList3, j4, z4), (arrayList3 != null || z7) ? j2 : 1000L);
                    if (arrayList3 == null) {
                        return;
                    }
                } else {
                    j2 = 0;
                    if (arrayList3 == null) {
                    }
                    z4 = z8;
                    ls6Var = ls6Var2;
                }
                Object[] objArr = 0;
                boolean z9 = z2;
                if (arrayList3 == null) {
                    ls6 ls6Var3 = ls6Var;
                    hl.c3(new zp6(ls6Var3, z4, i3, objArr == true ? 1 : 0));
                    ls6Var3.J1(z4, null, null, i3, 0L, z9);
                    return;
                }
                ls6 ls6Var4 = ls6Var;
                try {
                    final ArrayList arrayList4 = new ArrayList();
                    final zh6 zh6Var = new zh6();
                    for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i4);
                        arrayList4.add(stickerSetCovered);
                        zh6Var.k(stickerSetCovered.set.id, stickerSetCovered);
                    }
                    final ArrayList arrayList5 = arrayList2;
                    if (z7) {
                        z5 = z4;
                        z6 = z9;
                        j3 = j4;
                        i2 = i3;
                    } else {
                        z5 = z4;
                        z6 = z9;
                        j3 = j4;
                        i2 = i3;
                        ls6Var4.J1(z5, arrayList4, arrayList5, i2, j3, z6);
                        ls6Var4 = ls6Var4;
                    }
                    final int i5 = i2;
                    final boolean z10 = z6;
                    final long j5 = j3;
                    final boolean z11 = z5;
                    final ls6 ls6Var5 = ls6Var4;
                    hl.c3(new Runnable() { // from class: yp6
                        @Override // java.lang.Runnable
                        public final void run() {
                            ls6 ls6Var6 = ls6.this;
                            ArrayList[] arrayListArr = ls6Var6.v0;
                            boolean z12 = z11;
                            arrayListArr[z12 ? 1 : 0] = arrayList5;
                            ls6Var6.u0[z12 ? 1 : 0] = zh6Var;
                            ls6Var6.t0[z12 ? 1 : 0] = arrayList4;
                            ls6Var6.q0[z12 ? 1 : 0] = j5;
                            ls6Var6.r0[z12 ? 1 : 0] = i5;
                            ls6Var6.s0 = z10;
                            ls6Var6.b1(z12 ? 6 : 3, true, false);
                            ls6Var6.getNotificationCenter().k(z12 ? jn7.A0 : jn7.z0, new Object[0]);
                        }
                    });
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
            }
        });
    }

    public final void v0(long j) {
        w0(j, true);
    }

    public final void v1(final TLRPC.messages_Messages messages_messages, final long j, int i, int i2, final int i3, final int i4, long j2, final int i5, final int i6, final boolean z, final int i7) {
        long j3;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        ArrayList<TLRPC.Message> arrayList;
        if (f11.a) {
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            StringBuilder sb = new StringBuilder("process load media messagesCount ");
            sb.append(size);
            sb.append(" did ");
            j3 = j;
            sb.append(j3);
            sb.append(" topicId ");
            sb.append(j2);
            sb.append(" count = ");
            i8 = i;
            i9 = i2;
            bs2.w(sb, i8, " max_id=", i9, " min_id=");
            i10 = i4;
            bs2.w(sb, i3, " type = ", i10, " cache = ");
            i11 = i6;
            bs2.w(sb, i5, " classGuid = ", i11, " topReached=");
            z2 = z;
            sb.append(z2);
            cc4.b(sb.toString());
        } else {
            j3 = j;
            i8 = i;
            i9 = i2;
            i10 = i4;
            i11 = i6;
            z2 = z;
        }
        if (i5 != 0 && (arrayList = messages_messages.messages) != null && (((arrayList.isEmpty() && i3 == 0) || (messages_messages.messages.size() <= 1 && i3 != 0)) && !wf3.B(j3))) {
            if (i5 == 2) {
                return;
            }
            P0(j, i8, i9, i3, i10, j2, 0, i11, i7, null, null);
        } else {
            if (i5 == 0) {
                in5.S(messages_messages.messages);
                getMessagesStorage().n1(messages_messages.users, messages_messages.chats, true, true);
                getMessagesStorage().a.c(new xq6(this, i3, messages_messages.messages, z2, j, i2, i4, j2));
            }
            Utilities.g.c(new Runnable() { // from class: zr6
                @Override // java.lang.Runnable
                public final void run() {
                    TLRPC.messages_Messages messages_messages2;
                    ls6 ls6Var;
                    zh6 zh6Var = new zh6();
                    int i12 = 0;
                    while (true) {
                        messages_messages2 = messages_messages;
                        if (i12 >= messages_messages2.users.size()) {
                            break;
                        }
                        TLRPC.User user = messages_messages2.users.get(i12);
                        zh6Var.k(user.id, user);
                        i12++;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int i13 = 0;
                    while (true) {
                        int size2 = messages_messages2.messages.size();
                        ls6Var = ls6.this;
                        if (i13 >= size2) {
                            break;
                        }
                        r47 r47Var = new r47(ls6Var.currentAccount, messages_messages2.messages.get(i13), zh6Var, (zh6) null, true, false);
                        r47Var.Q();
                        arrayList3.add(r47Var);
                        i13++;
                    }
                    ls6Var.getFileLoader().l(arrayList3);
                    boolean z3 = i5;
                    long j4 = j;
                    iq6 iq6Var = new iq6(ls6Var, messages_messages2, z3 ? 1 : 0, j4, arrayList3, i6, i4, z, i3, i7, (byte) 0);
                    if (ls6Var.getMessagesController().j4.u(j4)) {
                        ls6Var.getMessagesStorage().a.c(new yg6(ls6Var, arrayList3, iq6Var, (byte) 5));
                    } else {
                        iq6Var.run();
                    }
                }
            });
        }
    }

    public final void w(boolean z) {
        byte b = 0;
        if (z) {
            this.x = 0;
            int[] iArr = this.r0;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        X0(false, true, false, 2);
        X0(false, true, false, 3);
        X0(false, false, true, 7);
        z();
        y();
        C();
        if (!this.c && (!this.d || Math.abs((System.currentTimeMillis() / 1000) - this.e) >= 3600)) {
            G0(true, false, null);
        }
        if (!this.F && (this.E == null || Math.abs((System.currentTimeMillis() / 1000) - this.G) >= 3600)) {
            T0(true);
        }
        B();
        E();
        if (getUserConfig().e0 != null) {
            String str = getUserConfig().e0;
            TLRPC.TL_messages_stickerSet q0 = q0(str);
            if (q0 == null) {
                q0 = o0(str);
            }
            if (q0 == null) {
                d0(this.currentAccount).d1(str, false, true);
            }
        }
        if (!this.o0 && System.currentTimeMillis() - getUserConfig().i0 >= 86400000) {
            this.o0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiGenericAnimations();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new fp6(this, b));
        }
        getMessagesController().E0();
    }

    public final void w0(long j, boolean z) {
        TLRPC.TL_topPeer tL_topPeer;
        if (getUserConfig().W) {
            yac userConfig = getUserConfig();
            int i = z ? userConfig.G : userConfig.F;
            int max = i != 0 ? Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - i) : 60;
            ArrayList arrayList = z ? this.l1 : this.k1;
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    tL_topPeer = null;
                    break;
                }
                tL_topPeer = (TLRPC.TL_topPeer) arrayList.get(i2);
                if (tL_topPeer.peer.user_id == j) {
                    break;
                } else {
                    i2++;
                }
            }
            if (tL_topPeer == null) {
                tL_topPeer = new TLRPC.TL_topPeer();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_topPeer.peer = tL_peerUser;
                tL_peerUser.user_id = j;
                arrayList.add(tL_topPeer);
            }
            tL_topPeer.rating = Math.exp(max / getMessagesController().S2) + tL_topPeer.rating;
            Collections.sort(arrayList, new vk6((byte) 3));
            if (arrayList.size() > 20) {
                qd4.v(1, arrayList);
            }
            getMessagesStorage().a.c(new dr6(this, j, z ? 3 : 1, tL_topPeer.rating));
            getNotificationCenter().k(z ? jn7.U0 : jn7.T0, new Object[0]);
        }
    }

    public final void w1(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j, int i, boolean z) {
        boolean z2;
        if (tL_attachMenuBots != null && i != 0) {
            this.b = tL_attachMenuBots;
            this.a = j;
        }
        SharedPreferences.Editor edit = getMessagesController().Y3.edit();
        this.e = i;
        edit.putInt("menuBotsUpdateDate", i).commit();
        this.d = true;
        byte b = 0;
        if (tL_attachMenuBots != null) {
            if (!z) {
                getMessagesStorage().n1(tL_attachMenuBots.users, null, true, true);
            }
            getMessagesController().j4(tL_attachMenuBots.users, z);
            hl.c3(new ip6(this, b));
            z2 = false;
            for (int i2 = 0; i2 < tL_attachMenuBots.bots.size(); i2++) {
                if (tL_attachMenuBots.bots.get(i2) instanceof TLRPC.TL_attachMenuBot_layer162) {
                    tL_attachMenuBots.bots.get(i2).show_in_attach_menu = true;
                    z2 = true;
                }
            }
        } else {
            z2 = false;
        }
        if (!z) {
            getMessagesStorage().a.c(new r77((Object) this, (Object) tL_attachMenuBots, j, i, (byte) 7));
        } else if (z2 || Math.abs((System.currentTimeMillis() / 1000) - i) >= 3600) {
            G0(false, true, null);
        }
    }

    public final void x() {
        if (getUserConfig().f0 != null) {
            String str = getUserConfig().f0;
            TLRPC.TL_messages_stickerSet q0 = q0(str);
            if (q0 == null) {
                q0 = o0(str);
            }
            if (q0 == null) {
                d0(this.currentAccount).d1(str, false, true);
            }
        }
        if (this.p0 || System.currentTimeMillis() - getUserConfig().j0 < 86400000) {
            return;
        }
        this.p0 = true;
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiDefaultTopicIcons();
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new fp6(this, (byte) 6));
    }

    public final void x0(long j) {
        TLRPC.User X12;
        if (!getUserConfig().W || !wf3.D(j) || (X12 = getMessagesController().X1(Long.valueOf(j))) == null || X12.bot || X12.self) {
            return;
        }
        getMessagesStorage().a.c(new lq6(this, j, (byte) 2));
    }

    public final void x1(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i, boolean z) {
        if (tL_help_premiumPromo != null) {
            this.E = tL_help_premiumPromo;
            this.G = i;
            getMessagesController().j4(tL_help_premiumPromo.users, z);
            hl.c3(new ip6(this, (byte) 3));
        }
        if (!z) {
            if (tL_help_premiumPromo != null) {
                getMessagesStorage().a.c(new l65((Object) this, (Object) tL_help_premiumPromo, i, (byte) 7));
            }
            this.F = false;
        } else if (tL_help_premiumPromo == null || Math.abs((System.currentTimeMillis() / 1000) - i) >= 86400) {
            T0(false);
        } else {
            this.F = false;
        }
    }

    public final void y() {
        if (this.x0[1]) {
            return;
        }
        if (!this.y0[1] || Math.abs((System.currentTimeMillis() / 1000) - this.r0[1]) >= 3600) {
            M0(true, true);
        }
    }

    public final void y1(int i, int i2, ArrayList arrayList, boolean z) {
        if (arrayList != null && i2 != 0) {
            ArrayList arrayList2 = this.h;
            arrayList2.clear();
            HashMap hashMap = this.r;
            hashMap.clear();
            ArrayList arrayList3 = this.n;
            arrayList3.clear();
            arrayList2.addAll(arrayList);
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                ((TLRPC.TL_availableReaction) arrayList2.get(i3)).positionInList = i3;
                hashMap.put(((TLRPC.TL_availableReaction) arrayList2.get(i3)).reaction, (TLRPC.TL_availableReaction) arrayList2.get(i3));
                if (!((TLRPC.TL_availableReaction) arrayList2.get(i3)).inactive) {
                    arrayList3.add((TLRPC.TL_availableReaction) arrayList2.get(i3));
                }
            }
            this.f = i;
        }
        this.x = i2;
        if (arrayList != null) {
            hl.c3(new ip6(this, (byte) 8));
        }
        this.w = false;
        if (!z) {
            getMessagesStorage().a.c(new up6(this, arrayList != null ? new ArrayList(arrayList) : null, i, i2, (byte) 1));
        } else {
            System.currentTimeMillis();
            U0(false, Integer.valueOf(i));
        }
    }

    public final void z() {
        if (this.x0[0]) {
            return;
        }
        if (!this.y0[0] || Math.abs((System.currentTimeMillis() / 1000) - this.r0[0]) >= 3600) {
            M0(false, true);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:12|13|(3:15|16|(1:(2:19|20)(1:21))(1:22))(2:147|(1:149)(2:150|(19:152|153|24|(1:(1:(2:28|29)(1:30))(3:31|(2:33|34)|129))(2:130|(3:132|(2:134|34)|129)(7:135|(2:137|138)(2:140|(2:142|143)(3:144|(2:146|34)|129))|139|(1:(3:93|94|95)(3:38|39|(6:(1:42)(1:75)|43|(1:45)(1:(2:65|(1:67)(1:68))(2:69|(1:74)(1:73)))|(1:47)(1:63)|48|(2:50|(2:59|60)(3:(1:55)(1:58)|56|57))(2:61|62))(4:76|(1:78)(2:81|(2:83|(1:85)(1:86))(2:87|(1:92)(1:91)))|79|80)))(1:128)|(10:98|99|100|101|(4:103|(1:105)(1:115)|106|107)(4:116|(1:118)|119|120)|108|109|110|111|112)|39|(0)(0)))|35|(0)(0)|(0)|98|99|100|101|(0)(0)|108|109|110|111|112|39|(0)(0))(1:(2:155|156)(1:157))))|23|24|(0)(0)|35|(0)(0)|(0)|98|99|100|101|(0)(0)|108|109|110|111|112|39|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x015d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01cb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01cc, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125 A[Catch: all -> 0x015d, TRY_ENTER, TryCatch #4 {all -> 0x015d, blocks: (B:103:0x0125, B:105:0x0130, B:106:0x0139, B:115:0x0136, B:118:0x014e), top: B:101:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0143 A[Catch: all -> 0x01cb, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01cb, blocks: (B:100:0x0111, B:108:0x0197, B:111:0x01c6, B:116:0x0143, B:120:0x0160), top: B:99:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0092 A[Catch: Exception -> 0x0318, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0318, blocks: (B:12:0x001f, B:39:0x01d0, B:43:0x01e9, B:45:0x0210, B:47:0x024c, B:48:0x027e, B:50:0x0288, B:52:0x028c, B:56:0x0297, B:58:0x0293, B:59:0x029c, B:60:0x02a3, B:61:0x02a4, B:62:0x02ab, B:65:0x0219, B:67:0x021d, B:68:0x0226, B:69:0x022f, B:71:0x0235, B:73:0x0239, B:74:0x0242, B:76:0x02af, B:78:0x02b6, B:79:0x02f5, B:83:0x02c0, B:85:0x02c4, B:86:0x02ce, B:87:0x02d8, B:89:0x02de, B:91:0x02e2, B:92:0x02ec, B:122:0x01cd, B:130:0x0092, B:135:0x00af, B:140:0x00bd, B:144:0x00ce, B:147:0x0052, B:150:0x0067, B:152:0x006d, B:155:0x0312, B:4:0x0010), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02af A[Catch: Exception -> 0x0318, TryCatch #2 {Exception -> 0x0318, blocks: (B:12:0x001f, B:39:0x01d0, B:43:0x01e9, B:45:0x0210, B:47:0x024c, B:48:0x027e, B:50:0x0288, B:52:0x028c, B:56:0x0297, B:58:0x0293, B:59:0x029c, B:60:0x02a3, B:61:0x02a4, B:62:0x02ab, B:65:0x0219, B:67:0x021d, B:68:0x0226, B:69:0x022f, B:71:0x0235, B:73:0x0239, B:74:0x0242, B:76:0x02af, B:78:0x02b6, B:79:0x02f5, B:83:0x02c0, B:85:0x02c4, B:86:0x02ce, B:87:0x02d8, B:89:0x02de, B:91:0x02e2, B:92:0x02ec, B:122:0x01cd, B:130:0x0092, B:135:0x00af, B:140:0x00bd, B:144:0x00ce, B:147:0x0052, B:150:0x0067, B:152:0x006d, B:155:0x0312, B:4:0x0010), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0(long j, int i, zt0 zt0Var) {
        Intent K;
        TLRPC.Chat M0;
        TLRPC.User user;
        TLRPC.User X12;
        String m;
        TLRPC.FileLocation fileLocation;
        String M02;
        String str;
        boolean z;
        TLRPC.FileLocation fileLocation2;
        Bitmap bitmap;
        int i2;
        PendingIntent pendingIntent;
        boolean z2 = true;
        if (i == 0) {
            try {
                K = K(j);
            } catch (Exception e) {
                e = e;
                cc4.g(e, z2);
                return;
            }
        } else {
            try {
                K = J(j);
            } catch (Exception e3) {
                e = e3;
                z2 = true;
                cc4.g(e, z2);
                return;
            }
        }
        Intent intent = K;
        if (intent == null) {
            if (zt0Var != null) {
                zt0Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (wf3.B(j)) {
            TLRPC.EncryptedChat a1 = getMessagesController().a1(Integer.valueOf((int) (4294967295L & j)));
            if (a1 == null) {
                if (zt0Var != null) {
                    zt0Var.a(Boolean.FALSE);
                    return;
                }
                return;
            }
            X12 = getMessagesController().X1(Long.valueOf(a1.user_id));
        } else if (wf3.D(j)) {
            X12 = getMessagesController().X1(Long.valueOf(j));
        } else {
            if (!wf3.y(j)) {
                if (zt0Var != null) {
                    zt0Var.a(Boolean.FALSE);
                    return;
                }
                return;
            }
            M0 = getMessagesController().M0(Long.valueOf(-j));
            user = null;
            if (user != null) {
                if (M0 == null) {
                    if (zt0Var != null) {
                        zt0Var.a(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                m = M0.title;
                TLRPC.ChatPhoto chatPhoto = M0.photo;
                if (chatPhoto != null) {
                    fileLocation = chatPhoto.photo_small;
                    TLRPC.FileLocation fileLocation3 = fileLocation;
                    str = m;
                    fileLocation2 = fileLocation3;
                }
                str = m;
                fileLocation2 = null;
            } else if (i == f2) {
                m = lbc.r(uc7.s1(this.currentAccount).X1(Long.valueOf(j)));
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (userProfilePhoto != null) {
                    fileLocation = userProfilePhoto.photo_small;
                    TLRPC.FileLocation fileLocation32 = fileLocation;
                    str = m;
                    fileLocation2 = fileLocation32;
                }
                str = m;
                fileLocation2 = null;
            } else {
                if (lbc.B(user)) {
                    M02 = ob6.M0(2131745993, null);
                } else if (lbc.D(user)) {
                    M02 = ob6.M0(2131745629, null);
                } else {
                    m = lv2.m(0, user.first_name, user.last_name);
                    TLRPC.UserProfilePhoto userProfilePhoto2 = user.photo;
                    if (userProfilePhoto2 != null) {
                        fileLocation = userProfilePhoto2.photo_small;
                        TLRPC.FileLocation fileLocation322 = fileLocation;
                        str = m;
                        fileLocation2 = fileLocation322;
                    }
                    str = m;
                    fileLocation2 = null;
                }
                str = M02;
                z = true;
                fileLocation2 = null;
                if (z) {
                    bitmap = null;
                } else {
                    if (fileLocation2 == null) {
                        bitmap = null;
                        if (Build.VERSION.SDK_INT >= 26) {
                            Intent intent2 = new Intent();
                            if (bitmap != null) {
                                intent2.putExtra("android.intent.extra.shortcut.ICON", bitmap);
                            } else if (user != null) {
                                if (user.bot) {
                                    intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(a.b, R.drawable.book_bot));
                                } else {
                                    intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(a.b, R.drawable.book_user));
                                }
                            } else if (!xc2.T(M0) || M0.megagroup) {
                                intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(a.b, R.drawable.book_group));
                            } else {
                                intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(a.b, R.drawable.book_channel));
                            }
                            intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
                            intent2.putExtra("android.intent.extra.shortcut.NAME", str);
                            intent2.putExtra("duplicate", false);
                            intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                            a.b.sendBroadcast(intent2);
                            return;
                        }
                        String str2 = i == 0 ? "sdid_" : "bdid_";
                        Context context = a.b;
                        hka hkaVar = new hka();
                        hkaVar.a = context;
                        hkaVar.b = str2 + j;
                        hkaVar.e = str;
                        hkaVar.c = new Intent[]{intent};
                        if (bitmap != null) {
                            hkaVar.h = IconCompat.c(bitmap);
                        } else if (user != null) {
                            if (user.bot) {
                                hkaVar.h = IconCompat.d(a.b, R.drawable.book_bot);
                            } else {
                                hkaVar.h = IconCompat.d(a.b, R.drawable.book_user);
                            }
                        } else if (!xc2.T(M0) || M0.megagroup) {
                            hkaVar.h = IconCompat.d(a.b, R.drawable.book_group);
                        } else {
                            hkaVar.h = IconCompat.d(a.b, R.drawable.book_channel);
                        }
                        if (zt0Var != null) {
                            byte[] bArr = new byte[16];
                            Utilities.c.nextBytes(bArr);
                            String f = Utilities.f(bArr);
                            Intent intent3 = new Intent(a.b, (Class<?>) ShortcutResultReceiver.class);
                            intent3.putExtra("account", this.currentAccount);
                            intent3.putExtra("req_id", f);
                            pendingIntent = PendingIntent.getBroadcast(a.b, 0, intent3, 167772160);
                            this.p1.put(f, zt0Var);
                        } else {
                            pendingIntent = null;
                        }
                        Context context2 = a.b;
                        if (TextUtils.isEmpty(hkaVar.e)) {
                            throw new IllegalArgumentException("Shortcut must have a non-empty label");
                        }
                        Intent[] intentArr = hkaVar.c;
                        if (intentArr == null || intentArr.length == 0) {
                            throw new IllegalArgumentException("Shortcut must have an intent");
                        }
                        mka.r(context2, hkaVar, pendingIntent == null ? null : pendingIntent.getIntentSender());
                        return;
                    }
                    try {
                        getFileLoader().getClass();
                        bitmap = BitmapFactory.decodeFile(xb4.J(fileLocation2, null, true, true).toString());
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        bitmap = null;
                        cc4.g(th2, z2);
                        if (Build.VERSION.SDK_INT >= 26) {
                        }
                    }
                }
                if (!z || bitmap != null) {
                    int L = hl.L(58.0f);
                    Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                    createBitmap.eraseColor(0);
                    Canvas canvas = new Canvas(createBitmap);
                    if (z) {
                        rb0 rb0Var = new rb0(0, user);
                        if (lbc.B(user)) {
                            rb0Var.f(12);
                        } else {
                            rb0Var.f(1);
                        }
                        rb0Var.setBounds(0, 0, L, L);
                        rb0Var.draw(canvas);
                        i2 = L;
                    } else {
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        if (b2 == null) {
                            b2 = new Paint(1);
                            d2 = new RectF();
                        }
                        float width = L / bitmap.getWidth();
                        canvas.save();
                        canvas.scale(width, width);
                        b2.setShader(bitmapShader);
                        i2 = L;
                        d2.set(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                        canvas.drawRoundRect(d2, bitmap.getWidth(), bitmap.getHeight(), b2);
                        canvas.restore();
                    }
                    Drawable drawable = a.b.getResources().getDrawable(R.drawable.book_logo);
                    int L2 = hl.L(15.0f);
                    int i3 = i2 - L2;
                    int L3 = i3 - hl.L(2.0f);
                    int L4 = i3 - hl.L(2.0f);
                    drawable.setBounds(L3, L4, L3 + L2, L2 + L4);
                    drawable.draw(canvas);
                    canvas.setBitmap(null);
                    bitmap = createBitmap;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                }
            }
            z = false;
            if (z) {
            }
            if (!z) {
            }
            int L5 = hl.L(58.0f);
            Bitmap createBitmap2 = Bitmap.createBitmap(L5, L5, Bitmap.Config.ARGB_8888);
            createBitmap2.eraseColor(0);
            Canvas canvas2 = new Canvas(createBitmap2);
            if (z) {
            }
            Drawable drawable2 = a.b.getResources().getDrawable(R.drawable.book_logo);
            int L22 = hl.L(15.0f);
            int i32 = i2 - L22;
            int L32 = i32 - hl.L(2.0f);
            int L42 = i32 - hl.L(2.0f);
            drawable2.setBounds(L32, L42, L32 + L22, L22 + L42);
            drawable2.draw(canvas2);
            canvas2.setBitmap(null);
            bitmap = createBitmap2;
            if (Build.VERSION.SDK_INT >= 26) {
            }
        }
        user = X12;
        M0 = null;
        if (user != null) {
        }
        z = false;
        if (z) {
        }
        if (!z) {
        }
        int L52 = hl.L(58.0f);
        Bitmap createBitmap22 = Bitmap.createBitmap(L52, L52, Bitmap.Config.ARGB_8888);
        createBitmap22.eraseColor(0);
        Canvas canvas22 = new Canvas(createBitmap22);
        if (z) {
        }
        Drawable drawable22 = a.b.getResources().getDrawable(R.drawable.book_logo);
        int L222 = hl.L(15.0f);
        int i322 = i2 - L222;
        int L322 = i322 - hl.L(2.0f);
        int L422 = i322 - hl.L(2.0f);
        drawable22.setBounds(L322, L422, L322 + L222, L222 + L422);
        drawable22.draw(canvas22);
        canvas22.setBitmap(null);
        bitmap = createBitmap22;
        if (Build.VERSION.SDK_INT >= 26) {
        }
    }

    public final void z1(int i, ArrayList arrayList, boolean z, int i2, final boolean z2) {
        final ls6 ls6Var;
        final int i3;
        final ArrayList arrayList2;
        final boolean z3;
        final int i4;
        if (arrayList != null) {
            ls6Var = this;
            i3 = i;
            arrayList2 = arrayList;
            z3 = z;
            i4 = i2;
            getMessagesStorage().a.c(new Runnable() { // from class: as6
                @Override // java.lang.Runnable
                public final void run() {
                    ls6 ls6Var2 = ls6.this;
                    ArrayList arrayList3 = arrayList2;
                    try {
                        SQLiteDatabase sQLiteDatabase = ls6Var2.getMessagesStorage().b;
                        boolean z4 = z3;
                        byte b = i3;
                        int i5 = z4 ? ls6Var2.getMessagesController().Y2 : (b == 3 || b == 7) ? jn7.d3 : b == 2 ? ls6Var2.getMessagesController().X2 : ls6Var2.getMessagesController().W2;
                        sQLiteDatabase.beginTransaction();
                        SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                        int size = arrayList3.size();
                        int i6 = z4 ? 2 : b == 0 ? 3 : b == 1 ? 4 : b == 3 ? 6 : b == 5 ? 7 : b == 7 ? 8 : 5;
                        boolean z5 = z2;
                        if (z5) {
                            sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE type = " + i6).stepThis().dispose();
                        }
                        int i7 = 0;
                        while (i7 < size && i7 != i5) {
                            TLRPC.Document document = (TLRPC.Document) arrayList3.get(i7);
                            executeFast.requery();
                            StringBuilder sb = new StringBuilder();
                            sb.append("");
                            int i8 = i7;
                            sb.append(document.id);
                            executeFast.bindString(1, sb.toString());
                            executeFast.bindInteger(2, i6);
                            executeFast.bindString(3, "");
                            executeFast.bindString(4, "");
                            executeFast.bindString(5, "");
                            executeFast.bindInteger(6, 0);
                            executeFast.bindInteger(7, 0);
                            executeFast.bindInteger(8, 0);
                            int i9 = i4;
                            if (i9 == 0) {
                                i9 = size - i8;
                            }
                            executeFast.bindInteger(9, i9);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                            document.serializeToStream(nativeByteBuffer);
                            executeFast.bindByteBuffer(10, nativeByteBuffer);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                            i7 = i8 + 1;
                        }
                        executeFast.dispose();
                        sQLiteDatabase.commitTransaction();
                        if (z5 || arrayList3.size() < i5) {
                            return;
                        }
                        sQLiteDatabase.beginTransaction();
                        while (i5 < arrayList3.size()) {
                            sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + ((TLRPC.Document) arrayList3.get(i5)).id + "' AND type = " + i6).stepThis().dispose();
                            i5++;
                        }
                        sQLiteDatabase.commitTransaction();
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                }
            });
        } else {
            ls6Var = this;
            i3 = i;
            arrayList2 = arrayList;
            z3 = z;
            i4 = i2;
        }
        if (i4 == 0) {
            hl.c3(new cs6(ls6Var, z3, i3, arrayList2));
        }
    }
}
