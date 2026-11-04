package org.telegram.messenger;

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
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.lf0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class li extends c1 {
    public static final Pattern S1 = Pattern.compile("\\*\\*(.+?)\\*\\*");
    public static final Pattern T1 = Pattern.compile("__(.+?)__");
    public static final Pattern U1 = Pattern.compile("\\|\\|(.+?)\\|\\|");
    public static final Pattern V1 = Pattern.compile("~~(.+?)~~");
    public static final String W1 = "org.telegram.messenger.SHORTCUT_SHARE";
    public static volatile li[] X1 = new li[4];
    public static final Object[] Y1 = new Object[4];
    public static Paint Z1;
    public static Paint a2;
    public static RectF b2;
    public static Path c2;
    public static final int d2;
    public static final o0.a e2;
    public static final Pattern f2;
    public final zf.c A0;
    public final HashMap A1;
    public final ArrayList B0;
    public final HashSet B1;
    public final ArrayList C0;
    public boolean C1;
    public boolean D0;
    public final ArrayList D1;
    public TLRPC.TL_help_premiumPromo E;
    public final long[] E0;
    public final ArrayList E1;
    public boolean F;
    public final ArrayList[] F0;
    public final ArrayList F1;
    public int G;
    public final Long[] G0;
    public boolean G1;
    public final ArrayList[] H;
    public final boolean[] H0;
    public boolean H1;
    public final a0.h[] I;
    public final boolean[] I0;
    public boolean I1;
    public final a0.h J;
    public final HashSet J0;
    public boolean J1;
    public final a0.h K;
    public boolean K0;
    public TLRPC.TL_emojiList K1;
    public final ArrayList L;
    public final HashMap L0;
    public TLRPC.TL_emojiList L1;
    public final ArrayList M;
    public int M0;
    public TLRPC.TL_emojiList M1;
    public final a0.h N;
    public int N0;
    public TLRPC.TL_emojiList N1;
    public final ConcurrentHashMap O;
    public long O0;
    public boolean O1;
    public TLRPC.TL_messages_stickerSet P;
    public long P0;
    public final a0.h P1;
    public TLRPC.TL_messages_stickerSet Q;
    public long Q0;
    public final HashMap Q1;
    public final HashMap R;
    public dh.n0 R0;
    public final LruCache R1;
    public final a0.h S;
    public int S0;
    public final HashSet T;
    public int T0;
    public final a0.h U;
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
    public a0.h d0;
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
    public final a0.h q1;
    public final HashMap r;
    public final int[] r0;
    public final a0.h r1;
    public String s;
    public boolean s0;
    public final a0.h s1;
    public final ArrayList[] t0;
    public final a0.h t1;
    public final a0.h[] u0;
    public final SharedPreferences u1;
    public final ArrayList[] v0;
    public boolean v1;
    public boolean w;
    public final ArrayList[] w0;
    public final HashMap w1;
    public int x;
    public final boolean[] x0;
    public final a0.h x1;
    public boolean y;
    public final boolean[] y0;
    public final HashMap y1;
    public TLRPC.Document z0;
    public final a0.h z1;

    static {
        for (int i3 = 0; i3 < 4; i3++) {
            Y1[i3] = new Object();
        }
        d2 = 1;
        e2 = new o0.a(10);
        f2 = Pattern.compile("(?<![A-Za-z0-9_+/=:-])(?:-?[0-9]{1,10}:[0-9a-fA-F]{64}|[A-Za-z0-9_+/-]{48})(?![A-Za-z0-9_+/=:-])");
    }

    public li(int i3) {
        super(i3);
        String key;
        long longValue;
        SerializedData serializedData;
        boolean z10;
        this.b = new TLRPC.TL_attachMenuBots();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new HashMap();
        boolean z11 = false;
        int i10 = 1;
        this.H = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(0), new ArrayList(), new ArrayList(), new ArrayList()};
        this.I = new a0.h[]{new a0.h(), new a0.h(), new a0.h(), new a0.h(), new a0.h(), new a0.h()};
        this.J = new a0.h();
        this.K = new a0.h();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new a0.h();
        this.O = new ConcurrentHashMap(100, 1.0f, 1);
        this.P = null;
        this.Q = null;
        this.R = new HashMap();
        this.S = new a0.h();
        this.T = new HashSet();
        this.U = new a0.h();
        this.V = new Runnable[7];
        this.W = new boolean[7];
        this.X = new boolean[7];
        this.Y = new long[7];
        this.Z = new int[7];
        this.a0 = new HashMap();
        this.b0 = new HashMap();
        this.c0 = new int[7];
        this.d0 = new a0.h();
        this.e0 = new HashMap();
        this.f0 = new HashMap();
        this.g0 = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
        this.h0 = new boolean[9];
        this.i0 = new boolean[9];
        this.j0 = new ArrayList();
        this.q0 = new long[2];
        this.r0 = new int[2];
        this.t0 = new ArrayList[]{new ArrayList(), new ArrayList()};
        this.u0 = new a0.h[]{new a0.h(), new a0.h()};
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
        this.q1 = new a0.h();
        this.r1 = new a0.h();
        this.s1 = new a0.h();
        this.t1 = new a0.h();
        this.w1 = new HashMap();
        this.x1 = new a0.h();
        this.y1 = new HashMap();
        this.z1 = new a0.h();
        this.A1 = new HashMap();
        this.B1 = new HashSet();
        this.C1 = false;
        this.D1 = new ArrayList();
        this.E1 = new ArrayList();
        this.F1 = new ArrayList();
        this.O1 = false;
        this.P1 = new a0.h();
        this.Q1 = new HashMap();
        int i11 = 25;
        this.R1 = new LruCache(25);
        if (this.currentAccount == 0) {
            this.u1 = t0.b.getSharedPreferences("drafts", 0);
        } else {
            this.u1 = t0.b.getSharedPreferences("drafts" + this.currentAccount, 0);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.u1.getAll().entrySet()) {
            try {
                key = entry.getKey();
                longValue = Utilities.A(key).longValue();
                serializedData = new SerializedData(Utilities.v((String) entry.getValue()));
            } catch (Exception unused) {
            }
            if (key.startsWith("r_")) {
                z10 = false;
            } else {
                z10 = key.startsWith("rt_");
                if (!z10) {
                    TLRPC.DraftMessage TLdeserialize = TLRPC.DraftMessage.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    if (TLdeserialize != null) {
                        a0.h hVar = (a0.h) this.s1.f(longValue);
                        if (hVar == null) {
                            hVar = new a0.h();
                            this.s1.k(hVar, longValue);
                        }
                        hVar.k(TLdeserialize, key.startsWith("t_") ? Utilities.A(key.substring(key.lastIndexOf(95) + 1)).longValue() : 0L);
                    }
                    serializedData.cleanup();
                }
            }
            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            if (TLdeserialize2 != null) {
                TLdeserialize2.readAttachPath(serializedData, getUserConfig().n);
                a0.h hVar2 = (a0.h) this.t1.f(longValue);
                if (hVar2 == null) {
                    hVar2 = new a0.h();
                    this.t1.k(hVar2, longValue);
                }
                hVar2.k(TLdeserialize2, z10 ? Utilities.z(key.substring(key.lastIndexOf(95) + 1)).intValue() : 0);
                if (TLdeserialize2.reply_to != null) {
                    arrayList.add(TLdeserialize2);
                }
            }
            serializedData.cleanup();
        }
        if (!arrayList.isEmpty()) {
            getMessagesStorage().a.c(new ah(this, arrayList, i10));
        }
        c1("tg_placeholders_android", false, true);
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("emojithemes_config_" + this.currentAccount, 0);
        int i12 = sharedPreferences.getInt("count", 0);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new org.telegram.ui.Components.uo(org.telegram.ui.ActionBar.p3.b(this.currentAccount)));
        for (int i13 = 0; i13 < i12; i13++) {
            SerializedData serializedData2 = new SerializedData(Utilities.v(sharedPreferences.getString("theme_" + i13, "")));
            try {
                org.telegram.ui.ActionBar.p3 c10 = org.telegram.ui.ActionBar.p3.c(this.currentAccount, TLRPC.Theme.TLdeserialize(serializedData2, serializedData2.readInt32(true), true));
                if (c10.f.size() >= 4) {
                    arrayList2.add(new org.telegram.ui.Components.uo(c10));
                }
                d4.s.c(new l9.u(this, arrayList2, z11, i11));
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        U0(false);
        F0(false);
        F0(true);
        this.A0 = new zf.c(this.currentAccount);
        this.e = getMessagesController().e7.getInt("menuBotsUpdateDate", 0);
    }

    public static CharacterStyle J(CharacterStyle characterStyle, ty0 ty0Var, ty0 ty0Var2, boolean z10) {
        ty0 ty0Var3 = new ty0(ty0Var);
        if (ty0Var2 != null) {
            if (z10) {
                ty0Var3.b(ty0Var2);
            } else {
                ty0Var3.a = ty0Var2.a;
                ty0Var3.d = ty0Var2.d;
            }
        }
        if (characterStyle instanceof uy0) {
            return new uy0(ty0Var3, 0);
        }
        if (characterStyle instanceof x31) {
            return new x31(((x31) characterStyle).getURL(), ty0Var3);
        }
        return null;
    }

    public static boolean K(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i3);
            TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList2.get(i3);
            if (messageEntity.getClass() != messageEntity2.getClass() || messageEntity.offset != messageEntity2.offset || messageEntity.length != messageEntity2.length || !TextUtils.equals(messageEntity.url, messageEntity2.url) || !TextUtils.equals(messageEntity.language, messageEntity2.language) || (((messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) && ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id != ((TLRPC.TL_inputMessageEntityMentionName) messageEntity2).user_id) || (((messageEntity instanceof TLRPC.TL_messageEntityMentionName) && ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id != ((TLRPC.TL_messageEntityMentionName) messageEntity2).user_id) || ((messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) && ((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id != ((TLRPC.TL_messageEntityCustomEmoji) messageEntity2).document_id)))) {
                return false;
            }
        }
        return true;
    }

    public static void K1(ArrayList arrayList) {
        int i3 = 0;
        while (i3 < arrayList.size()) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i3);
            if (message == null || (message instanceof TLRPC.TL_messageEmpty) || (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
    }

    public static void S1(SharedPreferences sharedPreferences, long j10, ArrayList arrayList) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", arrayList.size());
        edit.putLong("hash", j10);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLObject tLObject = (TLObject) arrayList.get(i3);
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            edit.putString("object_" + i3, Utilities.f(serializedData.toByteArray()));
        }
        edit.apply();
    }

    public static ArrayList T0(SharedPreferences sharedPreferences) {
        int i3 = sharedPreferences.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i3);
        if (i3 > 0) {
            for (int i10 = 0; i10 < i3; i10++) {
                SerializedData serializedData = new SerializedData(Utilities.v(sharedPreferences.getString("object_" + i10, "")));
                try {
                    arrayList.add(TLRPC.Reaction.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        }
        return arrayList;
    }

    public static TLRPC.TL_inputStickerSetID Z(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return null;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.id = stickerSet.id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        return tL_inputStickerSetID;
    }

    public static void a(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Spannable spannable = (Spannable) charSequence;
        for (org.telegram.ui.Components.p5 p5Var : (org.telegram.ui.Components.p5[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.p5.class)) {
            if (p5Var != null) {
                spannable.removeSpan(p5Var);
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i3);
            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                int i10 = messageEntity.offset;
                int i11 = messageEntity.length + i10;
                if (i10 < i11 && i11 <= spannable.length()) {
                    spannable.setSpan(tL_messageEntityCustomEmoji.document != null ? new org.telegram.ui.Components.p5(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new org.telegram.ui.Components.p5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt), i10, i11, 33);
                }
            }
        }
    }

    public static TLRPC.TL_inputStickerSetItem a0(TLRPC.Document document, String str) {
        TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_inputStickerSetItem.document = tL_inputDocument;
        tL_inputDocument.id = document.id;
        tL_inputDocument.access_hash = document.access_hash;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputStickerSetItem.emoji = str;
        return tL_inputStickerSetItem;
    }

    public static li b0(int i3) {
        li liVar;
        li liVar2 = X1[i3];
        if (liVar2 != null) {
            return liVar2;
        }
        synchronized (Y1) {
            try {
                liVar = X1[i3];
                if (liVar == null) {
                    li[] liVarArr = X1;
                    li liVar3 = new li(i3);
                    liVarArr[i3] = liVar3;
                    liVar = liVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return liVar;
    }

    public static CharSequence d2(int i3, int i10, CharSequence charSequence) {
        return charSequence instanceof SpannableStringBuilder ? charSequence.subSequence(i3, i10) : charSequence instanceof SpannedString ? ((SpannedString) charSequence).subSequence(i3, i10) : TextUtils.substring(charSequence, i3, i10);
    }

    public static void e(int i3, int i10, int i11, ArrayList arrayList) {
        if ((i3 & 256) != 0) {
            TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
            tL_messageEntitySpoiler.offset = i10;
            tL_messageEntitySpoiler.length = i11 - i10;
            arrayList.add(tL_messageEntitySpoiler);
        }
        if ((i3 & 1) != 0) {
            TLRPC.TL_messageEntityBold tL_messageEntityBold = new TLRPC.TL_messageEntityBold();
            tL_messageEntityBold.offset = i10;
            tL_messageEntityBold.length = i11 - i10;
            arrayList.add(tL_messageEntityBold);
        }
        if ((i3 & 2) != 0) {
            TLRPC.TL_messageEntityItalic tL_messageEntityItalic = new TLRPC.TL_messageEntityItalic();
            tL_messageEntityItalic.offset = i10;
            tL_messageEntityItalic.length = i11 - i10;
            arrayList.add(tL_messageEntityItalic);
        }
        if ((i3 & 4) != 0) {
            TLRPC.TL_messageEntityCode tL_messageEntityCode = new TLRPC.TL_messageEntityCode();
            tL_messageEntityCode.offset = i10;
            tL_messageEntityCode.length = i11 - i10;
            arrayList.add(tL_messageEntityCode);
        }
        if ((i3 & 8) != 0) {
            TLRPC.TL_messageEntityStrike tL_messageEntityStrike = new TLRPC.TL_messageEntityStrike();
            tL_messageEntityStrike.offset = i10;
            tL_messageEntityStrike.length = i11 - i10;
            arrayList.add(tL_messageEntityStrike);
        }
        if ((i3 & 16) != 0) {
            TLRPC.TL_messageEntityUnderline tL_messageEntityUnderline = new TLRPC.TL_messageEntityUnderline();
            tL_messageEntityUnderline.offset = i10;
            tL_messageEntityUnderline.length = i11 - i10;
            arrayList.add(tL_messageEntityUnderline);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(uy0 uy0Var, int i3, int i10, Spannable spannable, boolean z10) {
        ty0 ty0Var;
        int i11;
        try {
            int i12 = i3;
            int i13 = i10;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(i12, i13, CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0) {
                int i14 = 0;
                int i15 = 0;
                while (i15 < characterStyleArr.length) {
                    CharacterStyle characterStyle = characterStyleArr[i15];
                    ty0 ty0Var2 = uy0Var != null ? uy0Var.b : new ty0();
                    if (characterStyle instanceof uy0) {
                        ty0Var = ((uy0) characterStyle).b;
                    } else if (characterStyle instanceof x31) {
                        ty0Var = ((x31) characterStyle).a;
                        if (ty0Var == null) {
                            ty0Var = new ty0();
                        }
                    } else {
                        i15++;
                        i14 = 0;
                    }
                    if (ty0Var != null) {
                        int spanStart = spannable.getSpanStart(characterStyle);
                        int spanEnd = spannable.getSpanEnd(characterStyle);
                        spannable.removeSpan(characterStyle);
                        if (spanStart <= i12 || i13 <= spanEnd) {
                            if (spanStart <= i12) {
                                if (spanStart != i12) {
                                    spannable.setSpan(J(characterStyle, ty0Var, null, z10), spanStart, i12, 33);
                                }
                                if (spanEnd > i12) {
                                    if (uy0Var != null) {
                                        spannable.setSpan(J(characterStyle, ty0Var, ty0Var2, z10), i12, Math.min(spanEnd, i13), 33);
                                    }
                                    i11 = spanEnd;
                                    if (spanEnd >= i13) {
                                        if (spanEnd != i13) {
                                            spannable.setSpan(J(characterStyle, ty0Var, null, z10), i13, spanEnd, 33);
                                        }
                                        if (i13 > spanStart && spanEnd <= i12) {
                                            if (uy0Var != null) {
                                                spannable.setSpan(J(characterStyle, ty0Var, ty0Var2, z10), spanStart, Math.min(spanEnd, i13), 33);
                                            }
                                            i12 = i11;
                                        }
                                    }
                                    i12 = i11;
                                }
                            }
                            i11 = i12;
                            if (spanEnd >= i13) {
                            }
                            i12 = i11;
                        } else {
                            spannable.setSpan(J(characterStyle, ty0Var, ty0Var2, z10), spanStart, spanEnd, 33);
                            if (uy0Var != null) {
                                spannable.setSpan(new uy0(new ty0(ty0Var2), i14), spanEnd, i13, 33);
                            }
                        }
                        i13 = spanStart;
                    }
                    i15++;
                    i14 = 0;
                }
            }
            if (uy0Var == null || i12 >= i13 || i12 >= spannable.length()) {
                return;
            }
            spannable.setSpan(uy0Var, i12, Math.min(spannable.length(), i13), 33);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static int f0(TLRPC.Message message) {
        if (message == null) {
            return -1;
        }
        TLRPC.MessageMedia o12 = zi.o1(message);
        if (o12 instanceof TLRPC.TL_messageMediaPoll) {
            return 8;
        }
        if (o12 instanceof TLRPC.TL_messageMediaPhoto) {
            return 0;
        }
        if (!(o12 instanceof TLRPC.TL_messageMediaDocument)) {
            if (!message.entities.isEmpty()) {
                for (int i3 = 0; i3 < message.entities.size(); i3++) {
                    TLRPC.MessageEntity messageEntity = message.entities.get(i3);
                    if ((messageEntity instanceof TLRPC.TL_messageEntityUrl) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntityEmail)) {
                        return 3;
                    }
                }
            }
            return -1;
        }
        TLRPC.Document document = o12.document;
        if (document == null) {
            return -1;
        }
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                z10 = documentAttribute.round_message;
                z12 = !z10;
                z11 = z10;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                z13 = true;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                z10 = documentAttribute.voice;
                z15 = !z10;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                z14 = true;
            }
        }
        if (z10 || z11) {
            return 2;
        }
        if (z12 && !z13 && !z14) {
            return 0;
        }
        if (z14) {
            return -1;
        }
        if (z13) {
            return 5;
        }
        return z15 ? 4 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(ArrayList arrayList, CharSequence charSequence, Spannable spannable, int i3) {
        int i10;
        ArrayList arrayList2;
        ArrayList t02;
        int i11;
        int i12;
        int i13;
        for (uy0 uy0Var : (uy0[]) spannable.getSpans(0, spannable.length(), uy0.class)) {
            spannable.removeSpan(uy0Var);
        }
        int i14 = 1;
        int i15 = 100;
        if (arrayList == null || arrayList.size() <= 100) {
            if (arrayList == null || arrayList.isEmpty() || charSequence == null || charSequence.length() == 0 || arrayList.size() > 1000) {
                i10 = 1;
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i16);
                    if (messageEntity != null) {
                        arrayList3.add(messageEntity);
                    }
                }
                Collections.sort(arrayList3, new o0.a(14));
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayList3.size();
                int i17 = 0;
                int i18 = 0;
                loop3: while (true) {
                    if (i17 < size2) {
                        TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList3.get(i17);
                        if (messageEntity2.length <= 0 || (i13 = messageEntity2.offset) < 0 || i13 >= charSequence.length() || (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                            i10 = i14;
                            i12 = i15;
                        } else {
                            ty0 ty0Var = new ty0();
                            int i19 = messageEntity2.offset;
                            ty0Var.b = i19;
                            ty0Var.c = Math.min(messageEntity2.length, charSequence.length() - ty0Var.b) + i19;
                            if (messageEntity2 instanceof TLRPC.TL_messageEntitySpoiler) {
                                ty0Var.a = 256;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityStrike) {
                                ty0Var.a = 8;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUnderline) {
                                ty0Var.a = 16;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBold) {
                                ty0Var.a = i14;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityItalic) {
                                ty0Var.a = 2;
                            } else if ((messageEntity2 instanceof TLRPC.TL_messageEntityCode) || (messageEntity2 instanceof TLRPC.TL_messageEntityPre)) {
                                ty0Var.a = 4;
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                                ty0Var.a = 64;
                                ty0Var.d = messageEntity2;
                            } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                ty0Var.a = 64;
                                ty0Var.d = messageEntity2;
                            } else {
                                ty0Var.a = 128;
                                ty0Var.d = messageEntity2;
                            }
                            if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                                ty0Var.a |= 1024;
                            }
                            ty0Var.a &= i3;
                            int size3 = arrayList4.size();
                            int i20 = 0;
                            while (true) {
                                if (i20 >= size3) {
                                    i10 = i14;
                                    if (ty0Var.b < ty0Var.c) {
                                        i12 = 100;
                                        if (arrayList4.size() >= 100) {
                                            break;
                                        } else {
                                            arrayList4.add(ty0Var);
                                        }
                                    } else {
                                        i12 = 100;
                                    }
                                } else {
                                    i18++;
                                    if (i18 > 10000) {
                                        i10 = i14;
                                        break loop3;
                                    }
                                    ty0 ty0Var2 = (ty0) arrayList4.get(i20);
                                    int i21 = ty0Var.b;
                                    i10 = i14;
                                    int i22 = ty0Var2.b;
                                    if (i21 > i22) {
                                        int i23 = ty0Var2.c;
                                        if (i21 >= i23) {
                                            continue;
                                        } else if (ty0Var.c < i23) {
                                            if (arrayList4.size() > 98) {
                                                break loop3;
                                            }
                                            ty0 ty0Var3 = new ty0(ty0Var);
                                            ty0Var3.b(ty0Var2);
                                            arrayList4.add(i20 + 1, ty0Var3);
                                            ty0 ty0Var4 = new ty0(ty0Var2);
                                            ty0Var4.b = ty0Var.c;
                                            i20 += 2;
                                            arrayList4.add(i20, ty0Var4);
                                            size3 += 2;
                                            int i24 = ty0Var.b;
                                            ty0Var.b = ty0Var2.c;
                                            ty0Var2.c = i24;
                                        } else {
                                            if (arrayList4.size() >= i15) {
                                                break loop3;
                                            }
                                            ty0 ty0Var5 = new ty0(ty0Var);
                                            ty0Var5.b(ty0Var2);
                                            ty0Var5.c = ty0Var2.c;
                                            i20++;
                                            arrayList4.add(i20, ty0Var5);
                                            size3++;
                                            int i242 = ty0Var.b;
                                            ty0Var.b = ty0Var2.c;
                                            ty0Var2.c = i242;
                                        }
                                        i20++;
                                        i14 = i10;
                                        i15 = 100;
                                    } else {
                                        int i25 = ty0Var.c;
                                        if (i22 < i25) {
                                            int i26 = ty0Var2.c;
                                            if (i25 == i26) {
                                                ty0Var2.b(ty0Var);
                                            } else if (i25 < i26) {
                                                if (arrayList4.size() >= 100) {
                                                    break loop3;
                                                }
                                                ty0 ty0Var6 = new ty0(ty0Var2);
                                                ty0Var6.b(ty0Var);
                                                ty0Var6.c = ty0Var.c;
                                                i20++;
                                                arrayList4.add(i20, ty0Var6);
                                                size3++;
                                                ty0Var2.b = ty0Var.c;
                                            } else {
                                                if (arrayList4.size() >= 100) {
                                                    break loop3;
                                                }
                                                ty0 ty0Var7 = new ty0(ty0Var);
                                                ty0Var7.b = ty0Var2.c;
                                                i20++;
                                                arrayList4.add(i20, ty0Var7);
                                                size3++;
                                                ty0Var2.b(ty0Var);
                                            }
                                            ty0Var.c = i22;
                                        } else {
                                            continue;
                                        }
                                        i20++;
                                        i14 = i10;
                                        i15 = 100;
                                    }
                                }
                            }
                        }
                        i17++;
                        i15 = i12;
                        i14 = i10;
                    } else {
                        i10 = i14;
                        int size4 = arrayList4.size();
                        for (int i27 = 0; i27 < size4; i27++) {
                            ty0 ty0Var8 = (ty0) arrayList4.get(i27);
                            int i28 = ty0Var8.b;
                            if (i28 >= 0 && i28 < (i11 = ty0Var8.c) && i11 <= charSequence.length()) {
                            }
                        }
                        arrayList2 = arrayList4;
                    }
                }
                arrayList2 = null;
            }
            t02 = arrayList2 != null ? arrayList2 : t0(arrayList, charSequence, i3);
        } else {
            t02 = t0(arrayList, charSequence, i3);
            i10 = 1;
        }
        for (int i29 = 0; i29 < Math.min(1000, t02.size()); i29++) {
            ty0 ty0Var9 = (ty0) t02.get(i29);
            f(new uy0(ty0Var9, 0), ty0Var9.b, ty0Var9.c, spannable, i10);
        }
    }

    public static void h(zi ziVar, Spannable spannable) {
        g(ziVar.k.entities, ziVar.v, spannable, -1);
    }

    public static void i(TLRPC.DraftMessage draftMessage, SpannableString spannableString) {
        g(draftMessage.entities, draftMessage.message, spannableString, hs.n4);
    }

    public static CharSequence j1(CharSequence charSequence, Pattern pattern, ArrayList arrayList, e9 e9Var) {
        TLRPC.MessageEntity messageEntity;
        URLSpan[] uRLSpanArr;
        CharSequence charSequence2 = charSequence;
        Matcher matcher = pattern.matcher(charSequence2);
        int i3 = 0;
        int i10 = 0;
        while (i3 <= matcher.regionEnd() && matcher.find(i3)) {
            String group = matcher.group(1);
            boolean z10 = !(charSequence2 instanceof Spannable) || (uRLSpanArr = (URLSpan[]) ((Spannable) charSequence2).getSpans(matcher.start() - i10, matcher.end() - i10, URLSpan.class)) == null || uRLSpanArr.length <= 0;
            if (z10) {
                messageEntity = null;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i11);
                    if ((messageEntity2 instanceof TLRPC.TL_messageEntityPre) || (messageEntity2 instanceof TLRPC.TL_messageEntityCode)) {
                        int start = matcher.start() - i10;
                        int end = matcher.end() - i10;
                        int i12 = messageEntity2.offset;
                        if (g0.B1(start, end, i12, messageEntity2.length + i12)) {
                            z10 = false;
                            break;
                        }
                    } else {
                        if ((messageEntity2 instanceof TLRPC.TL_messageEntityUrl) || (messageEntity2 instanceof TLRPC.TL_messageEntityTonAddress)) {
                            int i13 = messageEntity2.offset + messageEntity2.length;
                            if (!g0.B1(matcher.start() - i10, matcher.start(1) - i10, messageEntity2.offset, i13)) {
                                if (!g0.B1(matcher.end(1) - i10, matcher.end() - i10, messageEntity2.offset, i13)) {
                                    continue;
                                } else if ((messageEntity2 instanceof TLRPC.TL_messageEntityUrl) && i13 == matcher.end() - i10 && matcher.end(1) - i10 > messageEntity2.offset) {
                                    messageEntity = messageEntity2;
                                }
                            }
                            z10 = false;
                            break;
                        }
                    }
                }
            } else {
                messageEntity = null;
            }
            if (z10) {
                charSequence2 = ((Object) charSequence2.subSequence(0, matcher.start() - i10)) + group + ((Object) charSequence2.subSequence(matcher.end() - i10, charSequence2.length()));
                TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) e9Var.k(null);
                messageEntity3.offset = matcher.start() - i10;
                int length = group.length();
                messageEntity3.length = length;
                int i14 = messageEntity3.offset;
                int i15 = length + i14;
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    TLRPC.MessageEntity messageEntity4 = (TLRPC.MessageEntity) arrayList.get(i16);
                    int i17 = messageEntity4.offset;
                    if (i17 > i15) {
                        messageEntity4.offset = i17 - 4;
                    } else if (i17 > i14) {
                        messageEntity4.offset = i17 - 2;
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
                i10 += (matcher.end() - matcher.start()) - group.length();
                i3 = matcher.end();
            } else {
                i3 = matcher.start() + 1;
            }
        }
        return charSequence2;
    }

    public static TLRPC.TL_attachMenuBotIcon k0(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i3);
            i3++;
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = tL_attachMenuBotIcon;
            if (tL_attachMenuBotIcon2.name.equals("default_static")) {
                return tL_attachMenuBotIcon2;
            }
        }
        return null;
    }

    public static void m1(ImageReceiver imageReceiver, ac acVar, String str) {
        if (lc.e(8200)) {
            imageReceiver.w1 = "preload";
            imageReceiver.h0(0);
            imageReceiver.q0(acVar, str, null, null, 0, 11);
        }
    }

    public static long n(int i3, ArrayList arrayList) {
        long j10 = 0;
        if (arrayList == null) {
            return 0L;
        }
        int min = Math.min(i3, arrayList.size());
        for (int i10 = 0; i10 < min; i10++) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            if (document != null) {
                j10 = p(j10, document.id);
            }
        }
        return j10;
    }

    public static long p(long j10, long j11) {
        long j12 = j10 ^ (j10 >>> 21);
        long j13 = j12 ^ (j12 << 35);
        return (j13 ^ (j13 >>> 4)) + j11;
    }

    public static long q(ArrayList arrayList) {
        long j10 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (arrayList.get(i3) != null) {
                if (!((TLRPC.TL_messages_stickerSet) arrayList.get(i3)).set.archived) {
                    j10 = p(j10, r3.hash);
                }
            }
        }
        return j10;
    }

    public static long q0(TLRPC.Document document) {
        if (document == null) {
            return -1L;
        }
        for (int i3 = 0; i3 < document.attributes.size(); i3++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
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

    public static boolean r(TLRPC.Message message) {
        boolean z10 = message instanceof TLRPC.TL_message_secret;
        if (!z10 || (!((zi.o1(message) instanceof TLRPC.TL_messageMediaPhoto) || zi.M4(message) || zi.u3(message)) || zi.o1(message).ttl_seconds == 0 || zi.o1(message).ttl_seconds > 60)) {
            return (z10 || !(message instanceof TLRPC.TL_message) || (!((zi.o1(message) instanceof TLRPC.TL_messageMediaPhoto) || (zi.o1(message) instanceof TLRPC.TL_messageMediaDocument)) || zi.o1(message).ttl_seconds == 0)) && f0(message) != -1;
        }
        return false;
    }

    public static boolean t(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLObject tLObject) {
        TLRPC.User user = tLObject instanceof TLRPC.User ? (TLRPC.User) tLObject : null;
        TLRPC.Chat chat = tLObject instanceof TLRPC.Chat ? (TLRPC.Chat) tLObject : null;
        ArrayList<TLRPC.AttachMenuPeerType> arrayList = tL_attachMenuBot.peer_types;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList.get(i3);
            i3++;
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
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) && chat != null && !t3.V(chat)) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) && chat != null && t3.V(chat)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList t0(ArrayList arrayList, CharSequence charSequence, int i3) {
        int i10;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && !arrayList.isEmpty() && charSequence != null && charSequence.length() != 0 && arrayList.size() <= 1000) {
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i12);
                if (messageEntity != null) {
                    arrayList3.add(messageEntity);
                }
            }
            Collections.sort(arrayList3, new o0.a(13));
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int[] iArr = new int[arrayList3.size() * 2];
            int size2 = arrayList3.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size2; i14++) {
                TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList3.get(i14);
                if (messageEntity2.length > 0 && (i10 = messageEntity2.offset) >= 0 && i10 < charSequence.length()) {
                    int i15 = messageEntity2.offset;
                    int min = Math.min(messageEntity2.length, charSequence.length() - i15) + i15;
                    if (!(messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                        ty0 ty0Var = new ty0();
                        ty0Var.b = i15;
                        ty0Var.c = min;
                        if (messageEntity2 instanceof TLRPC.TL_messageEntitySpoiler) {
                            ty0Var.a = 256;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityStrike) {
                            ty0Var.a = 8;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUnderline) {
                            ty0Var.a = 16;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBold) {
                            ty0Var.a = 1;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityItalic) {
                            ty0Var.a = 2;
                        } else if ((messageEntity2 instanceof TLRPC.TL_messageEntityCode) || (messageEntity2 instanceof TLRPC.TL_messageEntityPre)) {
                            ty0Var.a = 4;
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                            ty0Var.a = 64;
                            ty0Var.d = messageEntity2;
                        } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            ty0Var.a = 64;
                            ty0Var.d = messageEntity2;
                        } else {
                            ty0Var.a = 128;
                            ty0Var.d = messageEntity2;
                        }
                        if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                            ty0Var.a |= 1024;
                        }
                        ty0Var.a &= i3;
                        arrayList4.add(ty0Var);
                        int i16 = i13 + 1;
                        iArr[i13] = i15;
                        i13 += 2;
                        iArr[i16] = min;
                    }
                }
            }
            if (i13 != 0) {
                Arrays.sort(iArr, 0, i13);
                int i17 = 0;
                while (i17 < i13) {
                    int i18 = iArr[i17];
                    while (i17 < i13 && iArr[i17] == i18) {
                        i17++;
                    }
                    if (i17 >= i13) {
                        break;
                    }
                    int i19 = iArr[i17];
                    int size3 = arrayList4.size();
                    ty0 ty0Var2 = null;
                    int i20 = TLObject.FLAG_31;
                    for (int i21 = i11; i21 < size3; i21++) {
                        ty0 ty0Var3 = (ty0) arrayList4.get(i21);
                        if (ty0Var3.b <= i18 && ty0Var3.c >= i19) {
                            if (ty0Var2 == null) {
                                ty0Var2 = new ty0();
                                ty0Var2.b = i18;
                                ty0Var2.c = i19;
                            }
                            ty0Var2.a = ty0Var3.a | ty0Var2.a;
                            TLRPC.MessageEntity messageEntity3 = ty0Var3.d;
                            if (messageEntity3 != null && (ty0Var2.d == null || ty0Var3.b > i20)) {
                                ty0Var2.d = messageEntity3;
                                i20 = ty0Var3.b;
                            }
                        }
                    }
                    if (ty0Var2 != null) {
                        if (!arrayList2.isEmpty()) {
                            ty0 ty0Var4 = (ty0) k2.p1.h(1, arrayList2);
                            if (ty0Var4.c == ty0Var2.b && ty0Var4.a == ty0Var2.a && ty0Var4.d == ty0Var2.d) {
                                ty0Var4.c = ty0Var2.c;
                            }
                        }
                        if (arrayList2.size() >= 1000) {
                            arrayList2.clear();
                            return arrayList2;
                        }
                        arrayList2.add(ty0Var2);
                    }
                    i11 = 0;
                }
            }
        }
        return arrayList2;
    }

    public static String x0(TLRPC.InputStickerSet inputStickerSet) {
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean y(int i3, ArrayList arrayList, boolean z10) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i10);
                int i11 = messageEntity.offset;
                if (z10) {
                    if (i11 >= i3) {
                        continue;
                    }
                    if (messageEntity.offset + messageEntity.length <= i3) {
                        return true;
                    }
                } else {
                    if (i11 > i3) {
                        continue;
                    }
                    if (messageEntity.offset + messageEntity.length <= i3) {
                    }
                }
            }
        }
        return false;
    }

    public static boolean z0(int i3, long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            String str = (i3 == 0 ? "sdid_" : "bdid_") + j10;
            List k10 = g0.f.k(t0.b);
            for (int i10 = 0; i10 < k10.size(); i10++) {
                if (((g0.c) k10.get(i10)).b.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A() {
        if (this.w || Math.abs((System.currentTimeMillis() / 1000) - this.x) < 3600) {
            return;
        }
        S0(true, null);
    }

    public final boolean A0(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int i3 = 0;
        while (true) {
            ArrayList[] arrayListArr = this.g0;
            if (i3 >= arrayListArr[2].size()) {
                return false;
            }
            TLRPC.Document document2 = (TLRPC.Document) arrayListArr[2].get(i3);
            if (document2.id == document.id && document2.dc_id == document.dc_id) {
                return true;
            }
            i3++;
        }
    }

    public final void A1(org.telegram.ui.ActionBar.d2 d2Var, boolean z10, int i3, TLRPC.TL_messages_stickerSetInstallResultArchive tL_messages_stickerSetInstallResultArchive) {
        int size = tL_messages_stickerSetInstallResultArchive.sets.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.K.l(tL_messages_stickerSetInstallResultArchive.sets.get(i10).set.id);
        }
        C0(i3, false);
        getNotificationCenter().k(hs.Y0, tL_messages_stickerSetInstallResultArchive.sets);
        if (d2Var == null || d2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = d2Var.getParentActivity();
        org.telegram.ui.ActionBar.d2 d2Var2 = z10 ? d2Var : null;
        ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_stickerSetInstallResultArchive.sets;
        zv0 zv0Var = new zv0(parentActivity);
        TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(0);
        boolean z11 = stickerSetCovered.set.masks;
        org.telegram.ui.ActionBar.s1 s1Var = zv0Var.a;
        if (z11) {
            zv0Var.d = 1;
            s1Var.S = bd.M0(2131754131, null);
        } else {
            zv0Var.d = 0;
            s1Var.S = bd.M0(2131754126, null);
        }
        zv0Var.c = new ArrayList(arrayList);
        zv0Var.e = d2Var2;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        zv0Var.o(linearLayout);
        TextView textView = new TextView(parentActivity);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        textView.setGravity(b8.mf.y());
        textView.setTextSize(1, 16.0f);
        textView.setPadding(g0.L(23.0f), g0.L(10.0f), g0.L(23.0f), 0);
        if (stickerSetCovered.set.masks) {
            textView.setText(bd.M0(2131754132, null));
        } else {
            textView.setText(bd.M0(2131754127, null));
        }
        linearLayout.addView(textView, b8.mf.o(-2, -2));
        tj0 tj0Var = new tj0(parentActivity, null);
        s1Var.getContext();
        tj0Var.setLayoutManager(new u4.b0(1, false));
        tj0Var.setAdapter(new yv0(zv0Var, parentActivity));
        tj0Var.setVerticalScrollBarEnabled(false);
        tj0Var.setPadding(g0.L(10.0f), 0, g0.L(10.0f), 0);
        tj0Var.setGlowColor(-657673);
        linearLayout.addView(tj0Var, b8.mf.k(0.0f, 10.0f, 0.0f, 0.0f, -1, -2));
        zv0Var.h(bd.M0(2131752041, null), new lf0(12));
        if (d2Var2 != null) {
            zv0Var.k(bd.M0(2131745505, null), new org.telegram.ui.Components.zw(zv0Var, 22));
        }
        d2Var.showDialog(s1Var);
    }

    public final void B(int i3) {
        if (this.W[i3]) {
            return;
        }
        if (!this.X[i3] || Math.abs((System.currentTimeMillis() / 1000) - this.Z[i3]) >= 3600) {
            a1(i3, true, false);
        }
    }

    public final boolean B0(long j10, boolean z10) {
        if (this.K.h(j10) >= 0 || (z10 && this.L.contains(Long.valueOf(j10)))) {
            return (z10 && this.M.contains(Long.valueOf(j10))) ? false : true;
        }
        return false;
    }

    public final void B1(long j10, long j11, gi giVar) {
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0);
        long hash = Objects.hash(Long.valueOf(j10), Long.valueOf(j11));
        String str = hash + "";
        if (giVar == null) {
            sharedPreferences.edit().remove(str).apply();
            this.P1.l(hash);
        } else {
            sharedPreferences.edit().putString(str, giVar.toString()).apply();
            this.P1.k(giVar, hash);
        }
    }

    public final void C() {
        if (getUserConfig().d0 != null) {
            String str = getUserConfig().d0;
            TLRPC.TL_messages_stickerSet p02 = p0(str);
            if (p02 == null) {
                p02 = n0(str);
            }
            if (p02 == null) {
                b0(this.currentAccount).c1(str, false, true);
            }
        }
        if (this.n0 || System.currentTimeMillis() - getUserConfig().h0 < 86400000) {
            return;
        }
        this.n0 = true;
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetTonGifts();
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new zg(this, 7));
    }

    public final void C0(int i3, boolean z10) {
        int i10 = 1;
        if (!z10) {
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            tL_messages_getArchivedStickers.limit = 0;
            tL_messages_getArchivedStickers.masks = i3 == 1;
            tL_messages_getArchivedStickers.emojis = i3 == 5;
            getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new gh(this, i3, i10));
            return;
        }
        int i11 = hp.s1(this.currentAccount).d7.getInt("archivedStickersCount" + i3, -1);
        if (i11 == -1) {
            C0(i3, false);
        } else {
            this.c0[i3] = i11;
            getNotificationCenter().k(hs.Z0, Integer.valueOf(i3));
        }
    }

    public final void C1(TLRPC.TL_emojiStatus tL_emojiStatus) {
        ArrayList<TLRPC.EmojiStatus>[] arrayListArr = this.F0;
        int i3 = 0;
        if (arrayListArr[0] != null) {
            long j10 = tL_emojiStatus.document_id;
            int i10 = 0;
            while (i10 < arrayListArr[0].size()) {
                if ((arrayListArr[0].get(i10) instanceof TLRPC.TL_emojiStatus) && ((TLRPC.TL_emojiStatus) arrayListArr[0].get(i10)).document_id == j10) {
                    arrayListArr[0].remove(i10);
                    i10--;
                }
                i10++;
            }
            arrayListArr[0].add(0, tL_emojiStatus);
            while (arrayListArr[0].size() > 50) {
                a1.g.y(1, arrayListArr[0]);
            }
            TL_account.TL_emojiStatuses tL_emojiStatuses = new TL_account.TL_emojiStatuses();
            tL_emojiStatuses.hash = this.E0[0];
            tL_emojiStatuses.statuses = arrayListArr[0];
            getMessagesStorage().a.c(new k7(this, i3, tL_emojiStatuses, 8));
        }
    }

    public final void D(long j10, long j11, boolean z10) {
        a0.h hVar = this.s1;
        a0.h hVar2 = (a0.h) hVar.f(j10);
        TLRPC.DraftMessage draftMessage = hVar2 != null ? (TLRPC.DraftMessage) hVar2.f(j11) : null;
        if (draftMessage == null) {
            return;
        }
        if (z10) {
            TLRPC.InputReplyTo inputReplyTo = draftMessage.reply_to;
            if (inputReplyTo == null || inputReplyTo.reply_to_msg_id != 0) {
                if (inputReplyTo != null) {
                    inputReplyTo.reply_to_msg_id = 0;
                }
                draftMessage.flags &= -2;
                Q1(j10, j11, draftMessage.message, draftMessage.entities, null, null, null, 0L, draftMessage.no_webpage, true, null);
                return;
            }
            return;
        }
        a0.h hVar3 = (a0.h) hVar.f(j10);
        if (hVar3 != null) {
            hVar3.l(j11);
            if (hVar3.m() == 0) {
                hVar.l(j10);
            }
        }
        a0.h hVar4 = this.t1;
        a0.h hVar5 = (a0.h) hVar4.f(j10);
        if (hVar5 != null) {
            hVar5.l(j11);
            if (hVar5.m() == 0) {
                hVar4.l(j10);
            }
        }
        SharedPreferences sharedPreferences = this.u1;
        if (j11 != 0) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            StringBuilder t10 = a1.g.t(j10, "t_", "_");
            t10.append(j11);
            SharedPreferences.Editor remove = edit.remove(t10.toString());
            StringBuilder t11 = a1.g.t(j10, "rt_", "_");
            t11.append(j11);
            remove.remove(t11.toString()).commit();
            return;
        }
        sharedPreferences.edit().remove("" + j10).remove("r_" + j10).commit();
        getMessagesController().T4(null);
        getNotificationCenter().k(hs.s, new Object[0]);
    }

    public final void D0() {
        E0(false, true, null);
    }

    public final void D1(long j10, TL_bots.BotInfo botInfo) {
        if (botInfo == null) {
            return;
        }
        this.w1.put(botInfo.user_id + "_" + j10, botInfo);
        getMessagesStorage().a.c(new a4(this, botInfo, j10, 12));
    }

    public final void E(boolean z10) {
        this.s1.b();
        this.t1.b();
        this.r1.b();
        this.u1.edit().clear().commit();
        if (z10) {
            getMessagesController().T4(null);
            getNotificationCenter().k(hs.s, new Object[0]);
        }
    }

    public final void E0(boolean z10, boolean z11, org.telegram.ui.lq lqVar) {
        this.c = true;
        if (z10) {
            getMessagesStorage().a.c(new xf(this, 15));
            return;
        }
        TLRPC.TL_messages_getAttachMenuBots tL_messages_getAttachMenuBots = new TLRPC.TL_messages_getAttachMenuBots();
        tL_messages_getAttachMenuBots.hash = z11 ? 0L : this.a;
        getConnectionsManager().sendRequest(tL_messages_getAttachMenuBots, new s4(5, this, lqVar));
    }

    public final void E1(pr prVar, TLRPC.Message message) {
        SQLiteCursor queryFinalized;
        if (prVar == null) {
            return;
        }
        try {
            if (prVar.b != 0) {
                SQLiteDatabase sQLiteDatabase = getMessagesStorage().b;
                Locale locale = Locale.US;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT mid FROM bot_keyboard_topics WHERE uid = " + prVar.a + " AND tid = " + prVar.b, new Object[0]);
            } else {
                SQLiteDatabase sQLiteDatabase2 = getMessagesStorage().b;
                Locale locale2 = Locale.US;
                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid FROM bot_keyboard WHERE uid = " + prVar.a, new Object[0]);
            }
            int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
            queryFinalized.dispose();
            if (intValue < message.id || zi.g3(intValue) || zi.g3(message.id)) {
                SQLitePreparedStatement executeFast = prVar.b != 0 ? getMessagesStorage().b.executeFast("REPLACE INTO bot_keyboard_topics VALUES(?, ?, ?, ?)") : getMessagesStorage().b.executeFast("REPLACE INTO bot_keyboard VALUES(?, ?, ?)");
                executeFast.requery();
                zi.r5(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                if (prVar.b != 0) {
                    executeFast.bindLong(1, prVar.a);
                    executeFast.bindLong(2, prVar.b);
                    executeFast.bindInteger(3, message.id);
                    executeFast.bindByteBuffer(4, nativeByteBuffer);
                } else {
                    executeFast.bindLong(1, prVar.a);
                    executeFast.bindInteger(2, message.id);
                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                }
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
                g0.h3(new ig(this, prVar, message));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void F() {
        this.j1.clear();
        this.k1.clear();
        this.l1.clear();
        this.m1.clear();
        getNotificationCenter().k(hs.S0, new Object[0]);
        getNotificationCenter().k(hs.T0, new Object[0]);
        getNotificationCenter().k(hs.U0, new Object[0]);
        getNotificationCenter().k(hs.V0, new Object[0]);
        getMessagesStorage().a.c(new xf(this, 16));
        m();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0(boolean z10) {
        String string;
        long j10;
        TLRPC.TL_emojiList tL_emojiList;
        Throwable th2;
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("avatar_constructor" + this.currentAccount, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        if (z10) {
            string = sharedPreferences.getString("profile", null);
            j10 = sharedPreferences.getLong("profile_last_check", 0L);
        } else {
            string = sharedPreferences.getString("group", null);
            j10 = sharedPreferences.getLong("group_last_check", 0L);
        }
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                tL_emojiList = (TLRPC.TL_emojiList) TLRPC.EmojiList.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                try {
                    if (z10) {
                        this.K1 = tL_emojiList;
                    } else {
                        this.L1 = tL_emojiList;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    a8.g(th2, true);
                    tL_emojiList2 = tL_emojiList;
                    if (tL_emojiList2 == null) {
                    }
                    TL_account.getDefaultProfilePhotoEmojis getdefaultprofilephotoemojis = new TL_account.getDefaultProfilePhotoEmojis();
                    if (tL_emojiList2 != null) {
                    }
                    getConnectionsManager().sendRequest(getdefaultprofilephotoemojis, new n3(this, sharedPreferences, z10, 2));
                }
            } catch (Throwable th4) {
                tL_emojiList = null;
                th2 = th4;
            }
            tL_emojiList2 = tL_emojiList;
        }
        if (tL_emojiList2 == null && System.currentTimeMillis() - j10 <= 86400000) {
            boolean z11 = r2.a;
            return;
        }
        TL_account.getDefaultProfilePhotoEmojis getdefaultprofilephotoemojis2 = new TL_account.getDefaultProfilePhotoEmojis();
        if (tL_emojiList2 != null) {
            getdefaultprofilephotoemojis2.hash = tL_emojiList2.hash;
        }
        getConnectionsManager().sendRequest(getdefaultprofilephotoemojis2, new n3(this, sharedPreferences, z10, 2));
    }

    public final void F1(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i3) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getMessagesStorage().a.c(new vf(this, tL_messages_stickerSet, str, i3, 8));
    }

    public final boolean G(long j10) {
        for (int i3 = 0; i3 < this.j1.size(); i3++) {
            if (m5.o(((TLRPC.TL_topPeer) this.j1.get(i3)).peer) == j10) {
                return true;
            }
        }
        return false;
    }

    public final void G0(long j10, long j11, boolean z10, int i3, ak akVar) {
        if (z10) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.w1.get(j10 + "_" + j11);
            if (botInfo != null) {
                getNotificationCenter().k(hs.D0, botInfo, Integer.valueOf(i3));
                return;
            }
        }
        getMessagesStorage().a.c(new nh(this, j10, j11, akVar, i3, 0));
    }

    public final void G1(final boolean z10, ArrayList arrayList, final ArrayList arrayList2, final int i3, final long j10, final boolean z11) {
        final ArrayList arrayList3 = arrayList != null ? new ArrayList(arrayList) : null;
        getMessagesStorage().a.c(new Runnable() { // from class: org.telegram.messenger.pf
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList4 = arrayList2;
                long j11 = j10;
                boolean z12 = z11;
                li liVar = li.this;
                ArrayList arrayList5 = arrayList3;
                boolean z13 = z10;
                int i10 = i3;
                try {
                    if (arrayList5 == null) {
                        SQLitePreparedStatement executeFast = liVar.getMessagesStorage().b.executeFast("UPDATE stickers_featured SET date = ? WHERE id = ? AND emoji = ?");
                        executeFast.requery();
                        executeFast.bindInteger(1, i10);
                        executeFast.bindInteger(2, z13 ? 2 : 1);
                        executeFast.bindInteger(3, z13 ? 1 : 0);
                        executeFast.step();
                        executeFast.dispose();
                        return;
                    }
                    SQLitePreparedStatement executeFast2 = liVar.getMessagesStorage().b.executeFast("REPLACE INTO stickers_featured VALUES(?, ?, ?, ?, ?, ?, ?)");
                    executeFast2.requery();
                    int i11 = 4;
                    for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                        i11 += ((TLRPC.StickerSetCovered) arrayList5.get(i12)).getObjectSize();
                    }
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i11);
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer((arrayList4.size() * 8) + 4);
                    nativeByteBuffer.writeInt32(arrayList5.size());
                    for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                        ((TLRPC.StickerSetCovered) arrayList5.get(i13)).serializeToStream(nativeByteBuffer);
                    }
                    nativeByteBuffer2.writeInt32(arrayList4.size());
                    for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                        nativeByteBuffer2.writeInt64(((Long) arrayList4.get(i14)).longValue());
                    }
                    executeFast2.bindInteger(1, z13 ? 2 : 1);
                    executeFast2.bindByteBuffer(2, nativeByteBuffer);
                    executeFast2.bindByteBuffer(3, nativeByteBuffer2);
                    executeFast2.bindInteger(4, i10);
                    executeFast2.bindLong(5, j11);
                    executeFast2.bindInteger(6, z12 ? 1 : 0);
                    executeFast2.bindInteger(7, z13 ? 1 : 0);
                    executeFast2.step();
                    nativeByteBuffer.reuse();
                    nativeByteBuffer2.reuse();
                    executeFast2.dispose();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        });
    }

    public final Intent H(long j10) {
        if (j10 == 0) {
            return null;
        }
        Intent intent = new Intent(t0.b, (Class<?>) OpenAttachedMenuBotReceiver.class);
        if (!m5.E(j10)) {
            return null;
        }
        intent.putExtra("botId", j10);
        intent.putExtra("currentAccount", this.currentAccount);
        StringBuilder sb2 = new StringBuilder("com.tmessages.openshortcutbot");
        int i3 = OpenAttachedMenuBotReceiver.a;
        sb2.append(j10);
        intent.setAction(sb2.toString());
        intent.addFlags(67108864);
        return intent;
    }

    public final TL_bots.BotInfo H0(long j10, long j11) {
        TL_bots.BotInfo botInfo;
        NativeByteBuffer byteBufferValue;
        SQLiteDatabase sQLiteDatabase = getMessagesStorage().b;
        Locale locale = Locale.US;
        StringBuilder t10 = a1.g.t(j10, "SELECT info FROM bot_info_v2 WHERE uid = ", " AND dialogId = ");
        t10.append(j11);
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(t10.toString(), new Object[0]);
        if (!queryFinalized.next() || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
            botInfo = null;
        } else {
            botInfo = TL_bots.BotInfo.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
            byteBufferValue.reuse();
        }
        queryFinalized.dispose();
        return botInfo;
    }

    public final void H1(long j10, long j11, int i3, int i10) {
        getMessagesStorage().a.c(new eg(this, j11, j10, i3, i10, 1));
    }

    public final Intent I(long j10) {
        Intent intent = new Intent(t0.b, (Class<?>) OpenChatReceiver.class);
        if (m5.C(j10)) {
            int i3 = (int) (4294967295L & j10);
            intent.putExtra("encId", i3);
            if (getMessagesController().a1(Integer.valueOf(i3)) == null) {
                return null;
            }
        } else if (m5.E(j10)) {
            intent.putExtra("userId", j10);
        } else {
            if (!m5.z(j10)) {
                return null;
            }
            intent.putExtra("chatId", -j10);
        }
        intent.putExtra("currentAccount", this.currentAccount);
        intent.setAction("com.tmessages.openchat" + j10);
        intent.addFlags(67108864);
        return intent;
    }

    public final void I0(pr prVar, boolean z10) {
        TLRPC.Message message = (TLRPC.Message) this.y1.get(prVar);
        if (message != null) {
            getNotificationCenter().k(hs.G0, message, prVar);
        } else {
            getMessagesStorage().a.c(new qf(this, prVar, z10, 7));
        }
    }

    public final void I1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            return;
        }
        this.J.k(tL_messages_stickerSet, stickerSet.id);
        if (!TextUtils.isEmpty(tL_messages_stickerSet.set.short_name)) {
            this.O.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        }
        int i3 = 0;
        while (true) {
            ArrayList[] arrayListArr = this.H;
            if (i3 >= arrayListArr.length) {
                break;
            }
            ArrayList arrayList = arrayListArr[i3];
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
                    if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.id == tL_messages_stickerSet.set.id) {
                        arrayList.set(i10, tL_messages_stickerSet);
                    }
                }
            }
            i3++;
        }
        long j10 = tL_messages_stickerSet.set.id;
        a0.h hVar = this.N;
        if (hVar.d(j10)) {
            hVar.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
        }
        U1(tL_messages_stickerSet);
        TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet.set;
        int i11 = stickerSet3.masks ? 1 : stickerSet3.emojis ? 5 : 0;
        if (z10) {
            getNotificationCenter().k(hs.x0, Integer.valueOf(i11), Boolean.TRUE);
        }
    }

    public final void J0() {
        if (getUserConfig().w || this.v1) {
            return;
        }
        this.v1 = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getAllDrafts(), new zg(this, 0));
    }

    public final void J1(int i3, int i10, long j10, ArrayList arrayList) {
        getMessagesStorage().a.c(new b1(this, arrayList != null ? new ArrayList(arrayList) : null, i3, i10, j10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K0(boolean z10, boolean z11) {
        long j10;
        TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers;
        boolean[] zArr = this.x0;
        if (zArr[z10 ? 1 : 0]) {
            return;
        }
        zArr[z10 ? 1 : 0] = true;
        if (z11) {
            getMessagesStorage().a.c(new hh(this, z10, 1));
            return;
        }
        long[] jArr = this.q0;
        if (z10) {
            TLRPC.TL_messages_getFeaturedEmojiStickers tL_messages_getFeaturedEmojiStickers = new TLRPC.TL_messages_getFeaturedEmojiStickers();
            j10 = jArr[1];
            tL_messages_getFeaturedEmojiStickers.hash = j10;
            tL_messages_getFeaturedStickers = tL_messages_getFeaturedEmojiStickers;
        } else {
            TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers2 = new TLRPC.TL_messages_getFeaturedStickers();
            j10 = jArr[0];
            tL_messages_getFeaturedStickers2.hash = j10;
            tL_messages_getFeaturedStickers = tL_messages_getFeaturedStickers2;
        }
        getConnectionsManager().sendRequest(tL_messages_getFeaturedStickers, new kf(this, z10, j10, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(int i3, boolean z10) {
        TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses;
        boolean[] zArr = this.I0;
        if (zArr[i3]) {
            return;
        }
        zArr[i3] = true;
        if (z10) {
            getMessagesStorage().a.c(new gg(this, i3, 1));
            return;
        }
        long[] jArr = this.E0;
        if (i3 == 0) {
            TL_account.getRecentEmojiStatuses getrecentemojistatuses = new TL_account.getRecentEmojiStatuses();
            getrecentemojistatuses.hash = jArr[i3];
            getchanneldefaultemojistatuses = getrecentemojistatuses;
        } else if (i3 == 1) {
            TL_account.getDefaultEmojiStatuses getdefaultemojistatuses = new TL_account.getDefaultEmojiStatuses();
            getdefaultemojistatuses.hash = jArr[i3];
            getchanneldefaultemojistatuses = getdefaultemojistatuses;
        } else {
            TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses2 = new TL_account.getChannelDefaultEmojiStatuses();
            getchanneldefaultemojistatuses2.hash = jArr[i3];
            getchanneldefaultemojistatuses = getchanneldefaultemojistatuses2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getchanneldefaultemojistatuses, new gh(this, i3, 0));
    }

    public final void L0(TLRPC.StickerSet stickerSet, boolean z10) {
        if (z10) {
            getMessagesStorage().a.c(new y4(29, this, stickerSet));
            return;
        }
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
        tL_inputStickerSetID.id = stickerSet.id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new zg(this, 6));
    }

    public final void L1(long j10) {
        ArrayList arrayList = this.k1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((TLRPC.TL_topPeer) arrayList.get(i3)).peer.user_id == j10) {
                arrayList.remove(i3);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsInline();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().j1(j10);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new ei.u5(11));
                getMessagesStorage().a.c(new ci.i9(this, j10, 1, 4));
                getNotificationCenter().k(hs.T0, new Object[0]);
                return;
            }
        }
    }

    public final void M(String[] strArr, boolean z10) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            HashMap hashMap = this.A1;
            if (hashMap.get(str) != null) {
                return;
            }
            if (z10 && this.B1.contains(str)) {
                return;
            }
            hashMap.put(str, Boolean.TRUE);
            getMessagesStorage().a.c(new ch(this, str, 5));
        }
    }

    public final void M0(boolean z10) {
        if (this.o1 || !getUserConfig().W) {
            return;
        }
        if (z10) {
            if (this.n1) {
                return;
            }
            this.o1 = true;
            getMessagesStorage().a.c(new xf(this, 13));
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
        getConnectionsManager().sendRequestTyped(tL_contacts_getTopPeers, new c3.b(1), new d(this, 3));
    }

    public final void M1(int i3) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.Z0;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i3 == ((zi) arrayList.get(i11)).f1()) {
                this.d1.add((zi) arrayList.remove(i11));
                i11--;
            }
            i11++;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.a1;
            if (i12 >= arrayList2.size()) {
                break;
            }
            if (i3 == ((zi) arrayList2.get(i12)).f1()) {
                arrayList2.remove(i12);
                i12--;
            }
            i12++;
        }
        while (i10 < this.b1.size()) {
            if (i3 == ((zi) this.b1.get(i10)).f1()) {
                this.b1.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final void N(TLRPC.InputStickerSet inputStickerSet, n10 n10Var) {
        String x02 = x0(inputStickerSet);
        HashMap hashMap = this.L0;
        ArrayList arrayList = (ArrayList) hashMap.get(x02);
        if (arrayList != null && arrayList.size() > 0) {
            arrayList.add(n10Var);
            return;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(x02, arrayList);
        }
        arrayList.add(n10Var);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = inputStickerSet;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new ph(this, x02, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(final long j10, final int i3, final int i10, final int i11, final int i12, final long j11, int i13, final int i14, final int i15, dh.n0 n0Var, String str) {
        final boolean z10;
        TLRPC.TL_messages_search tL_messages_search;
        if (m5.z(j10)) {
            if (t3.S(this.currentAccount, -j10)) {
                z10 = true;
                if (r2.a) {
                    a8.b("load media did " + j10 + " count = " + i3 + " max_id " + i10 + " type = " + i12 + " cache = " + i13 + " classGuid = " + i14);
                }
                if ((i13 == 0 && TextUtils.isEmpty(str)) || m5.C(j10)) {
                    fi fiVar = new fi(this, i3, j10, i11, j11, i12, n0Var, i10, i14, i13, z10, i15);
                    qr messagesStorage = getMessagesStorage();
                    messagesStorage.a.c(fiVar);
                    SparseArray sparseArray = messagesStorage.h;
                    ArrayList arrayList = (ArrayList) sparseArray.get(i14);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        sparseArray.put(i14, arrayList);
                    }
                    arrayList.add(fiVar);
                    return;
                }
                tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = i3;
                if (i11 == 0) {
                    tL_messages_search.offset_id = i11;
                    tL_messages_search.add_offset = -i3;
                } else {
                    tL_messages_search.offset_id = i10;
                }
                if (n0Var != null) {
                    tL_messages_search.flags |= 8;
                    tL_messages_search.saved_reaction.add(n0Var.g());
                }
                if (i12 != 0) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                } else if (i12 == 6) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                } else if (i12 == 7) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterVideo();
                } else if (i12 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i12 == 2) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
                } else if (i12 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i12 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                } else if (i12 == 5) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterGif();
                } else if (i12 == 8) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPoll();
                }
                if (TextUtils.isEmpty(str)) {
                    tL_messages_search.q = str;
                } else {
                    tL_messages_search.q = "";
                }
                tL_messages_search.peer = getMessagesController().j1(j10);
                if (j11 != 0) {
                    if (j10 == getUserConfig().e()) {
                        tL_messages_search.saved_peer_id = getMessagesController().j1(j11);
                        tL_messages_search.flags |= 4;
                    } else {
                        tL_messages_search.top_msg_id = (int) j11;
                        tL_messages_search.flags |= 2;
                    }
                }
                if (tL_messages_search.peer != null) {
                    return;
                }
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate(j10, i11, i3, i10, i12, j11, i14, z10, i15) { // from class: org.telegram.messenger.vh
                    public final /* synthetic */ long b;
                    public final /* synthetic */ int c;
                    public final /* synthetic */ int d;
                    public final /* synthetic */ int e;
                    public final /* synthetic */ int f;
                    public final /* synthetic */ long g;
                    public final /* synthetic */ int h;
                    public final /* synthetic */ int i;

                    {
                        this.i = i15;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            li liVar = li.this;
                            hp messagesController = liVar.getMessagesController();
                            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                            long j12 = this.b;
                            messagesController.e4(arrayList2, j12);
                            int i16 = this.c;
                            boolean z11 = false;
                            if (i16 == 0 ? messages_messages.messages.size() == 0 : messages_messages.messages.size() <= 1) {
                                z11 = true;
                            }
                            liVar.u1(messages_messages, j12, this.d, this.e, i16, this.f, this.g, 0, this.h, z11, this.i);
                        }
                    }
                }), i14);
                return;
            }
        }
        z10 = false;
        if (r2.a) {
        }
        if (i13 == 0) {
        }
        tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i3;
        if (i11 == 0) {
        }
        if (n0Var != null) {
        }
        if (i12 != 0) {
        }
        if (TextUtils.isEmpty(str)) {
        }
        tL_messages_search.peer = getMessagesController().j1(j10);
        if (j11 != 0) {
        }
        if (tL_messages_search.peer != null) {
        }
    }

    public final void N1(long j10) {
        int i3 = 0;
        for (int i10 = 0; i10 < this.j1.size(); i10++) {
            if (((TLRPC.TL_topPeer) this.j1.get(i10)).peer.user_id == j10) {
                this.j1.remove(i10);
                getNotificationCenter().k(hs.S0, new Object[0]);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryCorrespondents();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().j1(j10);
                getMessagesStorage().a.c(new ci.i9(this, j10, i3, 4));
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new ei.u5(11));
                return;
            }
        }
    }

    public final void O(ArrayList arrayList, Integer num, boolean z10, boolean z11, Runnable runnable) {
        if (arrayList.isEmpty()) {
            runnable.run();
            return;
        }
        ArrayList[] arrayListArr = {s0(5)};
        dh dhVar = new dh(this, num, arrayList, z11, z10, arrayListArr, runnable);
        ArrayList arrayList2 = arrayListArr[0];
        if ((arrayList2 != null && !arrayList2.isEmpty()) || this.C1) {
            dhVar.run();
            return;
        }
        this.C1 = true;
        boolean[] zArr = new boolean[1];
        g0.h3(new ul(this, zArr, arrayListArr, dhVar, 15));
        g0.i3(new y4(28, zArr, dhVar), 900L);
    }

    public final void O0() {
        if (this.g1 || this.M0 != 0) {
            return;
        }
        boolean[] zArr = this.Y0;
        if (zArr[0] && this.O0 == 0 && zArr[1]) {
            return;
        }
        int i3 = this.f1;
        this.f1 = this.Z0.size();
        this.g1 = true;
        X1(null, this.Q0, this.O0, this.T0, 1, this.P0, false, this.U0, this.V0, false, this.R0);
        this.f1 = i3;
    }

    public final void O1(int i3, ArrayList arrayList) {
        ArrayList[] arrayListArr = this.H;
        Collections.sort(arrayListArr[i3], new xg(0, arrayList));
        this.Y[i3] = q(arrayListArr[i3]);
        getNotificationCenter().k(hs.x0, Integer.valueOf(i3), Boolean.FALSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (((java.lang.System.currentTimeMillis() / 1000) - r0[1].longValue()) > 1800) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList P() {
        boolean z10 = this.H0[1];
        ArrayList[] arrayListArr = this.F0;
        if (z10) {
            if (arrayListArr[1] != null) {
                Long[] lArr = this.G0;
                if (lArr[1] != null) {
                }
            }
            L(1, false);
        } else {
            L(1, true);
        }
        return arrayListArr[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v9, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, org.telegram.tgnet.TLRPC$Message] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, org.telegram.tgnet.TLRPC$Message] */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r6v3, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r7v8, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    public final ArrayList P0(long j10, long j11, ArrayList arrayList, boolean z10) {
        ?? join;
        CharSequence charSequence;
        ArrayList arrayList2;
        ArrayList arrayList3;
        char c10;
        try {
            ArrayList<Integer> arrayList4 = new ArrayList<>(arrayList);
            if (j11 != 0) {
                join = new StringBuilder();
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Integer num = (Integer) arrayList.get(i3);
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
            int i10 = 1;
            long j12 = getUserConfig().n;
            Object obj = join;
            char c11 = 2;
            ?? r10 = 0;
            ?? queryFinalized = getMessagesStorage().b.queryFinalized(String.format(Locale.US, "SELECT data, mid, date FROM messages_v2 WHERE mid IN (%s) AND uid = %d", obj, Long.valueOf(j10)), new Object[0]);
            while (queryFinalized.next()) {
                ?? byteBufferValue = queryFinalized.byteBufferValue(r10);
                if (byteBufferValue != 0) {
                    ?? TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r10), r10);
                    if (TLdeserialize.action instanceof TLRPC.TL_messageActionHistoryClear) {
                        c10 = c11;
                    } else {
                        TLdeserialize.readAttachPath(byteBufferValue, j12);
                        TLdeserialize.id = queryFinalized.intValue(i10);
                        c10 = 2;
                        TLdeserialize.date = queryFinalized.intValue(2);
                        TLdeserialize.dialog_id = j10;
                        qr.e(TLdeserialize, arrayList8, arrayList9, null);
                        arrayList5.add(TLdeserialize);
                        arrayList4.remove(Integer.valueOf(TLdeserialize.id));
                    }
                    byteBufferValue.reuse();
                } else {
                    c10 = c11;
                }
                c11 = c10;
                r10 = 0;
                i10 = 1;
            }
            queryFinalized.dispose();
            if (arrayList4.isEmpty()) {
                charSequence = ",";
            } else {
                SQLiteDatabase sQLiteDatabase = getMessagesStorage().b;
                Locale locale = Locale.US;
                charSequence = ",";
                ?? r11 = 0;
                ?? queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT data FROM chat_pinned_v2 WHERE uid = " + j10 + " AND mid IN (" + TextUtils.join(charSequence, arrayList4) + ")", new Object[0]);
                while (queryFinalized2.next()) {
                    ?? byteBufferValue2 = queryFinalized2.byteBufferValue(r11);
                    if (byteBufferValue2 != 0) {
                        ?? TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(r11), r11);
                        if (!(TLdeserialize2.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                            TLdeserialize2.readAttachPath(byteBufferValue2, j12);
                            TLdeserialize2.dialog_id = j10;
                            qr.e(TLdeserialize2, arrayList8, arrayList9, null);
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
            } else if (j11 != 0) {
                TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                tL_channels_getMessages.channel = getMessagesController().h1(j11);
                tL_channels_getMessages.id = arrayList4;
                arrayList2 = arrayList9;
                getConnectionsManager().sendRequest(tL_channels_getMessages, new sf(this, j11, j10, tL_channels_getMessages));
            } else {
                arrayList2 = arrayList9;
                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                tL_messages_getMessages.id = arrayList4;
                getConnectionsManager().sendRequest(tL_messages_getMessages, new fj(this, j10, tL_messages_getMessages, 1));
            }
            if (arrayList5.isEmpty()) {
                return null;
            }
            try {
                if (!arrayList8.isEmpty()) {
                    getMessagesStorage().n0(arrayList8, arrayList6, false);
                }
                if (arrayList2.isEmpty()) {
                    arrayList3 = arrayList7;
                } else {
                    arrayList3 = arrayList7;
                    getMessagesStorage().Q(TextUtils.join(charSequence, arrayList2), arrayList3);
                }
                if (z10) {
                    return k(arrayList5, arrayList6, arrayList3, true, true);
                }
                k(arrayList5, arrayList6, arrayList3, true, false);
                return null;
            } catch (Exception e10) {
                e = e10;
                a8.g(e, true);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        boolean z10;
        boolean z11;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.J.f(tL_messages_stickerSet.set.id);
        String str = (String) this.S.f(tL_messages_stickerSet.set.id);
        if (str != null) {
            this.R.put(str, tL_messages_stickerSet);
            F1(str, tL_messages_stickerSet, (int) (System.currentTimeMillis() / 1000));
        }
        if (tL_messages_stickerSet2 == null) {
            tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.O.get(tL_messages_stickerSet.set.short_name);
        }
        if (tL_messages_stickerSet2 == null) {
            tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.N.f(tL_messages_stickerSet.set.id);
            if (tL_messages_stickerSet2 != null) {
                z10 = true;
                if (tL_messages_stickerSet2 != null) {
                    return;
                }
                if ("AnimatedEmojies".equals(tL_messages_stickerSet.set.short_name)) {
                    tL_messages_stickerSet2.documents = tL_messages_stickerSet.documents;
                    tL_messages_stickerSet2.packs = tL_messages_stickerSet.packs;
                    tL_messages_stickerSet2.set = tL_messages_stickerSet.set;
                    g0.h3(new uf(this, tL_messages_stickerSet, 2));
                    z11 = true;
                } else {
                    a0.h hVar = new a0.h();
                    int size = tL_messages_stickerSet.documents.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i3);
                        hVar.k(document, document.id);
                    }
                    int size2 = tL_messages_stickerSet2.documents.size();
                    z11 = false;
                    for (int i10 = 0; i10 < size2; i10++) {
                        TLRPC.Document document2 = (TLRPC.Document) hVar.f(tL_messages_stickerSet2.documents.get(i10).id);
                        if (document2 != null) {
                            tL_messages_stickerSet2.documents.set(i10, document2);
                            z11 = true;
                        }
                    }
                }
                if (z11) {
                    if (z10) {
                        getMessagesStorage().a.c(new uf(this, tL_messages_stickerSet2, 3));
                        return;
                    }
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    int i11 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
                    ArrayList[] arrayListArr = this.H;
                    ArrayList arrayList = arrayListArr[i11];
                    int[] iArr = this.Z;
                    int i12 = iArr[i11];
                    long[] jArr = this.Y;
                    J1(i11, i12, jArr[i11], arrayList);
                    if ("AnimatedEmojies".equals(tL_messages_stickerSet.set.short_name)) {
                        J1(4, iArr[4], jArr[4], arrayListArr[4]);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (tL_messages_stickerSet2 != null) {
        }
    }

    public final String Q() {
        String str = this.s;
        if (str != null) {
            return str;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        String string = hp.s1(this.currentAccount).f7.getString("reaction_on_double_tap", null);
        if (string == null || (this.r.get(string) == null && !string.startsWith("animated_"))) {
            return ((TLRPC.TL_availableReaction) arrayList.get(0)).reaction;
        }
        this.s = string;
        return string;
    }

    public final void Q0(final int i3, final int i10, final long j10) {
        a0.h hVar = this.q1;
        if (hVar.h(j10) >= 0) {
            return;
        }
        hVar.k(Boolean.TRUE, j10);
        final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.peer = getMessagesController().j1(j10);
        tL_messages_search.limit = 40;
        tL_messages_search.offset_id = i3;
        tL_messages_search.q = "";
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPinned();
        getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.messenger.jh
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                int i11;
                boolean z10;
                a0.h hVar2;
                li liVar = li.this;
                liVar.getClass();
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                boolean z11 = tLObject instanceof TLRPC.messages_Messages;
                int i12 = i10;
                if (z11) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar3 = new a0.h();
                    for (int i13 = 0; i13 < messages_messages.users.size(); i13++) {
                        TLRPC.User user = messages_messages.users.get(i13);
                        hVar3.k(user, user.id);
                    }
                    a0.h hVar4 = new a0.h();
                    for (int i14 = 0; i14 < messages_messages.chats.size(); i14++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i14);
                        hVar4.k(chat, chat.id);
                    }
                    liVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                    liVar.getMessagesController().Y3(messages_messages.users, false);
                    liVar.getMessagesController().S3(messages_messages.chats, false);
                    int size = messages_messages.messages.size();
                    int i15 = 0;
                    while (i15 < size) {
                        TLRPC.Message message = messages_messages.messages.get(i15);
                        if ((message instanceof TLRPC.TL_messageService) || (message instanceof TLRPC.TL_messageEmpty)) {
                            hVar2 = hVar4;
                        } else {
                            arrayList.add(Integer.valueOf(message.id));
                            hVar2 = hVar4;
                            hashMap.put(Integer.valueOf(message.id), new zi(liVar.currentAccount, message, hVar3, hVar2, false, false));
                        }
                        i15++;
                        hVar4 = hVar2;
                    }
                    if (i12 != 0 && arrayList.isEmpty()) {
                        arrayList.add(Integer.valueOf(i12));
                    }
                    r5 = messages_messages.messages.size() >= tL_messages_search.limit ? 0 : 1;
                    i11 = Math.max(messages_messages.count, messages_messages.messages.size());
                    z10 = r5;
                } else {
                    if (i12 != 0) {
                        arrayList.add(Integer.valueOf(i12));
                    } else {
                        r5 = 0;
                    }
                    i11 = r5;
                    z10 = false;
                }
                qr messagesStorage = liVar.getMessagesStorage();
                long j11 = j10;
                messagesStorage.c2(j11, arrayList, true, i11, i3, z10, hashMap);
                g0.h3(new qg(liVar, j11, 1));
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0269, code lost:
    
        if (r0.rejected == r8.rejected) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0251, code lost:
    
        if (r13.b == r14.b) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01fe, code lost:
    
        if (r0.reply_to_msg_id == r10.reply_to_msg_id) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01f7, code lost:
    
        if ((r13 == r14 ? true : (r13 == null || r14 == null) ? false : android.text.TextUtils.equals(org.telegram.messenger.gv.h(r13, null), org.telegram.messenger.gv.h(r14, null))) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0213, code lost:
    
        if (r0.story_id != r10.story_id) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02d3, code lost:
    
        if (r0.reply_to_msg_id == 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02e1, code lost:
    
        if (r15.suggested_post == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02be, code lost:
    
        if (r7.effect == r15.effect) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02c0, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q1(long j10, long j11, CharSequence charSequence, ArrayList arrayList, TLRPC.Message message, org.telegram.ui.mm mmVar, TLRPC.SuggestedPost suggestedPost, long j12, boolean z10, boolean z11, TL_iv.RichMessage richMessage) {
        boolean z12;
        boolean z13;
        boolean z14;
        TLRPC.SuggestedPost suggestedPost2;
        boolean z15;
        boolean z16;
        boolean z17;
        TLRPC.Message message2 = (getMessagesController().t2(j10) && j11 == 0) ? null : message;
        TLRPC.DraftMessage tL_draftMessageEmpty = (TextUtils.isEmpty(charSequence) && message2 == null && richMessage == null) ? new TLRPC.TL_draftMessageEmpty() : new TLRPC.TL_draftMessage();
        tL_draftMessageEmpty.rich_message = richMessage;
        tL_draftMessageEmpty.date = (int) (System.currentTimeMillis() / 1000);
        tL_draftMessageEmpty.message = charSequence == null ? "" : charSequence.toString();
        tL_draftMessageEmpty.no_webpage = z10;
        if (j12 != 0) {
            tL_draftMessageEmpty.flags |= 128;
            tL_draftMessageEmpty.effect = j12;
        }
        if (message2 != null) {
            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
            tL_draftMessageEmpty.reply_to = tL_inputReplyToMessage;
            tL_draftMessageEmpty.flags |= 16;
            tL_inputReplyToMessage.reply_to_msg_id = message2.id;
            if (mmVar != null) {
                boolean z18 = mmVar.m;
                if (z18) {
                    ArrayList arrayList2 = mmVar.n;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        tL_draftMessageEmpty.reply_to.quote_rich = new ArrayList<>(mmVar.n);
                        TLRPC.InputReplyTo inputReplyTo = tL_draftMessageEmpty.reply_to;
                        inputReplyTo.flags |= 16;
                        inputReplyTo.quote_offset = z18 ? mmVar.o : mmVar.b;
                    }
                } else {
                    String str = mmVar.i;
                    tL_inputReplyToMessage.quote_text = str;
                    if (str != null) {
                        tL_inputReplyToMessage.flags |= 20;
                        tL_inputReplyToMessage.quote_offset = mmVar.b;
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList3 = mmVar.j;
                    tL_inputReplyToMessage.quote_entities = arrayList3;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        tL_draftMessageEmpty.reply_to.quote_entities = new ArrayList<>(tL_draftMessageEmpty.reply_to.quote_entities);
                        tL_draftMessageEmpty.reply_to.flags |= 8;
                    }
                }
                zi ziVar = mmVar.a;
                if (ziVar != null && ziVar.k != null) {
                    TLRPC.Peer z19 = getMessagesController().z1(j10);
                    TLRPC.Peer peer = mmVar.a.k.peer_id;
                    if (!zi.w5(z19, peer)) {
                        TLRPC.InputReplyTo inputReplyTo2 = tL_draftMessageEmpty.reply_to;
                        inputReplyTo2.flags |= 2;
                        inputReplyTo2.reply_to_peer_id = getMessagesController().m1(peer);
                    }
                }
            } else if (j10 != zi.B0(message2)) {
                TLRPC.InputReplyTo inputReplyTo3 = tL_draftMessageEmpty.reply_to;
                inputReplyTo3.flags |= 2;
                inputReplyTo3.reply_to_peer_id = getMessagesController().m1(getMessagesController().z1(zi.B0(message2)));
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            tL_draftMessageEmpty.entities = arrayList;
            tL_draftMessageEmpty.flags |= 8;
        }
        TLRPC.Chat M0 = hp.s1(this.currentAccount).M0(Long.valueOf(-j10));
        if (t3.p0(M0) && t3.A(this.currentAccount, M0, 24)) {
            tL_draftMessageEmpty.flags |= 16;
            TLRPC.InputReplyTo inputReplyTo4 = tL_draftMessageEmpty.reply_to;
            if (inputReplyTo4 == null) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_draftMessageEmpty.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = getMessagesController().j1(j11);
            } else {
                inputReplyTo4.monoforum_peer_id = getMessagesController().j1(j11);
                tL_draftMessageEmpty.reply_to.flags |= 32;
            }
        }
        if (suggestedPost != null) {
            tL_draftMessageEmpty.suggested_post = suggestedPost;
        }
        a0.h hVar = (a0.h) this.s1.f(j10);
        TLRPC.DraftMessage draftMessage = hVar == null ? null : (TLRPC.DraftMessage) hVar.f(j11);
        if (!z11) {
            if (draftMessage != null) {
                if (draftMessage.message.equals(tL_draftMessageEmpty.message)) {
                    TLRPC.InputReplyTo inputReplyTo5 = draftMessage.reply_to;
                    TLRPC.InputReplyTo inputReplyTo6 = tL_draftMessageEmpty.reply_to;
                    if (inputReplyTo5 != inputReplyTo6) {
                        boolean z20 = inputReplyTo5 instanceof TLRPC.TL_inputReplyToMessage;
                        if (z20 == (inputReplyTo6 instanceof TLRPC.TL_inputReplyToMessage)) {
                            if (z20) {
                                if (zi.v5(inputReplyTo5.reply_to_peer_id, inputReplyTo6.reply_to_peer_id) && TextUtils.equals(inputReplyTo5.quote_text, inputReplyTo6.quote_text)) {
                                    ArrayList<TL_iv.RichText> arrayList4 = inputReplyTo5.quote_rich;
                                    if (arrayList4 != null || inputReplyTo6.quote_rich != null) {
                                        ArrayList<TL_iv.RichText> arrayList5 = inputReplyTo6.quote_rich;
                                    }
                                }
                            } else if (inputReplyTo5 instanceof TLRPC.TL_inputReplyToStory) {
                                if (zi.v5(inputReplyTo5.peer, inputReplyTo6.peer)) {
                                }
                            }
                            if (z14) {
                                TLRPC.SuggestedPost suggestedPost3 = draftMessage.suggested_post;
                                TLRPC.SuggestedPost suggestedPost4 = tL_draftMessageEmpty.suggested_post;
                                if (suggestedPost3 != suggestedPost4) {
                                    if ((suggestedPost3 == null) == (suggestedPost4 == null)) {
                                        TL_stars.StarsAmount starsAmount = suggestedPost3.price;
                                        TL_stars.StarsAmount starsAmount2 = suggestedPost4.price;
                                        dg.a l10 = dg.a.l(starsAmount);
                                        dg.a l11 = dg.a.l(starsAmount2);
                                        if (l10 == l11) {
                                            suggestedPost2 = suggestedPost4;
                                        } else {
                                            if (l10 == null || l11 == null || l10.a != l11.a) {
                                                suggestedPost2 = suggestedPost4;
                                            } else {
                                                suggestedPost2 = suggestedPost4;
                                            }
                                            z15 = false;
                                            if (!z15) {
                                                if (suggestedPost3.schedule_date == suggestedPost2.schedule_date) {
                                                    if (suggestedPost3.accepted == suggestedPost2.accepted) {
                                                    }
                                                }
                                            }
                                        }
                                        z15 = true;
                                        if (!z15) {
                                        }
                                    }
                                    z16 = false;
                                    if (z16) {
                                        TL_iv.RichMessage richMessage2 = draftMessage.rich_message;
                                        TL_iv.RichMessage richMessage3 = tL_draftMessageEmpty.rich_message;
                                        if (richMessage2 == richMessage3) {
                                            z17 = true;
                                        } else if ((richMessage2 == null) != (richMessage3 == null)) {
                                            z17 = false;
                                        } else {
                                            try {
                                                SerializedData serializedData = new SerializedData(richMessage2.getObjectSize());
                                                SerializedData serializedData2 = new SerializedData(richMessage3.getObjectSize());
                                                richMessage2.serializeToStream(serializedData);
                                                richMessage3.serializeToStream(serializedData2);
                                                z17 = Arrays.equals(serializedData.toByteArray(), serializedData2.toByteArray());
                                            } catch (Exception e10) {
                                                z12 = true;
                                                a8.g(e10, true);
                                                z17 = false;
                                            }
                                        }
                                        z12 = true;
                                        if (z17) {
                                            if (draftMessage.no_webpage == tL_draftMessageEmpty.no_webpage) {
                                            }
                                        }
                                    }
                                }
                                z16 = true;
                                if (z16) {
                                }
                            }
                        }
                        z14 = false;
                        if (z14) {
                        }
                    }
                    z14 = true;
                    if (z14) {
                    }
                }
                z13 = false;
            } else {
                z12 = true;
                if (TextUtils.isEmpty(tL_draftMessageEmpty.message)) {
                    TLRPC.InputReplyTo inputReplyTo7 = tL_draftMessageEmpty.reply_to;
                    if (inputReplyTo7 != null) {
                    }
                    if (tL_draftMessageEmpty.effect == 0) {
                        if (tL_draftMessageEmpty.rich_message == null) {
                        }
                    }
                }
                z13 = false;
            }
            if (z13) {
                return;
            }
        }
        R1(j10, j11, tL_draftMessageEmpty, message2, false);
        if (j11 == 0 || t3.c0(M0) || t3.p0(M0)) {
            if (!m5.C(j10)) {
                TLRPC.TL_messages_saveDraft tL_messages_saveDraft = new TLRPC.TL_messages_saveDraft();
                tL_messages_saveDraft.peer = getMessagesController().j1(j10);
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
                    for (int i3 = 0; i3 < richMessage4.blocks.size(); i3++) {
                        tL_inputRichMessage.blocks.add(yy.y0(richMessage4.blocks.get(i3)));
                    }
                    ArrayList<TLRPC.Photo> arrayList6 = richMessage4.photos;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        for (int i10 = 0; i10 < richMessage4.photos.size(); i10++) {
                            TLRPC.Photo photo = richMessage4.photos.get(i10);
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
                        for (int i11 = 0; i11 < richMessage4.documents.size(); i11++) {
                            TLRPC.Document document = richMessage4.documents.get(i11);
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
                getConnectionsManager().sendRequest(tL_messages_saveDraft, new ei.u5(11));
            }
            getMessagesController().T4(null);
            getNotificationCenter().k(hs.s, new Object[0]);
        }
    }

    public final TLRPC.DraftMessage R(long j10, long j11) {
        a0.h hVar = (a0.h) this.s1.f(j10);
        if (hVar == null) {
            return null;
        }
        return (TLRPC.DraftMessage) hVar.f(j11);
    }

    public final void R0(boolean z10) {
        this.F = true;
        if (z10) {
            getMessagesStorage().a.c(new xf(this, 17));
        } else {
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new zg(this, 9));
        }
    }

    public final void R1(final long j10, final long j11, TLRPC.DraftMessage draftMessage, TLRPC.Message message, boolean z10) {
        TLRPC.Message message2;
        String str;
        TLRPC.InputReplyTo inputReplyTo;
        TLRPC.Chat M0;
        StringBuilder sb2;
        if (getMessagesController().t2(j10) && j11 == 0 && TextUtils.isEmpty(draftMessage.message)) {
            TLRPC.InputReplyTo inputReplyTo2 = draftMessage.reply_to;
            if (inputReplyTo2 instanceof TLRPC.TL_inputReplyToMessage) {
                ((TLRPC.TL_inputReplyToMessage) inputReplyTo2).reply_to_msg_id = 0;
            }
        }
        SharedPreferences sharedPreferences = this.u1;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        hp messagesController = getMessagesController();
        a0.h hVar = this.s1;
        a0.h hVar2 = this.t1;
        if (draftMessage == null || (draftMessage instanceof TLRPC.TL_draftMessageEmpty)) {
            a0.h hVar3 = (a0.h) hVar.f(j10);
            if (hVar3 != null) {
                hVar3.l(j11);
                if (hVar3.m() == 0) {
                    hVar.l(j10);
                }
            }
            a0.h hVar4 = (a0.h) hVar2.f(j10);
            if (hVar4 != null) {
                hVar4.l(j11);
                if (hVar4.m() == 0) {
                    hVar2.l(j10);
                }
            }
            if (j11 == 0) {
                sharedPreferences.edit().remove("" + j10).remove("r_" + j10).commit();
            } else {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                StringBuilder t10 = a1.g.t(j10, "t_", "_");
                t10.append(j11);
                SharedPreferences.Editor remove = edit2.remove(t10.toString());
                StringBuilder t11 = a1.g.t(j10, "rt_", "_");
                t11.append(j11);
                remove.remove(t11.toString()).commit();
            }
            a0.h hVar5 = messagesController.R;
            TLRPC.Dialog dialog = (TLRPC.Dialog) hVar5.f(j10);
            if (dialog != null && dialog.top_message == 0) {
                hVar5.l(dialog.id);
                messagesController.y.remove(dialog);
            }
        } else {
            a0.h hVar6 = (a0.h) hVar.f(j10);
            if (hVar6 == null) {
                hVar6 = new a0.h();
                hVar.k(hVar6, j10);
            }
            hVar6.k(draftMessage, j11);
            if (j11 == 0) {
                messagesController.T3(j10, draftMessage);
            }
            try {
                SerializedData serializedData = new SerializedData(draftMessage.getObjectSize());
                draftMessage.serializeToStream(serializedData);
                if (j11 == 0) {
                    sb2 = new StringBuilder("");
                    sb2.append(j10);
                } else {
                    sb2 = new StringBuilder("t_");
                    sb2.append(j10);
                    sb2.append("_");
                    sb2.append(j11);
                }
                edit.putString(sb2.toString(), Utilities.f(serializedData.toByteArray()));
                serializedData.cleanup();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        a0.h hVar7 = (a0.h) hVar2.f(j10);
        TLRPC.User user = null;
        if (message != null || draftMessage == null || draftMessage.reply_to == null) {
            if (draftMessage != null && draftMessage.reply_to == null) {
                message2 = null;
            }
            message2 = message;
        } else {
            if (hVar7 != null) {
                message2 = (TLRPC.Message) hVar7.f(j11);
            }
            message2 = message;
        }
        if (message2 == null) {
            if (hVar7 != null) {
                hVar7.l(j11);
                if (hVar7.m() == 0) {
                    hVar2.l(j10);
                }
            }
            if (j11 == 0) {
                edit.remove("r_" + j10);
            } else {
                StringBuilder t12 = a1.g.t(j10, "rt_", "_");
                t12.append(j11);
                edit.remove(t12.toString());
            }
        } else {
            if (hVar7 == null) {
                hVar7 = new a0.h();
                hVar2.k(hVar7, j10);
            }
            hVar7.k(message2, j11);
            try {
                SerializedData serializedData2 = new SerializedData(message2.getObjectSize());
                message2.serializeToStream(serializedData2);
                if (j11 == 0) {
                    str = "r_" + j10;
                } else {
                    str = "rt_" + j10 + "_" + j11;
                }
                edit.putString(str, Utilities.f(serializedData2.toByteArray()));
                serializedData2.cleanup();
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        edit.commit();
        if (z10) {
            if (j11 == 0 || getMessagesController().t2(j10)) {
                if (draftMessage != null && (inputReplyTo = draftMessage.reply_to) != null && inputReplyTo.reply_to_msg_id != 0 && (message2 == null || ((message2.reply_to instanceof TLRPC.TL_messageReplyHeader) && message2.replyMessage == null))) {
                    final long n4 = (inputReplyTo.flags & 2) != 0 ? m5.n(inputReplyTo.reply_to_peer_id) : j10;
                    if (m5.E(n4)) {
                        user = getMessagesController().a2(Long.valueOf(n4));
                        M0 = null;
                    } else {
                        M0 = getMessagesController().M0(Long.valueOf(-n4));
                    }
                    if (user != null || M0 != null) {
                        final long j12 = t3.T(M0) ? M0.id : 0L;
                        final int i3 = draftMessage.reply_to.reply_to_msg_id;
                        getMessagesStorage().a.c(new Runnable() { // from class: org.telegram.messenger.bi
                            @Override // java.lang.Runnable
                            public final void run() {
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                NativeByteBuffer byteBufferValue;
                                final li liVar = li.this;
                                int i10 = i3;
                                long j13 = n4;
                                try {
                                    SQLiteDatabase sQLiteDatabase = liVar.getMessagesStorage().b;
                                    Locale locale = Locale.US;
                                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, replydata FROM messages_v2 WHERE mid = " + i10 + " and uid = " + j13, new Object[0]);
                                    if (queryFinalized.next()) {
                                        NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(0);
                                        if (byteBufferValue2 != null) {
                                            message4 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                            message4.readAttachPath(byteBufferValue2, liVar.getUserConfig().n);
                                            byteBufferValue2.reuse();
                                        } else {
                                            message4 = null;
                                        }
                                        if (message4 != null) {
                                            ArrayList arrayList = new ArrayList();
                                            ArrayList arrayList2 = new ArrayList();
                                            a0.h hVar8 = new a0.h();
                                            a0.h hVar9 = new a0.h();
                                            try {
                                                TLRPC.MessageReplyHeader messageReplyHeader = message4.reply_to;
                                                if (messageReplyHeader != null && messageReplyHeader.reply_to_msg_id != 0) {
                                                    if (!queryFinalized.isNull(1) && (byteBufferValue = queryFinalized.byteBufferValue(1)) != null) {
                                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                        message4.replyMessage = TLdeserialize;
                                                        TLdeserialize.readAttachPath(byteBufferValue, liVar.getUserConfig().n);
                                                        byteBufferValue.reuse();
                                                        TLRPC.Message message5 = message4.replyMessage;
                                                        if (message5 != null) {
                                                            qr.e(message5, arrayList, arrayList2, null);
                                                        }
                                                    }
                                                    if (message4.replyMessage == null) {
                                                        qr.d(message4, hVar8, hVar9);
                                                    }
                                                }
                                            } catch (Exception e12) {
                                                liVar.getMessagesStorage().o(e12, true);
                                            }
                                            liVar.getMessagesStorage().K0(hVar8, hVar9, arrayList, arrayList2, 0);
                                        }
                                        message3 = message4;
                                    } else {
                                        message3 = null;
                                    }
                                    queryFinalized.dispose();
                                    final long j14 = j10;
                                    final long j15 = j11;
                                    if (message3 != null) {
                                        g0.h3(new t8(liVar, j14, j15, message3, 1));
                                        return;
                                    }
                                    long j16 = j12;
                                    if (j16 == 0) {
                                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                        tL_messages_getMessages.id.add(Integer.valueOf(i10));
                                        final int i11 = 1;
                                        liVar.getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: org.telegram.messenger.wg
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                TLRPC.Message message6;
                                                TLRPC.Message message7;
                                                switch (i11) {
                                                    case 0:
                                                        if (tL_error == null) {
                                                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                            if (!messages_messages.messages.isEmpty() && (message6 = messages_messages.messages.get(0)) != null) {
                                                                g0.h3(new t8(liVar, j14, j15, message6, 1));
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        if (tL_error == null) {
                                                            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                                                            if (!messages_messages2.messages.isEmpty() && (message7 = messages_messages2.messages.get(0)) != null) {
                                                                g0.h3(new t8(liVar, j14, j15, message7, 1));
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
                                    tL_channels_getMessages.channel = liVar.getMessagesController().h1(j16);
                                    tL_channels_getMessages.id.add(Integer.valueOf(i10));
                                    final int i12 = 0;
                                    liVar.getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: org.telegram.messenger.wg
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            TLRPC.Message message6;
                                            TLRPC.Message message7;
                                            switch (i12) {
                                                case 0:
                                                    if (tL_error == null) {
                                                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                                        if (!messages_messages.messages.isEmpty() && (message6 = messages_messages.messages.get(0)) != null) {
                                                            g0.h3(new t8(liVar, j14, j15, message6, 1));
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    if (tL_error == null) {
                                                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                                                        if (!messages_messages2.messages.isEmpty() && (message7 = messages_messages2.messages.get(0)) != null) {
                                                            g0.h3(new t8(liVar, j14, j15, message7, 1));
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } catch (Exception e13) {
                                    a8.g(e13, true);
                                }
                            }
                        });
                    }
                }
                getNotificationCenter().k(hs.W0, Long.valueOf(j10));
            }
        }
    }

    public final gi S(long j10, long j11) {
        if (!this.O1) {
            Set<Map.Entry<String, ?>> entrySet = t0.b.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).getAll().entrySet();
            this.P1.b();
            for (Map.Entry<String, ?> entry : entrySet) {
                String key = entry.getKey();
                String str = (String) entry.getValue();
                gi giVar = null;
                if (str != null) {
                    try {
                        if (str.startsWith("@")) {
                            String[] split = str.substring(1).split("\n");
                            if (split.length >= 6) {
                                gi giVar2 = new gi();
                                giVar2.a = split[0];
                                giVar2.b = Long.parseLong(split[1]);
                                giVar2.c = Integer.parseInt(split[2]);
                                giVar2.d = Long.parseLong(split[3]);
                                if (split[4].contains(";")) {
                                    String[] split2 = split[4].split(";");
                                    giVar2.g = Integer.parseInt(split2[0]) != 0;
                                    giVar2.h = Float.parseFloat(split2[1]);
                                    giVar2.i = Float.parseFloat(split2[2]);
                                } else {
                                    giVar2.g = Integer.parseInt(split[4]) != 0;
                                    giVar2.h = 0.0f;
                                    giVar2.i = 1.0f;
                                }
                                int length = split.length - 5;
                                String[] strArr = new String[length];
                                for (int i3 = 0; i3 < length; i3++) {
                                    strArr[i3] = split[i3 + 5];
                                }
                                String join = TextUtils.join("\n", strArr);
                                giVar2.f = new short[join.length()];
                                int i10 = 0;
                                while (true) {
                                    short[] sArr = giVar2.f;
                                    if (i10 >= sArr.length) {
                                        break;
                                    }
                                    sArr[i10] = (short) join.charAt(i10);
                                    i10++;
                                }
                                giVar = giVar2;
                            }
                        }
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                if (giVar != null) {
                    this.P1.k(giVar, Long.parseLong(key));
                }
            }
            this.O1 = true;
        }
        return (gi) this.P1.f(Objects.hash(Long.valueOf(j10), Long.valueOf(j11)));
    }

    public final void S0(boolean z10, Integer num) {
        this.w = true;
        if (z10) {
            getMessagesStorage().a.c(new xf(this, 14));
            return;
        }
        TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
        tL_messages_getAvailableReactions.hash = num != null ? num.intValue() : this.f;
        getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new zg(this, 3));
    }

    public final TLRPC.Document T(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String replace = charSequence.toString().replace("️", "");
        ArrayList s02 = s0(4);
        int size = s02.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i3);
            int size2 = tL_messages_stickerSet.packs.size();
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i10);
                if (!tL_stickerPack.documents.isEmpty() && TextUtils.equals(tL_stickerPack.emoticon, replace)) {
                    return (TLRPC.Document) this.I[4].f(tL_stickerPack.documents.get(0).longValue());
                }
            }
        }
        return null;
    }

    public final void T1(a0.h hVar, ArrayList arrayList, boolean z10) {
        getMessagesStorage().a.c(new ci.u8(this, z10, arrayList, hVar, 15));
    }

    public final void U(String[] strArr, String str, boolean z10, ii iiVar, boolean z11) {
        V(strArr, str, z10, iiVar, z11, false, false, false, null);
    }

    public final void U0(boolean z10) {
        if (this.G1) {
            return;
        }
        if (!this.H1 || z10) {
            final SharedPreferences sharedPreferences = t0.b.getSharedPreferences("recent_reactions_" + this.currentAccount, 0);
            final SharedPreferences sharedPreferences2 = t0.b.getSharedPreferences("top_reactions_" + this.currentAccount, 0);
            this.D1.clear();
            this.E1.clear();
            this.D1.addAll(T0(sharedPreferences));
            this.E1.addAll(T0(sharedPreferences2));
            this.G1 = true;
            this.H1 = true;
            final boolean[] zArr = new boolean[2];
            TLRPC.TL_messages_getRecentReactions tL_messages_getRecentReactions = new TLRPC.TL_messages_getRecentReactions();
            tL_messages_getRecentReactions.hash = sharedPreferences.getLong("hash", 0L);
            tL_messages_getRecentReactions.limit = 50;
            final int i3 = 0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getRecentReactions, new RequestDelegate(this) { // from class: org.telegram.messenger.ug
                public final /* synthetic */ li b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i3) {
                        case 0:
                            final int i10 = 1;
                            final li liVar = this.b;
                            final SharedPreferences sharedPreferences3 = sharedPreferences;
                            final boolean[] zArr2 = zArr;
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.kh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            li liVar2 = liVar;
                                            ArrayList arrayList = liVar2.E1;
                                            if (tL_error == null) {
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_reactions) {
                                                    TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                    arrayList.clear();
                                                    arrayList.addAll(tL_messages_reactions.reactions);
                                                    li.S1(sharedPreferences3, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                }
                                            }
                                            boolean[] zArr3 = zArr2;
                                            zArr3[1] = true;
                                            if (zArr3[0]) {
                                                liVar2.G1 = false;
                                                break;
                                            }
                                            break;
                                        default:
                                            li liVar3 = liVar;
                                            ArrayList arrayList2 = liVar3.D1;
                                            if (tL_error == null) {
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_reactions) {
                                                    TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject3;
                                                    arrayList2.clear();
                                                    arrayList2.addAll(tL_messages_reactions2.reactions);
                                                    li.S1(sharedPreferences3, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                }
                                            }
                                            boolean[] zArr4 = zArr2;
                                            zArr4[0] = true;
                                            if (zArr4[1]) {
                                                liVar3.G1 = false;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i11 = 0;
                            final li liVar2 = this.b;
                            final SharedPreferences sharedPreferences4 = sharedPreferences;
                            final boolean[] zArr3 = zArr;
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.kh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            li liVar22 = liVar2;
                                            ArrayList arrayList = liVar22.E1;
                                            if (tL_error == null) {
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_reactions) {
                                                    TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                    arrayList.clear();
                                                    arrayList.addAll(tL_messages_reactions.reactions);
                                                    li.S1(sharedPreferences4, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                }
                                            }
                                            boolean[] zArr32 = zArr3;
                                            zArr32[1] = true;
                                            if (zArr32[0]) {
                                                liVar22.G1 = false;
                                                break;
                                            }
                                            break;
                                        default:
                                            li liVar3 = liVar2;
                                            ArrayList arrayList2 = liVar3.D1;
                                            if (tL_error == null) {
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_reactions) {
                                                    TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject3;
                                                    arrayList2.clear();
                                                    arrayList2.addAll(tL_messages_reactions2.reactions);
                                                    li.S1(sharedPreferences4, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                }
                                            }
                                            boolean[] zArr4 = zArr3;
                                            zArr4[0] = true;
                                            if (zArr4[1]) {
                                                liVar3.G1 = false;
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
            tL_messages_getTopReactions.hash = sharedPreferences2.getLong("hash", 0L);
            tL_messages_getTopReactions.limit = 100;
            final int i10 = 1;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getTopReactions, new RequestDelegate(this) { // from class: org.telegram.messenger.ug
                public final /* synthetic */ li b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i10) {
                        case 0:
                            final int i102 = 1;
                            final li liVar = this.b;
                            final SharedPreferences sharedPreferences3 = sharedPreferences2;
                            final boolean[] zArr2 = zArr;
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.kh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i102) {
                                        case 0:
                                            li liVar22 = liVar;
                                            ArrayList arrayList = liVar22.E1;
                                            if (tL_error == null) {
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_reactions) {
                                                    TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                    arrayList.clear();
                                                    arrayList.addAll(tL_messages_reactions.reactions);
                                                    li.S1(sharedPreferences3, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                }
                                            }
                                            boolean[] zArr32 = zArr2;
                                            zArr32[1] = true;
                                            if (zArr32[0]) {
                                                liVar22.G1 = false;
                                                break;
                                            }
                                            break;
                                        default:
                                            li liVar3 = liVar;
                                            ArrayList arrayList2 = liVar3.D1;
                                            if (tL_error == null) {
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_reactions) {
                                                    TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject3;
                                                    arrayList2.clear();
                                                    arrayList2.addAll(tL_messages_reactions2.reactions);
                                                    li.S1(sharedPreferences3, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                }
                                            }
                                            boolean[] zArr4 = zArr2;
                                            zArr4[0] = true;
                                            if (zArr4[1]) {
                                                liVar3.G1 = false;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i11 = 0;
                            final li liVar2 = this.b;
                            final SharedPreferences sharedPreferences4 = sharedPreferences2;
                            final boolean[] zArr3 = zArr;
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.kh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            li liVar22 = liVar2;
                                            ArrayList arrayList = liVar22.E1;
                                            if (tL_error == null) {
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_reactions) {
                                                    TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject2;
                                                    arrayList.clear();
                                                    arrayList.addAll(tL_messages_reactions.reactions);
                                                    li.S1(sharedPreferences4, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                                                }
                                            }
                                            boolean[] zArr32 = zArr3;
                                            zArr32[1] = true;
                                            if (zArr32[0]) {
                                                liVar22.G1 = false;
                                                break;
                                            }
                                            break;
                                        default:
                                            li liVar3 = liVar2;
                                            ArrayList arrayList2 = liVar3.D1;
                                            if (tL_error == null) {
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_reactions) {
                                                    TLRPC.TL_messages_reactions tL_messages_reactions2 = (TLRPC.TL_messages_reactions) tLObject3;
                                                    arrayList2.clear();
                                                    arrayList2.addAll(tL_messages_reactions2.reactions);
                                                    li.S1(sharedPreferences4, tL_messages_reactions2.hash, tL_messages_reactions2.reactions);
                                                }
                                            }
                                            boolean[] zArr4 = zArr3;
                                            zArr4[0] = true;
                                            if (zArr4[1]) {
                                                liVar3.G1 = false;
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

    public final void U1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
            return;
        }
        getMessagesStorage().a.c(new uf(this, tL_messages_stickerSet, 4));
        if (this.K0) {
            return;
        }
        this.K0 = true;
        getMessagesStorage().a.c(new xf(this, 4));
    }

    public final void V(final String[] strArr, final String str, final boolean z10, final ii iiVar, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final Integer num) {
        if (TextUtils.isEmpty(str) || strArr == null) {
            iiVar.h(null, new ArrayList());
        } else {
            final ArrayList arrayList = new ArrayList(i6.i);
            getMessagesStorage().a.c(new Runnable() { // from class: org.telegram.messenger.vg
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:87:0x016b  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x017b  */
                /* JADX WARN: Type inference failed for: r11v14, types: [org.telegram.SQLite.SQLiteDatabase] */
                /* JADX WARN: Type inference failed for: r13v17 */
                /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, org.telegram.messenger.c1, org.telegram.messenger.li] */
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
                    ?? r12 = li.this;
                    ?? r22 = strArr;
                    ii iiVar2 = iiVar;
                    ArrayList arrayList2 = new ArrayList();
                    HashMap hashMap = new HashMap();
                    String str3 = null;
                    boolean z15 = false;
                    for (?? r02 : r22) {
                        try {
                            SQLiteCursor queryFinalized2 = r12.getMessagesStorage().b.queryFinalized("SELECT alias FROM emoji_keywords_info_v2 WHERE lang = ?", new Object[]{r02});
                            if (queryFinalized2.next()) {
                                str3 = queryFinalized2.stringValue(0);
                            }
                            queryFinalized2.dispose();
                            if (str3 != null) {
                                z15 = true;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            r22 = arrayList2;
                        }
                    }
                    try {
                    } catch (Exception e11) {
                        e = e11;
                        a8.g(e, true);
                        Collections.sort(r22, new xg(1, arrayList));
                        if (z11) {
                        }
                    }
                    if (!z15) {
                        g0.h3(new ul(r12, r22, iiVar2, arrayList2, 14));
                        return;
                    }
                    r22 = arrayList2;
                    boolean z16 = z13;
                    String str4 = str;
                    if (z16) {
                        int[] iArr = new int[1];
                        ArrayList j10 = i6.j(str4, iArr);
                        if (iArr[0] > 0) {
                            for (int i3 = 0; i3 < j10.size(); i3++) {
                                String charSequence = ((g6) j10.get(i3)).c.toString();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= r22.size()) {
                                        hi hiVar = new hi();
                                        hiVar.a = charSequence;
                                        hiVar.b = "";
                                        r22.add(hiVar);
                                        break;
                                    }
                                    if (TextUtils.equals(((hi) r22.get(i10)).a, charSequence)) {
                                        break;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                        }
                    }
                    String lowerCase = str4.toLowerCase();
                    for (int i11 = 0; i11 < 2; i11++) {
                        if (i11 == 1) {
                            String S0 = bd.E0().S0(lowerCase, false, false);
                            if (!S0.equals(lowerCase)) {
                                lowerCase = S0;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder(lowerCase);
                        int length = sb2.length();
                        while (true) {
                            if (length <= 0) {
                                str2 = null;
                                break;
                            }
                            length--;
                            char charAt = (char) (sb2.charAt(length) + 1);
                            sb2.setCharAt(length, charAt);
                            if (charAt != 0) {
                                str2 = sb2.toString();
                                break;
                            }
                        }
                        if (z10) {
                            queryFinalized = r12.getMessagesStorage().b.queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword = ?", lowerCase);
                        } else if (str2 != null) {
                            queryFinalized = r12.getMessagesStorage().b.queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword >= ? AND keyword < ?", lowerCase, str2);
                        } else {
                            lowerCase = lowerCase + "%";
                            queryFinalized = r12.getMessagesStorage().b.queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword LIKE ?", lowerCase);
                        }
                        while (queryFinalized.next()) {
                            String replace = queryFinalized.stringValue(0).replace("️", "");
                            if (hashMap.get(replace) == null) {
                                hashMap.put(replace, Boolean.TRUE);
                                hi hiVar2 = new hi();
                                hiVar2.a = replace;
                                hiVar2.b = queryFinalized.stringValue(1);
                                r22.add(hiVar2);
                            }
                        }
                        queryFinalized.dispose();
                    }
                    Collections.sort(r22, new xg(1, arrayList));
                    if (z11) {
                        g0.h3(new bh(iiVar2, r22, str3, 1));
                    } else {
                        r12.O(r22, num, z12, z14, new bh(iiVar2, r22, str3, 0));
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r10 = org.telegram.messenger.hp.s1(r7.currentAccount).f7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r11 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r9 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r10 = r10.getLong("lastGifLoadTime", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (java.lang.Math.abs(java.lang.System.currentTimeMillis() - r10) >= 3600000) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        if (r9 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        r7.k0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        r0[r8] = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r8 != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        r10 = r10.getLong("lastStickersLoadTime", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r8 != 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        r10 = r10.getLong("lastStickersLoadTimeMask", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r8 != 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        r10 = r10.getLong("lastStickersLoadTimeGreet", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r8 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        r10 = r10.getLong("lastStickersLoadTimeEmojiPacks", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if (r8 != 7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        r10 = r10.getLong("lastStickersLoadTimePremiumStickers", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        r10 = r10.getLong("lastStickersLoadTimeFavs", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
    
        if (r9 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        r9 = new org.telegram.tgnet.TLRPC.TL_messages_getSavedGifs();
        r9.hash = n(org.telegram.messenger.hs.e3, r7.j0);
        getConnectionsManager().sendRequest(r9, new org.telegram.messenger.gh(r7, r8, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
    
        r11 = r7.g0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        if (r8 != 2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        r9 = new org.telegram.tgnet.TLRPC.TL_messages_getFavedStickers();
        r9.hash = n(org.telegram.messenger.hs.e3, r11[r8]);
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0125, code lost:
    
        getConnectionsManager().sendRequest(r9, new org.telegram.messenger.gh(r7, r8, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0132, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if (r8 != 3) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cc, code lost:
    
        r0 = new org.telegram.tgnet.TLRPC.TL_messages_getStickers();
        r0.emoticon = "👋" + org.telegram.messenger.i6.c("⭐");
        r0.hash = n(org.telegram.messenger.hs.e3, r11[r8]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ed, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
    
        if (r8 != 7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f1, code lost:
    
        r0 = new org.telegram.tgnet.TLRPC.TL_messages_getStickers();
        r0.emoticon = "📂" + org.telegram.messenger.i6.c("⭐");
        r0.hash = n(org.telegram.messenger.hs.e3, r11[r8]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0113, code lost:
    
        r9 = new org.telegram.tgnet.TLRPC.TL_messages_getRecentStickers();
        r9.hash = n(org.telegram.messenger.hs.e3, r11[r8]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0120, code lost:
    
        if (r8 != 1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0122, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0123, code lost:
    
        r9.attached = r1;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x001e, code lost:
    
        if (r7.i0[r8] != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r7.l0 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r10 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        getMessagesStorage().a.c(new org.telegram.messenger.lf(r7, r9, r8, 2));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.tgnet.TLRPC$TL_messages_getStickers] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.tgnet.TLRPC$TL_messages_getStickers] */
    /* JADX WARN: Type inference failed for: r9v14, types: [org.telegram.tgnet.TLRPC$TL_messages_getFavedStickers] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(int i3, boolean z10, boolean z11, boolean z12) {
        boolean[] zArr = this.h0;
        boolean z13 = false;
        if (z10) {
            if (this.k0) {
            } else {
                this.k0 = true;
            }
        } else if (zArr[i3]) {
        } else {
            zArr[i3] = true;
        }
    }

    public final boolean V1(TLRPC.Document document) {
        int i3 = 4;
        if (document == null) {
            return false;
        }
        if (this.A0.c(document.id) != null) {
            return true;
        }
        long j10 = document.size;
        long j11 = hp.s1(this.currentAccount).l4;
        int i10 = hs.P4;
        if (j10 > j11) {
            hs.e().k(i10, 4, bd.a0("TooLargeError", null, 2131744052, new Object[0]), bd.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(hp.s1(h10.t0).l4 / 1024)));
            return false;
        }
        for (int i11 = 0; i11 < document.attributes.size(); i11++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration > hp.s1(this.currentAccount).k4) {
                hs.e().k(i10, 4, bd.a0("TooLongError", null, 2131744051, new Object[0]), bd.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(hp.s1(h10.t0).k4)));
                return false;
            }
        }
        TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        saveringtone.id = tL_inputDocument;
        tL_inputDocument.id = document.id;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputDocument.access_hash = document.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(saveringtone, new s4(i3, this, document));
        return true;
    }

    public final ArrayList W(CharSequence[] charSequenceArr, boolean z10, boolean z11) {
        int i3;
        boolean z12;
        int i10;
        int i11;
        ArrayList arrayList = null;
        if (charSequenceArr[0] == null) {
            return null;
        }
        int i12 = -1;
        int i13 = -1;
        boolean z13 = false;
        int i14 = 0;
        while (true) {
            if (!z11) {
                break;
            }
            int indexOf = TextUtils.indexOf(charSequenceArr[0], !z13 ? "`" : "```", i14);
            if (indexOf == i12) {
                break;
            }
            if (i13 == i12) {
                z13 = charSequenceArr[0].length() - indexOf > 2 && charSequenceArr[0].charAt(indexOf + 1) == '`' && charSequenceArr[0].charAt(indexOf + 2) == '`';
                i13 = indexOf;
                i14 = indexOf + (z13 ? 3 : 1);
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (int i15 = (z13 ? 3 : 1) + indexOf; i15 < charSequenceArr[0].length() && charSequenceArr[0].charAt(i15) == '`'; i15++) {
                    indexOf++;
                }
                int i16 = (z13 ? 3 : 1) + indexOf;
                if (z13) {
                    char charAt = i13 > 0 ? charSequenceArr[0].charAt(i13 - 1) : (char) 0;
                    int i17 = (charAt == ' ' || charAt == '\n') ? 1 : 0;
                    int i18 = i13 + 3;
                    int indexOf2 = TextUtils.indexOf(charSequenceArr[0], '\n', i18);
                    String str = "";
                    String substring = (indexOf2 < 0 || indexOf2 - i18 <= 0) ? "" : charSequenceArr[0].toString().substring(i18, indexOf2);
                    CharSequence d22 = d2(0, i13 - i17, charSequenceArr[0]);
                    int length = substring.length() + i18 + (!substring.isEmpty());
                    if (length >= 0 && length < charSequenceArr[0].length() && length <= indexOf) {
                        CharSequence d23 = d2(length, indexOf, charSequenceArr[0]);
                        int i19 = indexOf + 3;
                        char charAt2 = i19 < charSequenceArr[0].length() ? charSequenceArr[0].charAt(i19) : (char) 0;
                        CharSequence charSequence = charSequenceArr[0];
                        CharSequence d24 = d2(i19 + ((charAt2 == ' ' || charAt2 == '\n') ? 1 : 0), charSequence.length(), charSequence);
                        if (d22.length() != 0) {
                            d22 = g0.C(d22, "\n");
                        } else {
                            i17 = 1;
                        }
                        if (d24.length() > 0 && d24.charAt(0) != '\n') {
                            d24 = g0.C("\n", d24);
                        }
                        if (d23.length() <= 0 || d23.charAt(d23.length() - 1) != '\n') {
                            i11 = 0;
                        } else {
                            d23 = d2(0, d23.length() - 1, d23);
                            i11 = 1;
                        }
                        if (!TextUtils.isEmpty(d23)) {
                            if (d23.length() > 1 && d23.charAt(0) == '\n') {
                                d23 = d23.subSequence(1, d23.length());
                                indexOf--;
                            }
                            charSequenceArr[0] = g0.C(d22, d23, d24);
                            TLRPC.TL_messageEntityPre tL_messageEntityPre = new TLRPC.TL_messageEntityPre();
                            int i20 = i17 ^ 1;
                            tL_messageEntityPre.offset = i13 + i20;
                            tL_messageEntityPre.length = ((((indexOf - i13) - 3) - (substring.length() + (!substring.isEmpty()))) + i20) - i11;
                            if (!TextUtils.isEmpty(substring) && substring.trim().length() != 0) {
                                str = substring;
                            }
                            tL_messageEntityPre.language = str;
                            arrayList.add(tL_messageEntityPre);
                            i16 -= 6;
                        }
                        i14 = i16;
                        z13 = false;
                        i12 = -1;
                        i13 = -1;
                    }
                    i14 = i16;
                    i12 = -1;
                } else {
                    int i21 = i13 + 1;
                    if (i21 != indexOf) {
                        CharSequence charSequence2 = charSequenceArr[0];
                        if (!(charSequence2 instanceof Spanned) || ((oi.h[]) ((Spanned) charSequence2).getSpans(Utilities.j(i13, charSequence2.length(), 0), Utilities.j(i21, charSequenceArr[0].length(), 0), oi.h.class)).length <= 0) {
                            CharSequence d25 = d2(0, i13, charSequenceArr[0]);
                            CharSequence d26 = d2(i21, indexOf, charSequenceArr[0]);
                            CharSequence charSequence3 = charSequenceArr[0];
                            charSequenceArr[0] = g0.C(d25, d26, d2(indexOf + 1, charSequence3.length(), charSequence3));
                            TLRPC.TL_messageEntityCode tL_messageEntityCode = new TLRPC.TL_messageEntityCode();
                            tL_messageEntityCode.offset = i13;
                            tL_messageEntityCode.length = (indexOf - i13) - 1;
                            arrayList.add(tL_messageEntityCode);
                            i16 -= 2;
                        } else {
                            i14 = i16;
                            i12 = -1;
                        }
                    }
                    i14 = i16;
                    z13 = false;
                    i12 = -1;
                    i13 = -1;
                }
            }
        }
        if (i13 != i12 && z13) {
            CharSequence d27 = d2(0, i13, charSequenceArr[0]);
            CharSequence charSequence4 = charSequenceArr[0];
            charSequenceArr[0] = g0.C(d27, d2(i13 + 2, charSequence4.length(), charSequence4));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            TLRPC.TL_messageEntityCode tL_messageEntityCode2 = new TLRPC.TL_messageEntityCode();
            tL_messageEntityCode2.offset = i13;
            tL_messageEntityCode2.length = 1;
            arrayList.add(tL_messageEntityCode2);
        }
        CharSequence charSequence5 = charSequenceArr[0];
        if (charSequence5 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence5;
            uy0[] uy0VarArr = (uy0[]) spanned.getSpans(0, charSequence5.length(), uy0.class);
            if (uy0VarArr != null && uy0VarArr.length > 0) {
                for (uy0 uy0Var : uy0VarArr) {
                    int spanStart = spanned.getSpanStart(uy0Var);
                    int spanEnd = spanned.getSpanEnd(uy0Var);
                    if (!y(spanStart, arrayList, false) && !y(spanEnd, arrayList, true)) {
                        if (arrayList != null && !arrayList.isEmpty()) {
                            int size = arrayList.size();
                            for (0; i10 < size; i10 + 1) {
                                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i10);
                                int i22 = messageEntity.offset;
                                i10 = (i22 <= spanStart || i22 + messageEntity.length > spanEnd) ? i10 + 1 : 0;
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        e(uy0Var.b.a, spanStart, spanEnd, arrayList);
                    }
                }
            }
            y31[] y31VarArr = (y31[]) spanned.getSpans(0, charSequenceArr[0].length(), y31.class);
            if (y31VarArr != null && y31VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (int i23 = 0; i23 < y31VarArr.length; i23++) {
                    TLRPC.TL_inputMessageEntityMentionName tL_inputMessageEntityMentionName = new TLRPC.TL_inputMessageEntityMentionName();
                    hp messagesController = getMessagesController();
                    tL_inputMessageEntityMentionName.user_id = messagesController.q1(messagesController.a2(Utilities.A(y31VarArr[i23].getURL())));
                    tL_inputMessageEntityMentionName.offset = spanned.getSpanStart(y31VarArr[i23]);
                    tL_inputMessageEntityMentionName.length = Math.min(spanned.getSpanEnd(y31VarArr[i23]), charSequenceArr[0].length()) - tL_inputMessageEntityMentionName.offset;
                    if (charSequenceArr[0].charAt((r10 + r7) - 1) == ' ') {
                        tL_inputMessageEntityMentionName.length--;
                    }
                    arrayList.add(tL_inputMessageEntityMentionName);
                }
            }
            x31[] x31VarArr = (x31[]) spanned.getSpans(0, charSequenceArr[0].length(), x31.class);
            if (x31VarArr != null && x31VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (int i24 = 0; i24 < x31VarArr.length; i24++) {
                    TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                    tL_messageEntityTextUrl.offset = spanned.getSpanStart(x31VarArr[i24]);
                    tL_messageEntityTextUrl.length = Math.min(spanned.getSpanEnd(x31VarArr[i24]), charSequenceArr[0].length()) - tL_messageEntityTextUrl.offset;
                    tL_messageEntityTextUrl.url = x31VarArr[i24].getURL();
                    arrayList.add(tL_messageEntityTextUrl);
                    ty0 ty0Var = x31VarArr[i24].a;
                    if (ty0Var != null) {
                        int i25 = ty0Var.a;
                        int i26 = tL_messageEntityTextUrl.offset;
                        e(i25, i26, tL_messageEntityTextUrl.length + i26, arrayList);
                    }
                }
            }
            org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spanned.getSpans(0, charSequenceArr[0].length(), org.telegram.ui.Components.p5.class);
            if (p5VarArr != null && p5VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.p5 p5Var : p5VarArr) {
                    if (p5Var != null) {
                        try {
                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                            tL_messageEntityCustomEmoji.offset = spanned.getSpanStart(p5Var);
                            tL_messageEntityCustomEmoji.length = Math.min(spanned.getSpanEnd(p5Var), charSequenceArr[0].length()) - tL_messageEntityCustomEmoji.offset;
                            tL_messageEntityCustomEmoji.document_id = p5Var.getDocumentId();
                            tL_messageEntityCustomEmoji.document = p5Var.document;
                            arrayList.add(tL_messageEntityCustomEmoji);
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                }
            }
            oi.h[] hVarArr = (oi.h[]) spanned.getSpans(0, charSequenceArr[0].length(), oi.h.class);
            if (hVarArr != null && hVarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (oi.h hVar : hVarArr) {
                    if (hVar != null) {
                        try {
                            TLRPC.TL_messageEntityPre tL_messageEntityPre2 = new TLRPC.TL_messageEntityPre();
                            tL_messageEntityPre2.offset = spanned.getSpanStart(hVar);
                            tL_messageEntityPre2.length = Math.min(spanned.getSpanEnd(hVar), charSequenceArr[0].length()) - tL_messageEntityPre2.offset;
                            tL_messageEntityPre2.language = hVar.a;
                            arrayList.add(tL_messageEntityPre2);
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                    }
                }
            }
            xg0[] xg0VarArr = (xg0[]) spanned.getSpans(0, charSequenceArr[0].length(), xg0.class);
            if (xg0VarArr != null && xg0VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (xg0 xg0Var : xg0VarArr) {
                    if (xg0Var != null) {
                        try {
                            TLRPC.TL_messageEntityBlockquote tL_messageEntityBlockquote = new TLRPC.TL_messageEntityBlockquote();
                            tL_messageEntityBlockquote.offset = spanned.getSpanStart(xg0Var);
                            tL_messageEntityBlockquote.length = Math.min(spanned.getSpanEnd(xg0Var), charSequenceArr[0].length()) - tL_messageEntityBlockquote.offset;
                            tL_messageEntityBlockquote.collapsed = xg0Var.e;
                            arrayList.add(tL_messageEntityBlockquote);
                        } catch (Exception e12) {
                            a8.g(e12, true);
                        }
                    }
                }
            }
            org.telegram.ui.Components.vz[] vzVarArr = (org.telegram.ui.Components.vz[]) spanned.getSpans(0, charSequenceArr[0].length(), org.telegram.ui.Components.vz.class);
            if (vzVarArr != null && vzVarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.vz vzVar : vzVarArr) {
                    if (vzVar != null) {
                        try {
                            TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                            tL_messageEntityFormattedDate.offset = spanned.getSpanStart(vzVar);
                            tL_messageEntityFormattedDate.length = Math.min(spanned.getSpanEnd(vzVar), charSequenceArr[0].length()) - tL_messageEntityFormattedDate.offset;
                            TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate2 = vzVar.b;
                            tL_messageEntityFormattedDate.relative = tL_messageEntityFormattedDate2.relative;
                            tL_messageEntityFormattedDate.short_time = tL_messageEntityFormattedDate2.short_time;
                            tL_messageEntityFormattedDate.long_time = tL_messageEntityFormattedDate2.long_time;
                            tL_messageEntityFormattedDate.long_date = tL_messageEntityFormattedDate2.long_date;
                            tL_messageEntityFormattedDate.short_date = tL_messageEntityFormattedDate2.short_date;
                            tL_messageEntityFormattedDate.day_of_week = tL_messageEntityFormattedDate2.day_of_week;
                            tL_messageEntityFormattedDate.date = tL_messageEntityFormattedDate2.date;
                            arrayList.add(tL_messageEntityFormattedDate);
                        } catch (Exception e13) {
                            a8.g(e13, true);
                        }
                    }
                }
            }
            if (spanned instanceof Spannable) {
                Spannable spannable = (Spannable) spanned;
                g0.c(spannable, 1, false, false);
                URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, charSequenceArr[0].length(), URLSpan.class);
                if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    for (int i27 = 0; i27 < uRLSpanArr.length; i27++) {
                        URLSpan uRLSpan = uRLSpanArr[i27];
                        if (!(uRLSpan instanceof x31) && !(uRLSpan instanceof y31) && !(uRLSpan instanceof org.telegram.ui.Components.vz)) {
                            TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                            tL_messageEntityUrl.offset = spanned.getSpanStart(uRLSpanArr[i27]);
                            tL_messageEntityUrl.length = Math.min(spanned.getSpanEnd(uRLSpanArr[i27]), charSequenceArr[0].length()) - tL_messageEntityUrl.offset;
                            tL_messageEntityUrl.url = uRLSpanArr[i27].getURL();
                            arrayList.add(tL_messageEntityUrl);
                            spannable.removeSpan(uRLSpanArr[i27]);
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
            Matcher matcher = f2.matcher(charSequence6);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                while (true) {
                    if (i3 < arrayList.size()) {
                        TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i3);
                        int i28 = messageEntity2.offset;
                        i3 = (g0.B1(start, end, i28, messageEntity2.length + i28) && ((messageEntity2 instanceof TLRPC.TL_messageEntityPre) || (messageEntity2 instanceof TLRPC.TL_messageEntityCode) || (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) || (messageEntity2 instanceof TLRPC.TL_messageEntityTonAddress) || (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl))) ? 0 : i3 + 1;
                    } else {
                        try {
                            z12 = WalletEngine2.isValidAddress(matcher.group());
                        } catch (Throwable th2) {
                            a8.g(th2, true);
                            z12 = false;
                        }
                        if (z12) {
                            TLRPC.TL_messageEntityTonAddress tL_messageEntityTonAddress = new TLRPC.TL_messageEntityTonAddress();
                            tL_messageEntityTonAddress.offset = start;
                            tL_messageEntityTonAddress.length = end - start;
                            arrayList.add(tL_messageEntityTonAddress);
                        }
                    }
                }
            }
        }
        if (z11) {
            charSequence6 = j1(j1(j1(charSequence6, S1, arrayList, new o4.v0(25)), T1, arrayList, new o4.v0(26)), U1, arrayList, new o4.v0(27));
            if (z10) {
                charSequence6 = j1(charSequence6, V1, arrayList, new o4.v0(28));
            }
        }
        while (charSequence6.length() > 0 && (charSequence6.charAt(0) == '\n' || charSequence6.charAt(0) == ' ')) {
            int i29 = 1;
            charSequence6 = charSequence6.subSequence(1, charSequence6.length());
            int i30 = 0;
            while (i30 < arrayList.size()) {
                TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) arrayList.get(i30);
                int i31 = messageEntity3.offset;
                if (i31 == 0) {
                    messageEntity3.length -= i29;
                }
                messageEntity3.offset = Math.max(0, i31 - 1);
                i30++;
                i29 = 1;
            }
        }
        while (charSequence6.length() > 0 && (charSequence6.charAt(charSequence6.length() - 1) == '\n' || charSequence6.charAt(charSequence6.length() - 1) == ' ')) {
            charSequence6 = charSequence6.subSequence(0, charSequence6.length() - 1);
            for (int i32 = 0; i32 < arrayList.size(); i32++) {
                TLRPC.MessageEntity messageEntity4 = (TLRPC.MessageEntity) arrayList.get(i32);
                if (messageEntity4.offset + messageEntity4.length > charSequence6.length()) {
                    messageEntity4.length--;
                }
            }
        }
        charSequenceArr[0] = charSequence6;
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0() {
        TLRPC.TL_emojiList tL_emojiList;
        Throwable th2;
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("replyicons_" + this.currentAccount, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        String string = sharedPreferences.getString("replyicons", null);
        long j10 = sharedPreferences.getLong("replyicons_last_check", 0L);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                tL_emojiList = (TLRPC.TL_emojiList) TLRPC.EmojiList.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                try {
                    this.M1 = tL_emojiList;
                } catch (Throwable th3) {
                    th2 = th3;
                    a8.g(th2, true);
                    tL_emojiList2 = tL_emojiList;
                    if (tL_emojiList2 == null) {
                    }
                    TL_account.getDefaultBackgroundEmojis getdefaultbackgroundemojis = new TL_account.getDefaultBackgroundEmojis();
                    if (tL_emojiList2 != null) {
                    }
                    getConnectionsManager().sendRequest(getdefaultbackgroundemojis, new wf(this, sharedPreferences, 2));
                }
            } catch (Throwable th4) {
                tL_emojiList = null;
                th2 = th4;
            }
            tL_emojiList2 = tL_emojiList;
        }
        if (tL_emojiList2 == null && System.currentTimeMillis() - j10 <= 86400000) {
            boolean z10 = r2.a;
            return;
        }
        TL_account.getDefaultBackgroundEmojis getdefaultbackgroundemojis2 = new TL_account.getDefaultBackgroundEmojis();
        if (tL_emojiList2 != null) {
            getdefaultbackgroundemojis2.hash = tL_emojiList2.hash;
        }
        getConnectionsManager().sendRequest(getdefaultbackgroundemojis2, new wf(this, sharedPreferences, 2));
    }

    public final boolean W1() {
        boolean[] zArr = this.Y0;
        return (zArr[0] && this.O0 == 0 && zArr[1]) || this.h1 || this.i1;
    }

    public final long X() {
        long j10 = 0;
        int i3 = 0;
        while (true) {
            ArrayList[] arrayListArr = this.t0;
            if (i3 >= arrayListArr[0].size()) {
                return j10;
            }
            TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) arrayListArr[0].get(i3)).set;
            if (!stickerSet.archived) {
                j10 = p(j10, stickerSet.id);
            }
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x01f2, code lost:
    
        if (r13 != 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0200, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0202, code lost:
    
        r1 = r5.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0204, code lost:
    
        if (r1 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0206, code lost:
    
        r1 = r1.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0208, code lost:
    
        if (r1 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x020a, code lost:
    
        r1 = r1.peer_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x020c, code lost:
    
        if (r1 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x020e, code lost:
    
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0212, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageEmpty) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0215, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x021a, code lost:
    
        if (r1.channel_id != r13) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0225, code lost:
    
        if (r22 == 1271266957) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0229, code lost:
    
        if (r13 == r17) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0234, code lost:
    
        if (org.telegram.messenger.zi.B0(r4) == (-r13)) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0236, code lost:
    
        r0 = org.telegram.messenger.hp.s1(r20.currentAccount).M0(java.lang.Long.valueOf(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0244, code lost:
    
        if (r0 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x024a, code lost:
    
        if (org.telegram.messenger.t3.t0(r0) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0250, code lost:
    
        r0 = (android.util.SparseArray) r8.f(r22);
        r1 = (java.util.ArrayList) r9.f(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x025c, code lost:
    
        if (r0 != null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x025e, code lost:
    
        r0 = new android.util.SparseArray();
        r8.k(r0, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0266, code lost:
    
        if (r1 != null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0268, code lost:
    
        r1 = org.telegram.messenger.k5.j(r9, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x026c, code lost:
    
        r4 = (java.util.ArrayList) r0.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0272, code lost:
    
        if (r4 != null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0274, code lost:
    
        r4 = new java.util.ArrayList();
        r0.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0284, code lost:
    
        if (r1.contains(java.lang.Integer.valueOf(r2)) != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0286, code lost:
    
        r1.add(java.lang.Integer.valueOf(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x028d, code lost:
    
        r4.add(r5);
        org.telegram.messenger.sz.c(r29, "+message did=" + (-r13) + " mid=" + r2 + " at replied #" + r5.f1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x021d, code lost:
    
        r19 = r4;
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x01fd, code lost:
    
        if (r13 != 0) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x039a A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X0(ArrayList arrayList, long j10, int i3, long j11, Runnable runnable, int i10, sz szVar) {
        a0.h hVar;
        rz rzVar;
        int i11;
        a0.h hVar2;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i12;
        zi ziVar;
        long j12;
        long j13;
        ArrayList arrayList2 = arrayList;
        boolean z10 = i3 == 1;
        if (m5.C(j10)) {
            rz d = sz.d(szVar, "loadReplyMessagesForMessages: (encrypted) finding messages to load");
            ArrayList arrayList3 = new ArrayList();
            a0.h hVar3 = new a0.h();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                zi ziVar2 = (zi) arrayList2.get(i13);
                if (ziVar2 != null && ziVar2.f4() && ziVar2.C == null) {
                    long j14 = ziVar2.k.reply_to.reply_to_random_id;
                    ArrayList arrayList4 = (ArrayList) hVar3.f(j14);
                    if (arrayList4 == null) {
                        arrayList4 = k5.j(hVar3, j14);
                    }
                    arrayList4.add(ziVar2);
                    if (!arrayList3.contains(Long.valueOf(j14))) {
                        arrayList3.add(Long.valueOf(j14));
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                sz.a(d);
                getMessagesStorage().a.c(new wh(this, sz.d(szVar, "loadReplyMessagesForMessages (encrypted) storageQueue.postRunnable"), szVar, arrayList3, j10, hVar3, runnable));
                return;
            } else {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        a0.h hVar4 = new a0.h();
        a0.h hVar5 = new a0.h();
        rz d10 = sz.d(szVar, "loadReplyMessagesForMessages: filling replies from the same array");
        int i14 = 0;
        while (true) {
            hVar = null;
            if (i14 >= arrayList2.size()) {
                break;
            }
            zi ziVar3 = (zi) arrayList2.get(i14);
            if (ziVar3 != null && !ziVar3.g4() && ziVar3.f4() && ziVar3.M1() > 0) {
                TLRPC.MessageReplyHeader messageReplyHeader = ziVar3.k.reply_to;
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i15 = messageReplyHeader.reply_to_msg_id;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList2.size()) {
                            break;
                        }
                        if (i14 == i16 || arrayList2.get(i16) == null || ((zi) arrayList2.get(i16)).M1() != i15) {
                            i16++;
                        } else {
                            ziVar3.C = (zi) arrayList2.get(i16);
                            ziVar3.m();
                            TLRPC.MessageAction messageAction = ziVar3.k.action;
                            if (messageAction instanceof TLRPC.TL_messageActionPinMessage) {
                                ziVar3.q0(null, null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionGameScore) {
                                ziVar3.m0(null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSent) {
                                ziVar3.p0(null, false);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                ziVar3.p0(null, true);
                            }
                        }
                    }
                }
            }
            i14++;
        }
        sz.a(d10);
        rz d11 = sz.d(szVar, "loadReplyMessagesForMessages: gathering ids of missing reply data");
        int i17 = 0;
        while (i17 < arrayList2.size()) {
            zi ziVar4 = (zi) arrayList2.get(i17);
            if (ziVar4 == null) {
                rzVar = d11;
                i11 = i17;
                hVar2 = hVar;
            } else {
                int i18 = ziVar4.D;
                if (i18 == 23 || i18 == 24) {
                    rzVar = d11;
                    i11 = i17;
                    hVar2 = hVar;
                    TLRPC.MessageMedia messageMedia2 = ziVar4.k.media;
                    if (messageMedia2.storyItem == null) {
                        long o10 = m5.o(messageMedia2.peer);
                        hVar = hVar2 == null ? new a0.h() : hVar2;
                        ArrayList arrayList5 = (ArrayList) hVar.f(o10);
                        if (arrayList5 == null) {
                            arrayList5 = k5.j(hVar, o10);
                        }
                        StringBuilder t10 = a1.g.t(o10, "+story did=", " at ");
                        t10.append(ziVar4.D == 23 ? "forwarded" : "mentioned");
                        t10.append(" #");
                        t10.append(ziVar4.f1());
                        sz.c(szVar, t10.toString());
                        arrayList5.add(ziVar4);
                        if (ziVar4.D == 0 && (message = ziVar4.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                            i12 = 0;
                            while (i12 < ziVar4.k.media.webpage.attributes.size()) {
                                TLRPC.WebPageAttribute webPageAttribute = ziVar4.k.media.webpage.attributes.get(i12);
                                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                                    TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                                    if (tL_webPageAttributeStory.storyItem == null) {
                                        long o11 = m5.o(tL_webPageAttributeStory.peer);
                                        if (hVar == null) {
                                            hVar = new a0.h();
                                        }
                                        ArrayList arrayList6 = (ArrayList) hVar.f(o11);
                                        if (arrayList6 == null) {
                                            arrayList6 = k5.j(hVar, o11);
                                        }
                                        StringBuilder t11 = a1.g.t(o11, "+story did=", " at webpage of #");
                                        t11.append(ziVar4.f1());
                                        sz.c(szVar, t11.toString());
                                        arrayList6.add(ziVar4);
                                    } else {
                                        ziVar = ziVar4;
                                        tL_webPageAttributeStory.storyItem = ei.m7.c(this.currentAccount, m5.o(tL_webPageAttributeStory.peer), tL_webPageAttributeStory.storyItem);
                                        i12++;
                                        ziVar4 = ziVar;
                                    }
                                }
                                ziVar = ziVar4;
                                i12++;
                                ziVar4 = ziVar;
                            }
                        }
                    } else {
                        long o12 = m5.o(messageMedia2.peer);
                        TLRPC.MessageMedia messageMedia3 = ziVar4.k.media;
                        messageMedia3.storyItem = ei.m7.c(this.currentAccount, o12, messageMedia3.storyItem);
                        hVar = hVar2;
                        if (ziVar4.D == 0) {
                            i12 = 0;
                            while (i12 < ziVar4.k.media.webpage.attributes.size()) {
                            }
                        }
                    }
                } else {
                    if (ziVar4.M1() <= 0 || !ziVar4.g4()) {
                        rzVar = d11;
                        if (ziVar4.M1() > 0 && ziVar4.f4()) {
                            TLRPC.Message message2 = ziVar4.k;
                            TLRPC.MessageReplyHeader messageReplyHeader2 = message2.reply_to;
                            int i19 = messageReplyHeader2.reply_to_msg_id;
                            hVar2 = hVar;
                            if (i19 != j11) {
                                TLRPC.Peer peer = messageReplyHeader2.reply_to_peer_id;
                                if (peer != null) {
                                    j12 = 0;
                                    j13 = peer.channel_id;
                                } else {
                                    j12 = 0;
                                    j13 = message2.peer_id.channel_id;
                                }
                            }
                            i11 = i17;
                        }
                    } else {
                        TLRPC.Message message3 = ziVar4.k;
                        if (message3.replyStory == null) {
                            long o13 = m5.o(message3.reply_to.peer);
                            if (hVar == null) {
                                hVar = new a0.h();
                            }
                            ArrayList arrayList7 = (ArrayList) hVar.f(o13);
                            if (arrayList7 == null) {
                                arrayList7 = k5.j(hVar, o13);
                            }
                            StringBuilder t12 = a1.g.t(o13, "+story did=", " at replied #");
                            t12.append(ziVar4.f1());
                            sz.c(szVar, t12.toString());
                            arrayList7.add(ziVar4);
                            rzVar = d11;
                            i11 = i17;
                            if (ziVar4.D == 0) {
                            }
                        } else {
                            long o14 = m5.o(message3.reply_to.peer);
                            TLRPC.Message message4 = ziVar4.k;
                            rzVar = d11;
                            message4.replyStory = ei.m7.c(this.currentAccount, o14, message4.replyStory);
                        }
                    }
                    i11 = i17;
                    hVar2 = hVar;
                    hVar = hVar2;
                    if (ziVar4.D == 0) {
                    }
                }
                i17 = i11 + 1;
                arrayList2 = arrayList;
                d11 = rzVar;
            }
            hVar = hVar2;
            i17 = i11 + 1;
            arrayList2 = arrayList;
            d11 = rzVar;
        }
        a0.h hVar6 = hVar;
        sz.a(d11);
        if (hVar4.i() && hVar6 == null) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            getMessagesStorage().a.c(new xh(this, sz.d(szVar, "loadReplyMessagesForMessages: storageQueue.postRunnable"), hVar6, new AtomicInteger(2), runnable, i10, szVar, hVar4, hVar5, z10, j10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X1(String str, final long j10, final long j11, final int i3, final int i10, final long j12, boolean z10, final TLRPC.User user, final TLRPC.Chat chat, final boolean z11, final dh.n0 n0Var) {
        long j13;
        String str2;
        long j14;
        int i11;
        int i12;
        boolean z12;
        long j15;
        TLRPC.User user2;
        TLRPC.Chat chat2;
        dh.n0 n0Var2;
        SparseArray[] sparseArrayArr;
        int i13;
        boolean z13;
        final String str3;
        final int i14;
        TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags;
        final int i15;
        int f12;
        long j16;
        boolean z14 = !z10;
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
            j13 = 0;
            if (!z10) {
                zArr[1] = false;
                zArr[0] = false;
                iArr[1] = 0;
                iArr[0] = 0;
                arrayList.clear();
                this.b1.clear();
                sparseArrayArr2[0].clear();
                sparseArrayArr2[1].clear();
                getNotificationCenter().k(hs.J0, Integer.valueOf(i3));
            }
            str2 = str;
            j14 = j10;
            i11 = 0;
        } else {
            if (arrayList.isEmpty()) {
                this.g1 = false;
                return;
            }
            j13 = 0;
            int i16 = hs.H0;
            if (i10 != 1) {
                if (i10 != 2) {
                    this.g1 = false;
                    return;
                }
                int i17 = this.f1 - 1;
                this.f1 = i17;
                if (i17 < 0) {
                    this.f1 = 0;
                    return;
                }
                if (i17 >= arrayList.size()) {
                    this.f1 = arrayList.size() - 1;
                }
                zi ziVar = (zi) arrayList.get(this.f1);
                getNotificationCenter().k(i16, Integer.valueOf(i3), Integer.valueOf(ziVar.f1()), Integer.valueOf(c0()), Long.valueOf(zi.B0(ziVar.k)), Integer.valueOf(this.f1), Integer.valueOf(j0()), Boolean.valueOf(z11));
                this.g1 = false;
                return;
            }
            int i18 = this.f1 + 1;
            this.f1 = i18;
            if (i18 < arrayList.size()) {
                zi ziVar2 = (zi) arrayList.get(this.f1);
                getNotificationCenter().k(i16, Integer.valueOf(i3), Integer.valueOf(ziVar2.f1()), Integer.valueOf(c0()), Long.valueOf(zi.B0(ziVar2.k)), Integer.valueOf(this.f1), Integer.valueOf(j0()), Boolean.valueOf(z11));
                this.g1 = false;
                return;
            }
            if (zArr[0] && j11 == 0 && zArr[1]) {
                this.f1--;
                this.g1 = false;
                return;
            }
            String str4 = this.e1;
            zi ziVar3 = (zi) k2.p1.h(1, arrayList);
            if (zi.B0(ziVar3.k) != j10 || zArr[0]) {
                f12 = zi.B0(ziVar3.k) == j11 ? ziVar3.f1() : 0;
                zArr[1] = false;
                j16 = j11;
            } else {
                f12 = ziVar3.f1();
                j16 = j10;
            }
            j14 = j16;
            i11 = f12;
            str2 = str4;
            z14 = false;
        }
        if (str2 != null) {
            i12 = 1;
            if (str2.trim().startsWith("#") || str2.trim().startsWith("$")) {
                z12 = true;
                if (zArr[0] && !zArr[i12] && j11 != j13) {
                    j14 = j11;
                }
                if (j14 == j10 || !z14) {
                    j15 = j10;
                    user2 = user;
                    chat2 = chat;
                    n0Var2 = n0Var;
                    sparseArrayArr = sparseArrayArr2;
                } else {
                    if (j11 != j13) {
                        TLRPC.InputPeer j17 = getMessagesController().j1(j11);
                        final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.peer = j17;
                        this.O0 = j11;
                        int i19 = i12;
                        tL_messages_search.limit = i19;
                        tL_messages_search.q = str2;
                        if (user != null) {
                            tL_messages_search.from_id = hp.n1(user);
                            tL_messages_search.flags = i19 | tL_messages_search.flags;
                        } else if (chat != null) {
                            tL_messages_search.from_id = hp.l1(chat);
                            tL_messages_search.flags = i19 | tL_messages_search.flags;
                        }
                        if (j12 != j13) {
                            if (j10 == getUserConfig().e() || getMessagesController().y2(j14)) {
                                tL_messages_search.saved_peer_id = getMessagesController().j1(j12);
                                tL_messages_search.flags |= 4;
                            } else {
                                tL_messages_search.top_msg_id = (int) j12;
                                tL_messages_search.flags |= 2;
                            }
                        }
                        if (n0Var != null) {
                            tL_messages_search.saved_reaction.add(n0Var.g());
                            tL_messages_search.flags |= 8;
                        }
                        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                        this.N0 = getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.messenger.qh
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                final li liVar = li.this;
                                final long j18 = j11;
                                final TLRPC.TL_messages_search tL_messages_search2 = tL_messages_search;
                                final long j19 = j10;
                                final int i20 = i3;
                                final int i21 = i10;
                                final long j20 = j12;
                                final TLRPC.User user3 = user;
                                final TLRPC.Chat chat3 = chat;
                                final boolean z15 = z11;
                                final dh.n0 n0Var3 = n0Var;
                                g0.h3(new Runnable() { // from class: org.telegram.messenger.ag
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        li liVar2 = li.this;
                                        int[] iArr2 = liVar2.X0;
                                        boolean[] zArr2 = liVar2.Y0;
                                        long j21 = liVar2.O0;
                                        long j22 = j18;
                                        if (j21 == j22) {
                                            liVar2.N0 = 0;
                                            TLObject tLObject2 = tLObject;
                                            TLRPC.TL_messages_search tL_messages_search3 = tL_messages_search2;
                                            long j23 = j19;
                                            int i22 = i20;
                                            int i23 = i21;
                                            long j24 = j20;
                                            TLRPC.User user4 = user3;
                                            TLRPC.Chat chat4 = chat3;
                                            boolean z16 = z15;
                                            dh.n0 n0Var4 = n0Var3;
                                            if (tLObject2 == null) {
                                                zArr2[1] = true;
                                                iArr2[1] = 0;
                                                liVar2.X1(tL_messages_search3.q, j23, j22, i22, i23, j24, true, user4, chat4, z16, n0Var4);
                                            } else {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                zArr2[1] = messages_messages.messages.isEmpty();
                                                iArr2[1] = messages_messages instanceof TLRPC.TL_messages_messagesSlice ? messages_messages.count : messages_messages.messages.size();
                                                liVar2.X1(tL_messages_search3.q, j23, j22, i22, i23, j24, true, user4, chat4, z16, n0Var4);
                                            }
                                        }
                                    }
                                });
                            }
                        }, 2);
                        return;
                    }
                    j15 = j10;
                    user2 = user;
                    chat2 = chat;
                    n0Var2 = n0Var;
                    sparseArrayArr = sparseArrayArr2;
                    this.O0 = j13;
                    zArr[1] = true;
                    iArr[1] = 0;
                }
                final TLRPC.TL_messages_search tL_messages_search2 = new TLRPC.TL_messages_search();
                tL_messages_search2.peer = getMessagesController().j1(j14);
                this.T0 = i3;
                this.Q0 = j15;
                this.U0 = user2;
                this.V0 = chat2;
                this.P0 = j12;
                this.R0 = n0Var2;
                tL_messages_search2.limit = 21;
                tL_messages_search2.q = str2 == null ? str2 : "";
                tL_messages_search2.offset_id = i11;
                if (user2 == null) {
                    tL_messages_search2.from_id = hp.n1(user2);
                    tL_messages_search2.flags |= 1;
                } else if (chat2 != null) {
                    tL_messages_search2.from_id = hp.l1(chat2);
                    tL_messages_search2.flags |= 1;
                }
                this.h1 = false;
                this.i1 = false;
                i13 = this.S0 + 1;
                this.S0 = i13;
                z13 = j15 != getUserConfig().e();
                if (z13 || n0Var2 == null || !z14) {
                    str3 = str2;
                    i14 = i13;
                } else {
                    this.f1 = 0;
                    this.a1.clear();
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    hp messagesController = getMessagesController();
                    long j18 = this.P0;
                    a0.h hVar = messagesController.a8;
                    if (hVar != null && (tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) hVar.f(j18)) != null) {
                        for (int i20 = 0; i20 < tL_messages_savedReactionsTags.tags.size(); i20++) {
                            if (n0Var2.f(tL_messages_savedReactionsTags.tags.get(i20).reaction)) {
                                i15 = tL_messages_savedReactionsTags.tags.get(i20).count;
                                break;
                            }
                        }
                    }
                    i15 = 0;
                    this.W0 = TextUtils.isEmpty(tL_messages_search2.q) ? i15 : 0;
                    this.h1 = true;
                    this.i1 = false;
                    qr messagesStorage = getMessagesStorage();
                    TLRPC.Reaction g7 = n0Var.g();
                    long j19 = this.P0;
                    ArrayList arrayList2 = this.b1;
                    int size = arrayList2 != null ? arrayList2.size() : 0;
                    i14 = i13;
                    r10 r10Var = new r10() { // from class: org.telegram.messenger.rh
                        @Override // org.telegram.messenger.r10
                        public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            ArrayList arrayList4 = (ArrayList) obj2;
                            ArrayList arrayList5 = (ArrayList) obj3;
                            ArrayList arrayList6 = (ArrayList) obj4;
                            li liVar = li.this;
                            if (i14 == liVar.S0) {
                                liVar.i1 = arrayList3.size() == i15;
                                liVar.h1 = false;
                                liVar.getMessagesController().Y3(arrayList4, true);
                                liVar.getMessagesController().S3(arrayList5, true);
                                org.telegram.ui.Components.g5.g(liVar.currentAccount).d(arrayList6);
                                liVar.b1 = arrayList3;
                                liVar.k2();
                                liVar.getNotificationCenter().k(hs.H0, Integer.valueOf(i3), 0, Integer.valueOf(liVar.c0()), Long.valueOf(j10), Integer.valueOf(liVar.f1), Integer.valueOf(liVar.j0()), Boolean.TRUE);
                            }
                        }
                    };
                    p5 p5Var = messagesStorage.a;
                    String str5 = str2;
                    gr grVar = new gr(messagesStorage, str5, j19, g7, hs.X4, size, true, r10Var);
                    str3 = str5;
                    p5Var.c(grVar);
                }
                if (this.P0 != 0) {
                    if (j14 == getUserConfig().e() || getMessagesController().y2(j14)) {
                        tL_messages_search2.saved_peer_id = getMessagesController().j1(this.P0);
                        tL_messages_search2.flags |= 4;
                    } else {
                        tL_messages_search2.top_msg_id = (int) this.P0;
                        tL_messages_search2.flags |= 2;
                    }
                }
                if (n0Var != null) {
                    tL_messages_search2.saved_reaction.add(n0Var.g());
                    tL_messages_search2.flags |= 8;
                }
                tL_messages_search2.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                this.e1 = str3;
                final int i21 = i14;
                final TLRPC.User user3 = user2;
                final boolean z15 = z13;
                final boolean z16 = z12;
                final long j20 = j14;
                this.M0 = getConnectionsManager().sendRequest(tL_messages_search2, new RequestDelegate() { // from class: org.telegram.messenger.sh
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                        final ArrayList arrayList3 = new ArrayList();
                        final li liVar = li.this;
                        final TLRPC.TL_messages_search tL_messages_search3 = tL_messages_search2;
                        boolean z17 = z15;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            int min = Math.min(messages_messages.messages.size(), tL_messages_search3.limit - 1);
                            int i22 = 0;
                            while (i22 < min) {
                                boolean z18 = z17;
                                zi ziVar4 = new zi(liVar.currentAccount, messages_messages.messages.get(i22), null, null, null, null, null, true, true, 0L, false, false, z18, 0);
                                if (ziVar4.A2()) {
                                    ziVar4.Q2 = true;
                                }
                                ziVar4.L5(str3, !z16);
                                arrayList3.add(ziVar4);
                                i22++;
                                z17 = z18;
                            }
                        }
                        final boolean z19 = z17;
                        final int i23 = i21;
                        final boolean z20 = z11;
                        final long j21 = j20;
                        final long j22 = j10;
                        final int i24 = i3;
                        final long j23 = j11;
                        final long j24 = j12;
                        final TLRPC.User user4 = user3;
                        final TLRPC.Chat chat3 = chat;
                        g0.h3(new Runnable() { // from class: org.telegram.messenger.bg
                            @Override // java.lang.Runnable
                            public final void run() {
                                final li liVar2 = li.this;
                                if (i23 == liVar2.S0) {
                                    liVar2.M0 = 0;
                                    final boolean z21 = z20;
                                    if (!z21) {
                                        liVar2.g1 = false;
                                    }
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 != null) {
                                        final TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                        int i25 = 0;
                                        while (i25 < messages_messages2.messages.size()) {
                                            TLRPC.Message message = messages_messages2.messages.get(i25);
                                            if ((message instanceof TLRPC.TL_messageEmpty) || (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                                messages_messages2.messages.remove(i25);
                                                i25--;
                                            }
                                            i25++;
                                        }
                                        liVar2.getMessagesStorage().m1(messages_messages2.users, messages_messages2.chats, true, true);
                                        liVar2.getMessagesController().Y3(messages_messages2.users, false);
                                        liVar2.getMessagesController().S3(messages_messages2.chats, false);
                                        final TLRPC.TL_messages_search tL_messages_search4 = tL_messages_search3;
                                        final long j25 = j21;
                                        final long j26 = j22;
                                        final int i26 = i24;
                                        final ArrayList arrayList4 = arrayList3;
                                        final boolean z22 = z19;
                                        final long j27 = j23;
                                        final long j28 = j24;
                                        final TLRPC.User user5 = user4;
                                        final TLRPC.Chat chat4 = chat3;
                                        Runnable runnable = new Runnable() { // from class: org.telegram.messenger.og
                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r17v0 */
                                            /* JADX WARN: Type inference failed for: r17v1 */
                                            /* JADX WARN: Type inference failed for: r17v3 */
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                boolean[] zArr2;
                                                ?? r17;
                                                li liVar3 = li.this;
                                                boolean[] zArr3 = liVar3.Y0;
                                                int[] iArr2 = liVar3.X0;
                                                ArrayList arrayList5 = liVar3.Z0;
                                                SparseArray[] sparseArrayArr3 = liVar3.c1;
                                                ArrayList arrayList6 = liVar3.a1;
                                                TLRPC.TL_messages_search tL_messages_search5 = tL_messages_search4;
                                                int i27 = tL_messages_search5.offset_id;
                                                long j29 = j25;
                                                long j30 = j26;
                                                int i28 = i26;
                                                if (i27 == 0 && j29 == j30) {
                                                    liVar3.f1 = 0;
                                                    arrayList6.clear();
                                                    sparseArrayArr3[0].clear();
                                                    sparseArrayArr3[1].clear();
                                                    iArr2[0] = 0;
                                                    zArr2 = zArr3;
                                                    r17 = 1;
                                                    liVar3.getNotificationCenter().k(hs.J0, Integer.valueOf(i28));
                                                } else {
                                                    zArr2 = zArr3;
                                                    r17 = 1;
                                                }
                                                TLRPC.messages_Messages messages_messages3 = messages_messages2;
                                                int min2 = Math.min(messages_messages3.messages.size(), tL_messages_search5.limit - 1);
                                                int i29 = 0;
                                                boolean z23 = false;
                                                while (i29 < min2) {
                                                    int[] iArr3 = iArr2;
                                                    zi ziVar5 = (zi) arrayList4.get(i29);
                                                    arrayList6.add(ziVar5);
                                                    SparseArray[] sparseArrayArr4 = sparseArrayArr3;
                                                    sparseArrayArr4[j29 == j30 ? (char) 0 : r17].put(ziVar5.f1(), ziVar5);
                                                    i29++;
                                                    z23 = r17;
                                                    iArr2 = iArr3;
                                                    sparseArrayArr3 = sparseArrayArr4;
                                                    arrayList6 = arrayList6;
                                                }
                                                int[] iArr4 = iArr2;
                                                ArrayList arrayList7 = arrayList6;
                                                liVar3.k2();
                                                zArr2[j29 == j30 ? (char) 0 : r17] = messages_messages3.messages.size() < tL_messages_search5.limit ? r17 : false;
                                                iArr4[j29 == j30 ? (char) 0 : r17] = ((messages_messages3 instanceof TLRPC.TL_messages_messagesSlice) || (messages_messages3 instanceof TLRPC.TL_messages_channelMessages)) ? messages_messages3.count : messages_messages3.messages.size();
                                                boolean isEmpty = arrayList7.isEmpty();
                                                int i30 = hs.H0;
                                                boolean z24 = z21;
                                                if (isEmpty) {
                                                    hs notificationCenter = liVar3.getNotificationCenter();
                                                    Integer valueOf = Integer.valueOf(i28);
                                                    Integer valueOf2 = Integer.valueOf(liVar3.c0());
                                                    Boolean valueOf3 = Boolean.valueOf(z24);
                                                    Object[] objArr = new Object[7];
                                                    objArr[0] = valueOf;
                                                    objArr[r17] = 0;
                                                    objArr[2] = valueOf2;
                                                    objArr[3] = 0L;
                                                    objArr[4] = 0;
                                                    objArr[5] = 0;
                                                    objArr[6] = valueOf3;
                                                    notificationCenter.k(i30, objArr);
                                                } else if (z23) {
                                                    if (liVar3.f1 >= arrayList5.size()) {
                                                        liVar3.f1 = arrayList5.size() - 1;
                                                    }
                                                    zi ziVar6 = (zi) arrayList5.get(liVar3.f1);
                                                    hs notificationCenter2 = liVar3.getNotificationCenter();
                                                    Integer valueOf4 = Integer.valueOf(i28);
                                                    Integer valueOf5 = Integer.valueOf(ziVar6.f1());
                                                    Integer valueOf6 = Integer.valueOf(liVar3.c0());
                                                    Long valueOf7 = Long.valueOf(zi.B0(ziVar6.k));
                                                    Integer valueOf8 = Integer.valueOf(liVar3.f1);
                                                    Integer valueOf9 = Integer.valueOf(liVar3.j0());
                                                    Boolean valueOf10 = Boolean.valueOf(z24);
                                                    Object[] objArr2 = new Object[7];
                                                    objArr2[0] = valueOf4;
                                                    objArr2[r17] = valueOf5;
                                                    objArr2[2] = valueOf6;
                                                    objArr2[3] = valueOf7;
                                                    objArr2[4] = valueOf8;
                                                    objArr2[5] = valueOf9;
                                                    objArr2[6] = valueOf10;
                                                    notificationCenter2.k(i30, objArr2);
                                                } else if (z22) {
                                                    hs notificationCenter3 = liVar3.getNotificationCenter();
                                                    Integer valueOf11 = Integer.valueOf(i28);
                                                    Integer valueOf12 = Integer.valueOf(liVar3.c0());
                                                    Long valueOf13 = Long.valueOf(j30);
                                                    Integer valueOf14 = Integer.valueOf(liVar3.f1);
                                                    Integer valueOf15 = Integer.valueOf(liVar3.j0());
                                                    Object[] objArr3 = new Object[7];
                                                    objArr3[0] = valueOf11;
                                                    objArr3[r17] = 0;
                                                    objArr3[2] = valueOf12;
                                                    objArr3[3] = valueOf13;
                                                    objArr3[4] = valueOf14;
                                                    objArr3[5] = valueOf15;
                                                    objArr3[6] = Boolean.FALSE;
                                                    notificationCenter3.k(i30, objArr3);
                                                }
                                                if (j29 == j30 && zArr2[0]) {
                                                    long j31 = j27;
                                                    if (j31 == 0 || zArr2[r17]) {
                                                        return;
                                                    }
                                                    liVar3.X1(liVar3.e1, j30, j31, i28, 0, j28, true, user5, chat4, z24, liVar3.R0);
                                                }
                                            }
                                        };
                                        if (z22) {
                                            liVar2.X0(arrayList4, j26, 0, liVar2.P0, runnable, i26, null);
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
            i12 = 1;
        }
        z12 = false;
        if (zArr[0]) {
            j14 = j11;
        }
        if (j14 == j10) {
        }
        j15 = j10;
        user2 = user;
        chat2 = chat;
        n0Var2 = n0Var;
        sparseArrayArr = sparseArrayArr2;
        final TLRPC.TL_messages_search tL_messages_search22 = new TLRPC.TL_messages_search();
        tL_messages_search22.peer = getMessagesController().j1(j14);
        this.T0 = i3;
        this.Q0 = j15;
        this.U0 = user2;
        this.V0 = chat2;
        this.P0 = j12;
        this.R0 = n0Var2;
        tL_messages_search22.limit = 21;
        tL_messages_search22.q = str2 == null ? str2 : "";
        tL_messages_search22.offset_id = i11;
        if (user2 == null) {
        }
        this.h1 = false;
        this.i1 = false;
        i13 = this.S0 + 1;
        this.S0 = i13;
        if (j15 != getUserConfig().e()) {
        }
        if (z13) {
        }
        str3 = str2;
        i14 = i13;
        if (this.P0 != 0) {
        }
        if (n0Var != null) {
        }
        tL_messages_search22.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        this.e1 = str3;
        final int i212 = i14;
        final TLRPC.User user32 = user2;
        final boolean z152 = z13;
        final boolean z162 = z12;
        final long j202 = j14;
        this.M0 = getConnectionsManager().sendRequest(tL_messages_search22, new RequestDelegate() { // from class: org.telegram.messenger.sh
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final ArrayList arrayList3 = new ArrayList();
                final li liVar = li.this;
                final TLRPC.TL_messages_search tL_messages_search3 = tL_messages_search22;
                boolean z17 = z152;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int min = Math.min(messages_messages.messages.size(), tL_messages_search3.limit - 1);
                    int i22 = 0;
                    while (i22 < min) {
                        boolean z18 = z17;
                        zi ziVar4 = new zi(liVar.currentAccount, messages_messages.messages.get(i22), null, null, null, null, null, true, true, 0L, false, false, z18, 0);
                        if (ziVar4.A2()) {
                            ziVar4.Q2 = true;
                        }
                        ziVar4.L5(str3, !z162);
                        arrayList3.add(ziVar4);
                        i22++;
                        z17 = z18;
                    }
                }
                final boolean z19 = z17;
                final int i23 = i212;
                final boolean z20 = z11;
                final long j21 = j202;
                final long j22 = j10;
                final int i24 = i3;
                final long j23 = j11;
                final long j24 = j12;
                final TLRPC.User user4 = user32;
                final TLRPC.Chat chat3 = chat;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.bg
                    @Override // java.lang.Runnable
                    public final void run() {
                        final li liVar2 = li.this;
                        if (i23 == liVar2.S0) {
                            liVar2.M0 = 0;
                            final boolean z21 = z20;
                            if (!z21) {
                                liVar2.g1 = false;
                            }
                            TLObject tLObject2 = tLObject;
                            if (tLObject2 != null) {
                                final TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                int i25 = 0;
                                while (i25 < messages_messages2.messages.size()) {
                                    TLRPC.Message message = messages_messages2.messages.get(i25);
                                    if ((message instanceof TLRPC.TL_messageEmpty) || (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                        messages_messages2.messages.remove(i25);
                                        i25--;
                                    }
                                    i25++;
                                }
                                liVar2.getMessagesStorage().m1(messages_messages2.users, messages_messages2.chats, true, true);
                                liVar2.getMessagesController().Y3(messages_messages2.users, false);
                                liVar2.getMessagesController().S3(messages_messages2.chats, false);
                                final TLRPC.TL_messages_search tL_messages_search4 = tL_messages_search3;
                                final long j25 = j21;
                                final long j26 = j22;
                                final int i26 = i24;
                                final ArrayList arrayList4 = arrayList3;
                                final boolean z22 = z19;
                                final long j27 = j23;
                                final long j28 = j24;
                                final TLRPC.User user5 = user4;
                                final TLRPC.Chat chat4 = chat3;
                                Runnable runnable = new Runnable() { // from class: org.telegram.messenger.og
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r17v0 */
                                    /* JADX WARN: Type inference failed for: r17v1 */
                                    /* JADX WARN: Type inference failed for: r17v3 */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean[] zArr2;
                                        ?? r17;
                                        li liVar3 = li.this;
                                        boolean[] zArr3 = liVar3.Y0;
                                        int[] iArr2 = liVar3.X0;
                                        ArrayList arrayList5 = liVar3.Z0;
                                        SparseArray[] sparseArrayArr3 = liVar3.c1;
                                        ArrayList arrayList6 = liVar3.a1;
                                        TLRPC.TL_messages_search tL_messages_search5 = tL_messages_search4;
                                        int i27 = tL_messages_search5.offset_id;
                                        long j29 = j25;
                                        long j30 = j26;
                                        int i28 = i26;
                                        if (i27 == 0 && j29 == j30) {
                                            liVar3.f1 = 0;
                                            arrayList6.clear();
                                            sparseArrayArr3[0].clear();
                                            sparseArrayArr3[1].clear();
                                            iArr2[0] = 0;
                                            zArr2 = zArr3;
                                            r17 = 1;
                                            liVar3.getNotificationCenter().k(hs.J0, Integer.valueOf(i28));
                                        } else {
                                            zArr2 = zArr3;
                                            r17 = 1;
                                        }
                                        TLRPC.messages_Messages messages_messages3 = messages_messages2;
                                        int min2 = Math.min(messages_messages3.messages.size(), tL_messages_search5.limit - 1);
                                        int i29 = 0;
                                        boolean z23 = false;
                                        while (i29 < min2) {
                                            int[] iArr3 = iArr2;
                                            zi ziVar5 = (zi) arrayList4.get(i29);
                                            arrayList6.add(ziVar5);
                                            SparseArray[] sparseArrayArr4 = sparseArrayArr3;
                                            sparseArrayArr4[j29 == j30 ? (char) 0 : r17].put(ziVar5.f1(), ziVar5);
                                            i29++;
                                            z23 = r17;
                                            iArr2 = iArr3;
                                            sparseArrayArr3 = sparseArrayArr4;
                                            arrayList6 = arrayList6;
                                        }
                                        int[] iArr4 = iArr2;
                                        ArrayList arrayList7 = arrayList6;
                                        liVar3.k2();
                                        zArr2[j29 == j30 ? (char) 0 : r17] = messages_messages3.messages.size() < tL_messages_search5.limit ? r17 : false;
                                        iArr4[j29 == j30 ? (char) 0 : r17] = ((messages_messages3 instanceof TLRPC.TL_messages_messagesSlice) || (messages_messages3 instanceof TLRPC.TL_messages_channelMessages)) ? messages_messages3.count : messages_messages3.messages.size();
                                        boolean isEmpty = arrayList7.isEmpty();
                                        int i30 = hs.H0;
                                        boolean z24 = z21;
                                        if (isEmpty) {
                                            hs notificationCenter = liVar3.getNotificationCenter();
                                            Integer valueOf = Integer.valueOf(i28);
                                            Integer valueOf2 = Integer.valueOf(liVar3.c0());
                                            Boolean valueOf3 = Boolean.valueOf(z24);
                                            Object[] objArr = new Object[7];
                                            objArr[0] = valueOf;
                                            objArr[r17] = 0;
                                            objArr[2] = valueOf2;
                                            objArr[3] = 0L;
                                            objArr[4] = 0;
                                            objArr[5] = 0;
                                            objArr[6] = valueOf3;
                                            notificationCenter.k(i30, objArr);
                                        } else if (z23) {
                                            if (liVar3.f1 >= arrayList5.size()) {
                                                liVar3.f1 = arrayList5.size() - 1;
                                            }
                                            zi ziVar6 = (zi) arrayList5.get(liVar3.f1);
                                            hs notificationCenter2 = liVar3.getNotificationCenter();
                                            Integer valueOf4 = Integer.valueOf(i28);
                                            Integer valueOf5 = Integer.valueOf(ziVar6.f1());
                                            Integer valueOf6 = Integer.valueOf(liVar3.c0());
                                            Long valueOf7 = Long.valueOf(zi.B0(ziVar6.k));
                                            Integer valueOf8 = Integer.valueOf(liVar3.f1);
                                            Integer valueOf9 = Integer.valueOf(liVar3.j0());
                                            Boolean valueOf10 = Boolean.valueOf(z24);
                                            Object[] objArr2 = new Object[7];
                                            objArr2[0] = valueOf4;
                                            objArr2[r17] = valueOf5;
                                            objArr2[2] = valueOf6;
                                            objArr2[3] = valueOf7;
                                            objArr2[4] = valueOf8;
                                            objArr2[5] = valueOf9;
                                            objArr2[6] = valueOf10;
                                            notificationCenter2.k(i30, objArr2);
                                        } else if (z22) {
                                            hs notificationCenter3 = liVar3.getNotificationCenter();
                                            Integer valueOf11 = Integer.valueOf(i28);
                                            Integer valueOf12 = Integer.valueOf(liVar3.c0());
                                            Long valueOf13 = Long.valueOf(j30);
                                            Integer valueOf14 = Integer.valueOf(liVar3.f1);
                                            Integer valueOf15 = Integer.valueOf(liVar3.j0());
                                            Object[] objArr3 = new Object[7];
                                            objArr3[0] = valueOf11;
                                            objArr3[r17] = 0;
                                            objArr3[2] = valueOf12;
                                            objArr3[3] = valueOf13;
                                            objArr3[4] = valueOf14;
                                            objArr3[5] = valueOf15;
                                            objArr3[6] = Boolean.FALSE;
                                            notificationCenter3.k(i30, objArr3);
                                        }
                                        if (j29 == j30 && zArr2[0]) {
                                            long j31 = j27;
                                            if (j31 == 0 || zArr2[r17]) {
                                                return;
                                            }
                                            liVar3.X1(liVar3.e1, j30, j31, i28, 0, j28, true, user5, chat4, z24, liVar3.R0);
                                        }
                                    }
                                };
                                if (z22) {
                                    liVar2.X0(arrayList4, j26, 0, liVar2.P0, runnable, i26, null);
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

    public final TLRPC.TL_messages_stickerSet Y(TLRPC.StickerSet stickerSet) {
        TLRPC.StickerSet stickerSet2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.J.f(stickerSet.id);
        if (tL_messages_stickerSet == null) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.N.f(stickerSet.id);
            if (tL_messages_stickerSet != null && (stickerSet2 = tL_messages_stickerSet.set) != null) {
                if (stickerSet2.hash != stickerSet.hash) {
                    L0(stickerSet, false);
                }
                return tL_messages_stickerSet;
            }
            L0(stickerSet, true);
        }
        return tL_messages_stickerSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y0() {
        TLRPC.TL_emojiList tL_emojiList;
        Throwable th2;
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("restrictedstatuses_" + this.currentAccount, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        String string = sharedPreferences.getString("restrictedstatuses", null);
        long j10 = sharedPreferences.getLong("restrictedstatuses_last_check", 0L);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                tL_emojiList = (TLRPC.TL_emojiList) TLRPC.EmojiList.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                try {
                    this.N1 = tL_emojiList;
                } catch (Throwable th3) {
                    th2 = th3;
                    a8.g(th2, true);
                    tL_emojiList2 = tL_emojiList;
                    if (tL_emojiList2 != null) {
                    }
                    TL_account.getChannelRestrictedStatusEmojis getchannelrestrictedstatusemojis = new TL_account.getChannelRestrictedStatusEmojis();
                    if (tL_emojiList2 != null) {
                    }
                    getConnectionsManager().sendRequest(getchannelrestrictedstatusemojis, new wf(this, sharedPreferences, 1));
                }
            } catch (Throwable th4) {
                tL_emojiList = null;
                th2 = th4;
            }
            tL_emojiList2 = tL_emojiList;
        }
        if (tL_emojiList2 != null || System.currentTimeMillis() - j10 > 86400000) {
            TL_account.getChannelRestrictedStatusEmojis getchannelrestrictedstatusemojis2 = new TL_account.getChannelRestrictedStatusEmojis();
            if (tL_emojiList2 != null) {
                getchannelrestrictedstatusemojis2.hash = tL_emojiList2.hash;
            }
            getConnectionsManager().sendRequest(getchannelrestrictedstatusemojis2, new wf(this, sharedPreferences, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y1(boolean z10, String str, u10 u10Var) {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        if (z10) {
            TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
            tL_messages_searchEmojiStickerSets.q = str;
            tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
        } else {
            TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
            tL_messages_searchStickerSets2.q = str;
            tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_searchStickerSets, new c3.b(1), new l9(u10Var, 1));
    }

    public final void Z0(boolean z10) {
        if (this.I1) {
            return;
        }
        if (!this.J1 || z10) {
            SharedPreferences sharedPreferences = t0.b.getSharedPreferences("saved_reactions_" + this.currentAccount, 0);
            this.F1.clear();
            this.F1.addAll(T0(sharedPreferences));
            this.I1 = true;
            this.J1 = true;
            TLRPC.TL_messages_getDefaultTagReactions tL_messages_getDefaultTagReactions = new TLRPC.TL_messages_getDefaultTagReactions();
            tL_messages_getDefaultTagReactions.hash = sharedPreferences.getLong("hash", 0L);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDefaultTagReactions, new wf(this, sharedPreferences, 0));
        }
    }

    public final ji Z1(boolean z10, String str, String str2, u10 u10Var, boolean z11) {
        ji jiVar = new ji(str, str2, z10);
        ki kiVar = (ki) this.R1.get(jiVar);
        if (kiVar == null || (kiVar.b != null && z11)) {
            HashMap hashMap = this.Q1;
            if (!hashMap.containsKey(jiVar)) {
                hashMap.put(jiVar, 0);
                b0(this.currentAccount).U(new String[]{str}, str2, true, new eh(this, jiVar, kiVar, u10Var), false);
                return jiVar;
            }
        }
        if (kiVar != null) {
            u10Var.a(kiVar.a);
            return jiVar;
        }
        u10Var.a(new ArrayList());
        return jiVar;
    }

    public final void a1(int i3, boolean z10, boolean z11) {
        b1(i3, z10, z11, false, null);
    }

    public final void a2(String str) {
        hp.s1(this.currentAccount).f7.edit().putString("reaction_on_double_tap", str).apply();
        this.s = str;
    }

    public final void b(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        long j10 = tL_messages_stickerSet.set.id;
        a0.h hVar = this.J;
        if (hVar.h(j10) < 0) {
            String str = tL_messages_stickerSet.set.short_name;
            ConcurrentHashMap concurrentHashMap = this.O;
            if (concurrentHashMap.containsKey(str)) {
                return;
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            int i3 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
            ArrayList[] arrayListArr = this.H;
            arrayListArr[i3].add(0, tL_messages_stickerSet);
            hVar.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
            this.K.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
            concurrentHashMap.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
            a0.h hVar2 = new a0.h();
            for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
                hVar2.k(document, document.id);
            }
            for (int i11 = 0; i11 < tL_messages_stickerSet.packs.size(); i11++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i11);
                String replace = tL_stickerPack.emoticon.replace("️", "");
                tL_stickerPack.emoticon = replace;
                ArrayList arrayList = (ArrayList) this.e0.get(replace);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.e0.put(tL_stickerPack.emoticon, arrayList);
                }
                for (int i12 = 0; i12 < tL_stickerPack.documents.size(); i12++) {
                    Long l10 = tL_stickerPack.documents.get(i12);
                    if (this.d0.h(l10.longValue()) < 0) {
                        this.d0.k(tL_stickerPack.emoticon, l10.longValue());
                    }
                    TLRPC.Document document2 = (TLRPC.Document) hVar2.f(l10.longValue());
                    if (document2 != null) {
                        arrayList.add(document2);
                    }
                }
            }
            this.Y[i3] = q(arrayListArr[i3]);
            getNotificationCenter().k(hs.x0, Integer.valueOf(i3), Boolean.TRUE);
            a1(i3, false, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b1(int i3, boolean z10, boolean z11, boolean z12, u10 u10Var) {
        long j10;
        TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers;
        boolean[] zArr = this.W;
        if (zArr[i3]) {
            if (z12) {
                this.V[i3] = new gb(this, i3, z11, u10Var);
                return;
            } else {
                if (u10Var != null) {
                    u10Var.a(null);
                    return;
                }
                return;
            }
        }
        ArrayList[] arrayListArr = this.t0;
        if (i3 == 3) {
            if (arrayListArr[0].isEmpty() || !getMessagesController().A3) {
                if (u10Var != null) {
                    u10Var.a(null);
                    return;
                }
                return;
            }
        } else if (i3 == 6) {
            if (arrayListArr[1].isEmpty() || !getMessagesController().A3) {
                if (u10Var != null) {
                    u10Var.a(null);
                    return;
                }
                return;
            }
        } else if (i3 != 4) {
            C0(i3, z10);
        }
        zArr[i3] = true;
        if (z10) {
            getMessagesStorage().a.c(new k7(this, i3, u10Var, 6));
            return;
        }
        if (i3 == 3 || i3 == 6) {
            char c10 = i3 != 6 ? (char) 0 : (char) 1;
            TLRPC.TL_messages_allStickers tL_messages_allStickers = new TLRPC.TL_messages_allStickers();
            tL_messages_allStickers.hash2 = this.q0[c10];
            int size = arrayListArr[c10].size();
            for (int i10 = 0; i10 < size; i10++) {
                tL_messages_allStickers.sets.add(((TLRPC.StickerSetCovered) arrayListArr[c10].get(i10)).set);
            }
            r1(i3, tL_messages_allStickers, new jf(u10Var, 3));
            return;
        }
        if (i3 == 4) {
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetAnimatedEmoji();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new rn(this, i3, u10Var, 3));
            return;
        }
        long[] jArr = this.Y;
        if (i3 == 0) {
            TLRPC.TL_messages_getAllStickers tL_messages_getAllStickers = new TLRPC.TL_messages_getAllStickers();
            j10 = z11 ? 0L : jArr[i3];
            tL_messages_getAllStickers.hash = j10;
            tL_messages_getMaskStickers = tL_messages_getAllStickers;
        } else if (i3 == 5) {
            TLRPC.TL_messages_getEmojiStickers tL_messages_getEmojiStickers = new TLRPC.TL_messages_getEmojiStickers();
            j10 = z11 ? 0L : jArr[i3];
            tL_messages_getEmojiStickers.hash = j10;
            tL_messages_getMaskStickers = tL_messages_getEmojiStickers;
        } else {
            TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers2 = new TLRPC.TL_messages_getMaskStickers();
            j10 = z11 ? 0L : jArr[i3];
            tL_messages_getMaskStickers2.hash = j10;
            tL_messages_getMaskStickers = tL_messages_getMaskStickers2;
        }
        getConnectionsManager().sendRequest(tL_messages_getMaskStickers, new h3(i3, 1, j10, this, u10Var));
    }

    public final void b2(long j10, long j11, float f10, float f11) {
        gi S = S(j10, j11);
        if (S != null) {
            if (Math.abs(S.h - f10) >= 0.001f || Math.abs(S.i - f11) >= 0.001f) {
                S.h = f10;
                S.i = f11;
                t0.b.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit().putString(Objects.hash(Long.valueOf(j10), Long.valueOf(j11)) + "", S.toString()).apply();
            }
        }
    }

    public final void c(TLRPC.Document document, int i3, boolean z10) {
        if (document == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.j0.size()) {
                this.j0.add(0, document);
                break;
            }
            TLRPC.Document document2 = (TLRPC.Document) this.j0.get(i10);
            if (document2.id == document.id) {
                this.j0.remove(i10);
                this.j0.add(0, document2);
                break;
            }
            i10++;
        }
        if ((this.j0.size() > getMessagesController().F4 && !h10.i(this.currentAccount).q()) || this.j0.size() > getMessagesController().G4) {
            getMessagesStorage().a.c(new ef(this, (TLRPC.Document) org.telegram.ui.Cells.f1.o(1, this.j0), 0));
            if (z10) {
                g0.h3(new a(document, 20));
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(document);
        y1(0, arrayList, true, i3, false);
    }

    public final int c0() {
        int i3 = 1;
        if (this.f1 >= this.Z0.size() - 1) {
            boolean[] zArr = this.Y0;
            if (zArr[0] && zArr[1]) {
                i3 = 0;
            }
        }
        return this.f1 > 0 ? i3 | 2 : i3;
    }

    public final void c1(String str, boolean z10, boolean z11) {
        HashSet hashSet = this.T;
        if (hashSet.contains(str)) {
            return;
        }
        if (!z10 || this.R.get(str) == null) {
            hashSet.add(str);
            if (z11) {
                getMessagesStorage().a.c(new cg(this, str, z10, 1));
                return;
            }
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            if (Objects.equals(getUserConfig().c0, str)) {
                tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
            } else if (z10) {
                TLRPC.TL_inputStickerSetDice tL_inputStickerSetDice = new TLRPC.TL_inputStickerSetDice();
                tL_inputStickerSetDice.emoticon = str;
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetDice;
            } else {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = str;
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
            }
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new n3(this, str, z10, 1));
        }
    }

    public final void c2(org.telegram.ui.Components.k9 k9Var, String str, String str2, String str3) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = str;
        b0(this.currentAccount).l0(tL_inputStickerSetShortName, 0, false, false, new d3(str2, k9Var, str3, 3));
    }

    public final void d(int i3, Object obj, TLRPC.Document document, int i10, boolean z10) {
        ArrayList[] arrayListArr;
        int i11;
        int i12 = 0;
        if (i3 != 3) {
            int i13 = 1;
            if (zi.v4(document) || zi.L2(document, true)) {
                int i14 = 0;
                while (true) {
                    arrayListArr = this.g0;
                    if (i14 < arrayListArr[i3].size()) {
                        TLRPC.Document document2 = (TLRPC.Document) arrayListArr[i3].get(i14);
                        if (document2.id == document.id) {
                            arrayListArr[i3].remove(i14);
                            if (!z10) {
                                arrayListArr[i3].add(0, document2);
                            }
                        } else {
                            i14++;
                        }
                    } else if (!z10) {
                        arrayListArr[i3].add(0, document);
                    }
                }
                int i15 = hs.P4;
                if (i3 == 2) {
                    if (z10) {
                        hs.e().k(i15, 0, document, 4);
                    } else {
                        hs.e().k(i15, 0, document, Integer.valueOf(arrayListArr[i3].size() > getMessagesController().f3 ? 6 : 5));
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
                    tL_messages_faveSticker.unfave = z10;
                    getConnectionsManager().sendRequest(tL_messages_faveSticker, new uh(this, obj, tL_messages_faveSticker, i12));
                    i11 = getMessagesController().f3;
                } else {
                    if (i3 == 0 && z10) {
                        hs.e().k(i15, 0, document, 3);
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
                        getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new uh(this, obj, tL_messages_saveRecentSticker, i13));
                    }
                    i11 = getMessagesController().e3;
                }
                if (arrayListArr[i3].size() > i11 || z10) {
                    getMessagesStorage().a.c(new k7(this, i3, z10 ? document : (TLRPC.Document) org.telegram.ui.Cells.f1.o(1, arrayListArr[i3]), 10));
                }
                if (!z10) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(document);
                    y1(i3, arrayList, false, i10, false);
                }
                if (i3 == 2 || (i3 == 0 && z10)) {
                    getNotificationCenter().k(hs.X0, Boolean.FALSE, Integer.valueOf(i3));
                }
            }
        }
    }

    public final void d0(final int i3, final int i10, final long j10, final long j11, boolean z10) {
        if (z10 || m5.C(j10)) {
            getMessagesStorage().a.c(new eg(this, j11, j10, i3, i10, 0));
            return;
        }
        TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
        if (i3 == 0) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
        } else if (i3 == 1) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterDocument());
        } else if (i3 == 2) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterRoundVoice());
        } else if (i3 == 3) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterUrl());
        } else if (i3 == 4) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterMusic());
        } else if (i3 == 5) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterGif());
        } else if (i3 == 8) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPoll());
        }
        if (j11 != 0) {
            if (j10 == getUserConfig().e()) {
                tL_messages_getSearchCounters.saved_peer_id = getMessagesController().j1(j11);
                tL_messages_getSearchCounters.flags = 4 | tL_messages_getSearchCounters.flags;
            } else {
                tL_messages_getSearchCounters.top_msg_id = (int) j11;
                tL_messages_getSearchCounters.flags |= 1;
            }
        }
        tL_messages_getSearchCounters.peer = getMessagesController().j1(j10);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new RequestDelegate() { // from class: org.telegram.messenger.th
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (vector.objects.isEmpty()) {
                        return;
                    }
                    g0.h3(new ei(li.this, j10, false, ((TLRPC.TL_messages_searchCounter) vector.objects.get(0)).count, i3, 0, j11, i10));
                }
            }
        }), i10);
    }

    public final void d1(boolean z10, boolean z11) {
        ArrayList[] arrayListArr = this.v0;
        if (arrayListArr[z10 ? 1 : 0].isEmpty()) {
            return;
        }
        arrayListArr[z10 ? 1 : 0].clear();
        ArrayList[] arrayListArr2 = this.t0;
        long o10 = o(arrayListArr2[z10 ? 1 : 0], z10);
        long[] jArr = this.q0;
        jArr[z10 ? 1 : 0] = o10;
        getNotificationCenter().k(z10 ? hs.A0 : hs.z0, new Object[0]);
        G1(z10, arrayListArr2[z10 ? 1 : 0], arrayListArr[z10 ? 1 : 0], this.r0[z10 ? 1 : 0], jArr[z10 ? 1 : 0], this.s0);
        if (z11) {
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_readFeaturedStickers(), new ei.u5(11));
        }
    }

    public final void e0(long j10, int i3, long j11) {
        getMessagesStorage().a.c(new eb(this, j11, j10, i3, 1));
    }

    public final void e1(long j10) {
        if (this.v0[0].contains(Long.valueOf(j10))) {
            ArrayList[] arrayListArr = this.w0;
            if (arrayListArr[0].contains(Long.valueOf(j10))) {
                return;
            }
            arrayListArr[0].add(Long.valueOf(j10));
            TLRPC.TL_messages_readFeaturedStickers tL_messages_readFeaturedStickers = new TLRPC.TL_messages_readFeaturedStickers();
            tL_messages_readFeaturedStickers.id.add(Long.valueOf(j10));
            getConnectionsManager().sendRequest(tL_messages_readFeaturedStickers, new ei.u5(11));
            g0.i3(new qg(this, j10, 3), 1000L);
        }
    }

    public final void e2(long j10, long j11, boolean z10) {
        gi S = S(j10, j11);
        if (S == null || S.g == z10) {
            return;
        }
        S.g = z10;
        t0.b.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit().putString(Objects.hash(Long.valueOf(j10), Long.valueOf(j11)) + "", S.toString()).apply();
    }

    public final void f1(long j10, boolean z10) {
        this.M.remove(Long.valueOf(j10));
        ArrayList arrayList = this.L;
        if (z10 && !arrayList.contains(Long.valueOf(j10))) {
            arrayList.add(Long.valueOf(j10));
        }
        if (z10) {
            return;
        }
        arrayList.remove(Long.valueOf(j10));
    }

    public final void f2(Context context, TLObject tLObject, int i3, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, boolean z11) {
        g2(context, tLObject, null, i3, d2Var, null, z10, z11, null, true);
    }

    public final Integer g0(boolean z10) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList;
        int i3;
        double d;
        int i10;
        double d10;
        e5.l lVar;
        e5.k kVar;
        e5.k kVar2;
        double d11;
        int i11;
        e5.l lVar2;
        e5.k kVar3;
        if ((z10 && (!r1.i().k() || r1.i().e == null)) || (tL_help_premiumPromo = this.E) == null) {
            return null;
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = tL_help_premiumPromo.period_options;
        int size = arrayList2.size();
        int i12 = 0;
        double d12 = 0.0d;
        boolean z11 = false;
        int i13 = 0;
        while (i13 < size) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i13);
            i13++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
            if (!z10) {
                kVar2 = null;
                if (tL_premiumSubscriptionOption2.months == 1) {
                    if (r2.b()) {
                    }
                    d11 = tL_premiumSubscriptionOption2.amount;
                    i11 = tL_premiumSubscriptionOption2.months;
                    d12 = d11 / i11;
                    z11 = true;
                }
            } else if (tL_premiumSubscriptionOption2.current) {
                kVar2 = null;
                if (Objects.equals(tL_premiumSubscriptionOption2.transaction.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1"), r1.i().e)) {
                    if (!r2.b() || (lVar2 = r1.l) == null) {
                        d11 = tL_premiumSubscriptionOption2.amount;
                        i11 = tL_premiumSubscriptionOption2.months;
                    } else {
                        ArrayList arrayList3 = lVar2.h;
                        int size2 = arrayList3.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size2) {
                                kVar3 = kVar2;
                                break;
                            }
                            Object obj = arrayList3.get(i14);
                            i14++;
                            kVar3 = (e5.k) obj;
                            String str = ((e5.i) kVar3.b.b.get(0)).d;
                            int i15 = tL_premiumSubscriptionOption2.months;
                            if (i15 != 12) {
                                Locale locale = Locale.ROOT;
                                if (str.equals("P" + i15 + "M")) {
                                    break;
                                }
                            } else if (str.equals("P1Y")) {
                                break;
                            }
                        }
                        if (kVar3 == null) {
                            d11 = tL_premiumSubscriptionOption2.amount;
                            i11 = tL_premiumSubscriptionOption2.months;
                        } else {
                            d11 = ((e5.i) kVar3.b.b.get(0)).b;
                            i11 = tL_premiumSubscriptionOption2.months;
                        }
                    }
                    d12 = d11 / i11;
                    z11 = true;
                }
            }
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList4 = this.E.period_options;
        int size3 = arrayList4.size();
        int i16 = 0;
        int i17 = 0;
        while (i17 < size3) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = arrayList4.get(i17);
            i17++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption4 = tL_premiumSubscriptionOption3;
            if (z11 && tL_premiumSubscriptionOption4.months == 12) {
                if (r2.b() || (lVar = r1.l) == null) {
                    arrayList = arrayList4;
                    i3 = i12;
                    d = tL_premiumSubscriptionOption4.amount;
                    i10 = tL_premiumSubscriptionOption4.months;
                } else {
                    ArrayList arrayList5 = lVar.h;
                    int size4 = arrayList5.size();
                    int i18 = i12;
                    while (true) {
                        if (i18 >= size4) {
                            arrayList = arrayList4;
                            kVar = null;
                            break;
                        }
                        Object obj2 = arrayList5.get(i18);
                        i18++;
                        kVar = (e5.k) obj2;
                        String str2 = ((e5.i) kVar.b.b.get(i12)).d;
                        int i19 = tL_premiumSubscriptionOption4.months;
                        arrayList = arrayList4;
                        if (i19 != 12) {
                            Locale locale2 = Locale.ROOT;
                            if (str2.equals("P" + i19 + "M")) {
                                break;
                            }
                            arrayList4 = arrayList;
                            i12 = 0;
                        } else {
                            if (str2.equals("P1Y")) {
                                break;
                            }
                            arrayList4 = arrayList;
                            i12 = 0;
                        }
                    }
                    if (kVar == null) {
                        d10 = tL_premiumSubscriptionOption4.amount / tL_premiumSubscriptionOption4.months;
                        i3 = 0;
                        i16 = (int) ((1.0d - (d10 / d12)) * 100.0d);
                    } else {
                        i3 = 0;
                        d = ((e5.i) kVar.b.b.get(0)).b;
                        i10 = tL_premiumSubscriptionOption4.months;
                    }
                }
                d10 = d / i10;
                i16 = (int) ((1.0d - (d10 / d12)) * 100.0d);
            } else {
                arrayList = arrayList4;
                i3 = i12;
            }
            i12 = i3;
            arrayList4 = arrayList;
        }
        if (!z11 || i16 <= 0) {
            return null;
        }
        return Integer.valueOf(i16);
    }

    public final void g1(long j10, boolean z10) {
        this.L.remove(Long.valueOf(j10));
        ArrayList arrayList = this.M;
        if (z10 && !arrayList.contains(Long.valueOf(j10))) {
            arrayList.add(Long.valueOf(j10));
        }
        if (z10) {
            return;
        }
        arrayList.remove(Long.valueOf(j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g2(final Context context, final TLObject tLObject, final TLRPC.Document document, final int i3, final org.telegram.ui.ActionBar.d2 d2Var, final FrameLayout frameLayout, final boolean z10, boolean z11, Runnable runnable, boolean z12) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        int i10;
        int i11;
        ArrayList[] arrayListArr;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3;
        int i12;
        boolean z13 = tLObject instanceof TLRPC.TL_messages_stickerSet;
        a0.h hVar = this.J;
        if (z13) {
            tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject;
            stickerSet = tL_messages_stickerSet2.set;
        } else {
            if (!(tLObject instanceof TLRPC.StickerSetCovered)) {
                throw new IllegalArgumentException("Invalid type of the given stickerSetObject: " + tLObject.getClass());
            }
            stickerSet = ((TLRPC.StickerSetCovered) tLObject).set;
            if (i3 == 2) {
                stickerSet2 = stickerSet;
                tL_messages_stickerSet = null;
                i10 = !stickerSet2.masks ? 1 : stickerSet2.emojis ? 5 : 0;
                stickerSet2.archived = i3 != 1;
                i11 = 0;
                while (true) {
                    arrayListArr = this.H;
                    if (i11 < arrayListArr[i10].size()) {
                        tL_messages_stickerSet3 = tL_messages_stickerSet;
                        i12 = 0;
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayListArr[i10].get(i11);
                    tL_messages_stickerSet3 = tL_messages_stickerSet;
                    if (tL_messages_stickerSet4.set.id == stickerSet2.id) {
                        arrayListArr[i10].remove(i11);
                        if (i3 == 2) {
                            tL_messages_stickerSet4.set.title = stickerSet2.title;
                            arrayListArr[i10].add(0, tL_messages_stickerSet4);
                        } else if (z12) {
                            hVar.l(tL_messages_stickerSet4.set.id);
                            this.K.l(tL_messages_stickerSet4.set.id);
                            this.O.remove(tL_messages_stickerSet4.set.short_name);
                        }
                        i12 = i11;
                    } else {
                        i11++;
                        tL_messages_stickerSet = tL_messages_stickerSet3;
                    }
                }
                long q10 = q(arrayListArr[i10]);
                this.Y[i10] = q10;
                int i13 = i10;
                J1(i13, this.Z[i10], q10, arrayListArr[i10]);
                final int i14 = i13;
                a0.h hVar2 = this.U;
                if (i3 != 2) {
                    Runnable runnable2 = (Runnable) hVar2.f(stickerSet2.id);
                    if (runnable2 != null) {
                        runnable2.run();
                    } else {
                        h2(context, i3, d2Var, frameLayout, z10, tLObject, stickerSet2, document, i14, z11);
                    }
                } else if (!z11 || d2Var == null) {
                    h2(context, i3, d2Var, frameLayout, z10, tLObject, stickerSet2, document, i14, false);
                } else {
                    bv0 bv0Var = new bv0(context, tLObject, 1, i3, document, d2Var.getResourceProvider());
                    final boolean[] zArr = new boolean[1];
                    g1(stickerSet2.id, true);
                    org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(context, null, false);
                    final TLRPC.StickerSet stickerSet3 = stickerSet2;
                    ybVar.b = new o4.w0(this, zArr, stickerSet3, i14, i12, tL_messages_stickerSet3, runnable);
                    Runnable runnable3 = new Runnable() { // from class: org.telegram.messenger.ai
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean[] zArr2 = zArr;
                            if (zArr2[0]) {
                                return;
                            }
                            zArr2[0] = true;
                            li.this.h2(context, i3, d2Var, frameLayout, z10, tLObject, stickerSet3, document, i14, false);
                        }
                    };
                    i14 = i14;
                    ybVar.c = runnable3;
                    bv0Var.setButton(ybVar);
                    hVar2.k(new a(ybVar, 21), stickerSet3.id);
                    if (frameLayout != null) {
                        org.telegram.ui.Components.ac.f(frameLayout, bv0Var, 2750).j();
                    } else {
                        org.telegram.ui.Components.ac.g(d2Var, bv0Var, 2750).j();
                    }
                }
                getNotificationCenter().k(hs.x0, Integer.valueOf(i14), Boolean.TRUE);
            }
            tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) hVar.f(stickerSet.id);
            if (tL_messages_stickerSet2 == null) {
                return;
            }
        }
        tL_messages_stickerSet = tL_messages_stickerSet2;
        stickerSet2 = stickerSet;
        if (!stickerSet2.masks) {
        }
        stickerSet2.archived = i3 != 1;
        i11 = 0;
        while (true) {
            arrayListArr = this.H;
            if (i11 < arrayListArr[i10].size()) {
            }
            i11++;
            tL_messages_stickerSet = tL_messages_stickerSet3;
        }
        long q102 = q(arrayListArr[i10]);
        this.Y[i10] = q102;
        int i132 = i10;
        J1(i132, this.Z[i10], q102, arrayListArr[i10]);
        final int i142 = i132;
        a0.h hVar22 = this.U;
        if (i3 != 2) {
        }
        getNotificationCenter().k(hs.x0, Integer.valueOf(i142), Boolean.TRUE);
    }

    public final TLRPC.TL_help_premiumPromo h0() {
        return this.E;
    }

    public final void h1(long j10, boolean z10, boolean z11) {
        int i3 = z10 ? 5 : z11 ? 1 : 0;
        ArrayList s02 = s0(i3);
        if (s02 != null) {
            for (int i10 = 0; i10 < s02.size(); i10++) {
                if (((TLRPC.TL_messages_stickerSet) s02.get(i10)).set.id == j10) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i10);
                    s02.remove(i10);
                    s02.add(0, tL_messages_stickerSet);
                    getNotificationCenter().k(hs.x0, Integer.valueOf(i3), Boolean.FALSE);
                    return;
                }
            }
        }
    }

    public final void h2(final Context context, int i3, final org.telegram.ui.ActionBar.d2 d2Var, final FrameLayout frameLayout, final boolean z10, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final int i10, final boolean z11) {
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        long j10 = stickerSet.id;
        tL_inputStickerSetID.id = j10;
        if (i3 == 0) {
            g1(j10, true);
            TLRPC.TL_messages_uninstallStickerSet tL_messages_uninstallStickerSet = new TLRPC.TL_messages_uninstallStickerSet();
            tL_messages_uninstallStickerSet.stickerset = tL_inputStickerSetID;
            getConnectionsManager().sendRequest(tL_messages_uninstallStickerSet, new rn(this, stickerSet, i10));
            return;
        }
        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
        tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
        tL_messages_installStickerSet.archived = i3 == 1;
        f1(stickerSet.id, true);
        getConnectionsManager().sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: org.telegram.messenger.tf
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                final li liVar = li.this;
                final TLRPC.StickerSet stickerSet2 = stickerSet;
                final org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                final boolean z12 = z10;
                final int i11 = i10;
                final boolean z13 = z11;
                final FrameLayout frameLayout2 = frameLayout;
                final Context context2 = context;
                final TLObject tLObject3 = tLObject;
                final TLRPC.Document document2 = document;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.mg
                    @Override // java.lang.Runnable
                    public final void run() {
                        li liVar2 = li.this;
                        a0.h hVar = liVar2.U;
                        TLRPC.StickerSet stickerSet3 = stickerSet2;
                        hVar.l(stickerSet3.id);
                        TLObject tLObject4 = tLObject2;
                        boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive;
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var2;
                        int i12 = i11;
                        if (z14) {
                            liVar2.A1(d2Var3, z12, i12, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                        }
                        liVar2.b1(i12, false, false, true, new yg(liVar2, stickerSet3, 0));
                        if (tL_error == null && z13) {
                            FrameLayout frameLayout3 = frameLayout2;
                            Context context3 = context2;
                            TLObject tLObject5 = tLObject3;
                            TLRPC.Document document3 = document2;
                            if (frameLayout3 != null) {
                                org.telegram.ui.Components.ac.f(frameLayout3, new bv0(context3, tLObject5, 1, 2, document3, d2Var3.getResourceProvider()), 1500).j();
                            } else if (d2Var3 != null) {
                                org.telegram.ui.Components.ac.g(d2Var3, new bv0(context3, tLObject5, 1, 2, document3, d2Var3.getResourceProvider()), 1500).j();
                            }
                        }
                    }
                });
            }
        });
    }

    public final ArrayList i0(int i3, boolean z10) {
        ArrayList[] arrayListArr = this.g0;
        ArrayList arrayList = arrayListArr[i3];
        if (i3 == 7) {
            return new ArrayList(arrayListArr[i3]);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(0, Math.min(arrayList.size(), 20)));
        if (z10 && !arrayList2.isEmpty()) {
            arrayList2.add(0, new TLRPC.TL_documentEmpty());
        }
        return arrayList2;
    }

    public final void i1(String str, TLRPC.Document document, boolean z10) {
        this.a0.remove(str);
        zf.c cVar = this.A0;
        ArrayList arrayList = cVar.e;
        boolean z11 = true;
        if (z10) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    z11 = false;
                    break;
                } else {
                    if (((zf.b) arrayList.get(i3)).d && str.equals(((zf.b) arrayList.get(i3)).b)) {
                        arrayList.remove(i3);
                        break;
                    }
                    i3++;
                }
            }
        } else {
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    z11 = false;
                    break;
                } else {
                    if (((zf.b) arrayList.get(i10)).d && str.equals(((zf.b) arrayList.get(i10)).b)) {
                        ((zf.b) arrayList.get(i10)).d = false;
                        ((zf.b) arrayList.get(i10)).a = document;
                        break;
                    }
                    i10++;
                }
            }
            if (z11) {
                cVar.h();
            }
        }
        if (z11) {
            hs.f(cVar.c).k(hs.e5, new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x0013, B:8:0x0035, B:10:0x0039, B:11:0x0048, B:13:0x0051, B:17:0x0063, B:19:0x006a, B:23:0x0081, B:32:0x00c3, B:34:0x00da, B:35:0x00e3, B:37:0x00df, B:38:0x00cc, B:40:0x00d0, B:42:0x00d6, B:43:0x0093, B:45:0x0099, B:46:0x00a6, B:48:0x00ac), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x0013, B:8:0x0035, B:10:0x0039, B:11:0x0048, B:13:0x0051, B:17:0x0063, B:19:0x006a, B:23:0x0081, B:32:0x00c3, B:34:0x00da, B:35:0x00e3, B:37:0x00df, B:38:0x00cc, B:40:0x00d0, B:42:0x00d6, B:43:0x0093, B:45:0x0099, B:46:0x00a6, B:48:0x00ac), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6 A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x0013, B:8:0x0035, B:10:0x0039, B:11:0x0048, B:13:0x0051, B:17:0x0063, B:19:0x006a, B:23:0x0081, B:32:0x00c3, B:34:0x00da, B:35:0x00e3, B:37:0x00df, B:38:0x00cc, B:40:0x00d0, B:42:0x00d6, B:43:0x0093, B:45:0x0099, B:46:0x00a6, B:48:0x00ac), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i2(int i3, long j10) {
        TLRPC.Chat M0;
        TLRPC.User a22;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                ArrayList arrayList = new ArrayList();
                if (i3 == 0) {
                    arrayList.add("sdid_" + j10);
                    arrayList.add("ndid_" + j10);
                }
                if (i3 == d2) {
                    arrayList.add("bdid_" + j10);
                }
                g0.f.o(t0.b, arrayList);
                if (i10 >= 30) {
                    d2.t1.b(t0.b.getSystemService(d2.t1.e())).removeLongLivedShortcuts(arrayList);
                    return;
                }
                return;
            }
            TLRPC.User user = null;
            if (m5.C(j10)) {
                TLRPC.EncryptedChat a12 = getMessagesController().a1(Integer.valueOf((int) (4294967295L & j10)));
                if (a12 == null) {
                    return;
                } else {
                    a22 = getMessagesController().a2(Long.valueOf(a12.user_id));
                }
            } else {
                if (!m5.E(j10)) {
                    if (m5.z(j10)) {
                        M0 = getMessagesController().M0(Long.valueOf(-j10));
                        if (user == null || M0 != null) {
                            String m10 = user == null ? i3 == 0 ? g5.m(0, user.first_name, user.last_name) : i3 == d2 ? user.first_name : "" : M0.title;
                            Intent I = i3 != 0 ? I(j10) : H(j10);
                            Intent intent = new Intent();
                            intent.putExtra("android.intent.extra.shortcut.INTENT", I);
                            intent.putExtra("android.intent.extra.shortcut.NAME", m10);
                            intent.putExtra("duplicate", false);
                            intent.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
                            t0.b.sendBroadcast(intent);
                        }
                        return;
                    }
                    return;
                }
                a22 = getMessagesController().a2(Long.valueOf(j10));
            }
            user = a22;
            M0 = null;
            if (user == null) {
            }
            if (user == null) {
            }
            if (i3 != 0) {
            }
            Intent intent2 = new Intent();
            intent2.putExtra("android.intent.extra.shortcut.INTENT", I);
            intent2.putExtra("android.intent.extra.shortcut.NAME", m10);
            intent2.putExtra("duplicate", false);
            intent2.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
            t0.b.sendBroadcast(intent2);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean j(long j10) {
        for (int i3 = 0; i3 < this.b.bots.size(); i3++) {
            if (this.b.bots.get(i3).bot_id == j10) {
                return true;
            }
        }
        return false;
    }

    public final int j0() {
        ArrayList arrayList = this.a1;
        boolean isEmpty = arrayList.isEmpty();
        int[] iArr = this.X0;
        return isEmpty ? Math.max(Math.max(iArr[0] + iArr[1], this.W0), arrayList.size()) : Math.max(iArr[0] + iArr[1], arrayList.size());
    }

    public final void j2(long j10, TL_update.TL_updateBotCommands tL_updateBotCommands) {
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.w1.get(tL_updateBotCommands.bot_id + "_" + j10);
        if (botInfo != null) {
            botInfo.commands = tL_updateBotCommands.commands;
            getNotificationCenter().k(hs.D0, botInfo, 0);
        }
        getMessagesStorage().a.c(new a4(this, tL_updateBotCommands, j10, 13));
    }

    public final ArrayList k(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean z10, boolean z11) {
        if (arrayList.isEmpty()) {
            return null;
        }
        a0.h hVar = new a0.h();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i3);
            hVar.k(user, user.id);
        }
        a0.h hVar2 = new a0.h();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i10);
            hVar2.k(chat, chat.id);
        }
        ArrayList arrayList4 = new ArrayList();
        if (!z11) {
            g0.h3(new rg(this, arrayList2, z10, arrayList3, arrayList, arrayList4, hVar, hVar2));
            return null;
        }
        g0.h3(new ci.u8(this, arrayList2, z10, arrayList3, 14));
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i12);
            if ((zi.o1(message) instanceof TLRPC.TL_messageMediaDocument) || (zi.o1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                i11++;
            }
            a0.h hVar3 = hVar2;
            int i13 = i11;
            arrayList4.add(new zi(this.currentAccount, message, hVar, hVar3, false, i13 < 30));
            i12++;
            hVar2 = hVar3;
            i11 = i13;
        }
        return arrayList4;
    }

    public final void k1() {
        ArrayList arrayList = this.h;
        if (arrayList == null || this.y || !lc.e(8200) || this.currentAccount != h10.t0) {
            return;
        }
        this.y = true;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int min = Math.min(arrayList2.size(), 10);
        for (int i3 = 0; i3 < min; i3++) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList2.get(i3);
            l1(ac.b(tL_availableReaction.activate_animation), 0);
            l1(ac.b(tL_availableReaction.appear_animation), 0);
        }
        for (int i10 = 0; i10 < min; i10++) {
            l1(ac.b(((TLRPC.TL_availableReaction) arrayList2.get(i10)).effect_animation), 0);
        }
    }

    public final void k2() {
        zi ziVar;
        ArrayList arrayList = this.Z0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        HashSet hashSet = new HashSet();
        int i3 = 0;
        while (true) {
            ArrayList arrayList3 = this.a1;
            zi ziVar2 = null;
            if (i3 >= arrayList3.size()) {
                break;
            }
            zi ziVar3 = (zi) arrayList3.get(i3);
            if ((!ziVar3.A2() || ziVar3.Q2) && !hashSet.contains(Integer.valueOf(ziVar3.f1()))) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList2.size()) {
                        break;
                    }
                    if (((zi) arrayList2.get(i10)).f1() == ziVar3.f1()) {
                        ziVar2 = (zi) arrayList2.get(i10);
                        break;
                    }
                    i10++;
                }
                if (ziVar2 != null) {
                    ziVar3.N(ziVar2);
                    ziVar3.x0 = ziVar2.x0;
                    ziVar3.w0 = ziVar2.w0;
                }
                ziVar3.m2 = true;
                arrayList.add(ziVar3);
                hashSet.add(Integer.valueOf(ziVar3.f1()));
            }
            i3++;
        }
        for (int i11 = 0; i11 < this.b1.size(); i11++) {
            zi ziVar4 = (zi) this.b1.get(i11);
            if (!hashSet.contains(Integer.valueOf(ziVar4.f1()))) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList2.size()) {
                        ziVar = null;
                        break;
                    } else {
                        if (((zi) arrayList2.get(i12)).f1() == ziVar4.f1()) {
                            ziVar = (zi) arrayList2.get(i12);
                            break;
                        }
                        i12++;
                    }
                }
                if (ziVar != null) {
                    ziVar4.N(ziVar);
                    ziVar4.x0 = ziVar.x0;
                    ziVar4.w0 = ziVar.w0;
                }
                ziVar4.m2 = true;
                arrayList.add(ziVar4);
                hashSet.add(Integer.valueOf(ziVar4.f1()));
            }
        }
    }

    public final void l(ArrayList arrayList, a0.h hVar, ArrayList arrayList2, ArrayList arrayList3, long j10, boolean z10) {
        a0.h hVar2 = new a0.h();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i3);
            hVar2.k(user, user.id);
        }
        a0.h hVar3 = new a0.h();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i10);
            hVar3.k(chat, chat.id);
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList4.add(new zi(this.currentAccount, (TLRPC.Message) arrayList.get(i11), hVar2, hVar3, false, false));
        }
        g0.h3(new ci.k(this, arrayList2, z10, arrayList3, arrayList4, hVar, j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TLRPC.TL_messages_stickerSet l0(final TLRPC.InputStickerSet inputStickerSet, final Integer num, final boolean z10, boolean z11, final u10 u10Var) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        if (inputStickerSet != null) {
            boolean z12 = inputStickerSet instanceof TLRPC.TL_inputStickerSetID;
            if (z12) {
                long j10 = inputStickerSet.id;
                a0.h hVar = this.J;
                if (hVar.d(j10)) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) hVar.f(inputStickerSet.id);
                    if (tL_messages_stickerSet != null) {
                        if (!z11 && u10Var != null) {
                            u10Var.a(tL_messages_stickerSet);
                        }
                        return tL_messages_stickerSet;
                    }
                    final String x02 = x0(inputStickerSet);
                    HashSet hashSet = this.J0;
                    if (u10Var != null || !hashSet.contains(x02)) {
                        hashSet.add(x02);
                        if (z12) {
                            final int i3 = 0;
                            getMessagesStorage().a.c(new Runnable(this) { // from class: org.telegram.messenger.fh
                                public final /* synthetic */ li b;

                                {
                                    this.b = this;
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
                                
                                    if (r5 != null) goto L31;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:93:0x010b, code lost:
                                
                                    if (r5 != null) goto L75;
                                 */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                                    SQLiteCursor sQLiteCursor;
                                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet3;
                                    int intValue;
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4;
                                    SQLiteCursor sQLiteCursor2;
                                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet5;
                                    int intValue2;
                                    int i10 = i3;
                                    NativeByteBuffer nativeByteBuffer = null;
                                    Integer num2 = num;
                                    switch (i10) {
                                        case 0:
                                            final li liVar = this.b;
                                            final TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
                                            try {
                                                sQLiteCursor = liVar.getMessagesStorage().b.queryFinalized("SELECT data, hash FROM stickersets2 WHERE id = ? LIMIT 1", Long.valueOf(inputStickerSet2.id));
                                                try {
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    tL_messages_stickerSet2 = null;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
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
                                                        try {
                                                            intValue = sQLiteCursor.intValue(1);
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            nativeByteBuffer = byteBufferValue;
                                                            try {
                                                                a8.g(th, true);
                                                                if (nativeByteBuffer != null) {
                                                                    nativeByteBuffer.reuse();
                                                                    break;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        tL_messages_stickerSet2 = null;
                                                    }
                                                    if (num2 != null && num2.intValue() != 0) {
                                                        if (num2.intValue() != intValue) {
                                                            byteBufferValue.reuse();
                                                            sQLiteCursor.dispose();
                                                            tL_messages_stickerSet3 = null;
                                                            final int i11 = 1;
                                                            final String str2 = x02;
                                                            final u10 u10Var2 = u10Var;
                                                            final boolean z13 = z10;
                                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.oh
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    int i12 = i11;
                                                                    TLRPC.InputStickerSet inputStickerSet3 = inputStickerSet2;
                                                                    boolean z14 = z13;
                                                                    final u10 u10Var3 = u10Var2;
                                                                    final String str3 = str2;
                                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = tL_messages_stickerSet3;
                                                                    final li liVar2 = liVar;
                                                                    final int i13 = 1;
                                                                    final int i14 = 0;
                                                                    switch (i12) {
                                                                        case 0:
                                                                            HashSet hashSet2 = liVar2.J0;
                                                                            if (tL_messages_stickerSet6 == null) {
                                                                                if (!z14) {
                                                                                    liVar2.N(inputStickerSet3, new n10() { // from class: org.telegram.messenger.ff
                                                                                        @Override // org.telegram.messenger.n10
                                                                                        public final void a(Object obj, Object obj2) {
                                                                                            TLRPC.StickerSet stickerSet;
                                                                                            TLRPC.StickerSet stickerSet2;
                                                                                            int i15 = i14;
                                                                                            u10 u10Var4 = u10Var3;
                                                                                            String str4 = str3;
                                                                                            li liVar3 = liVar2;
                                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                                            switch (i15) {
                                                                                                case 0:
                                                                                                    liVar3.J0.remove(str4);
                                                                                                    if (u10Var4 != null) {
                                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet = tL_messages_stickerSet7.set) != null) {
                                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet.id);
                                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    liVar3.J0.remove(str4);
                                                                                                    if (u10Var4 != null) {
                                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet2.id);
                                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
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
                                                                                if (u10Var3 != null) {
                                                                                    u10Var3.a(tL_messages_stickerSet6);
                                                                                }
                                                                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet6.set;
                                                                                if (stickerSet != null) {
                                                                                    liVar2.J.k(tL_messages_stickerSet6, stickerSet.id);
                                                                                    liVar2.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                                }
                                                                                liVar2.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                                break;
                                                                            }
                                                                        default:
                                                                            HashSet hashSet3 = liVar2.J0;
                                                                            if (tL_messages_stickerSet6 == null) {
                                                                                if (!z14) {
                                                                                    liVar2.N(inputStickerSet3, new n10() { // from class: org.telegram.messenger.ff
                                                                                        @Override // org.telegram.messenger.n10
                                                                                        public final void a(Object obj, Object obj2) {
                                                                                            TLRPC.StickerSet stickerSet2;
                                                                                            TLRPC.StickerSet stickerSet22;
                                                                                            int i15 = i13;
                                                                                            u10 u10Var4 = u10Var3;
                                                                                            String str4 = str3;
                                                                                            li liVar3 = liVar2;
                                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                                            switch (i15) {
                                                                                                case 0:
                                                                                                    liVar3.J0.remove(str4);
                                                                                                    if (u10Var4 != null) {
                                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet2.id);
                                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    liVar3.J0.remove(str4);
                                                                                                    if (u10Var4 != null) {
                                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet22.id);
                                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
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
                                                                                if (u10Var3 != null) {
                                                                                    u10Var3.a(tL_messages_stickerSet6);
                                                                                }
                                                                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet6.set;
                                                                                if (stickerSet2 != null) {
                                                                                    liVar2.J.k(tL_messages_stickerSet6, stickerSet2.id);
                                                                                    liVar2.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                                }
                                                                                liVar2.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
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
                                            final int i112 = 1;
                                            final String str22 = x02;
                                            final u10 u10Var22 = u10Var;
                                            final boolean z132 = z10;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.oh
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i12 = i112;
                                                    TLRPC.InputStickerSet inputStickerSet3 = inputStickerSet2;
                                                    boolean z14 = z132;
                                                    final u10 u10Var3 = u10Var22;
                                                    final String str3 = str22;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = tL_messages_stickerSet3;
                                                    final li liVar2 = liVar;
                                                    final int i13 = 1;
                                                    final int i14 = 0;
                                                    switch (i12) {
                                                        case 0:
                                                            HashSet hashSet2 = liVar2.J0;
                                                            if (tL_messages_stickerSet6 == null) {
                                                                if (!z14) {
                                                                    liVar2.N(inputStickerSet3, new n10() { // from class: org.telegram.messenger.ff
                                                                        @Override // org.telegram.messenger.n10
                                                                        public final void a(Object obj, Object obj2) {
                                                                            TLRPC.StickerSet stickerSet2;
                                                                            TLRPC.StickerSet stickerSet22;
                                                                            int i15 = i14;
                                                                            u10 u10Var4 = u10Var3;
                                                                            String str4 = str3;
                                                                            li liVar3 = liVar2;
                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                            switch (i15) {
                                                                                case 0:
                                                                                    liVar3.J0.remove(str4);
                                                                                    if (u10Var4 != null) {
                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet2.id);
                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    liVar3.J0.remove(str4);
                                                                                    if (u10Var4 != null) {
                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet22.id);
                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
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
                                                                if (u10Var3 != null) {
                                                                    u10Var3.a(tL_messages_stickerSet6);
                                                                }
                                                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet6.set;
                                                                if (stickerSet != null) {
                                                                    liVar2.J.k(tL_messages_stickerSet6, stickerSet.id);
                                                                    liVar2.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                }
                                                                liVar2.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                break;
                                                            }
                                                        default:
                                                            HashSet hashSet3 = liVar2.J0;
                                                            if (tL_messages_stickerSet6 == null) {
                                                                if (!z14) {
                                                                    liVar2.N(inputStickerSet3, new n10() { // from class: org.telegram.messenger.ff
                                                                        @Override // org.telegram.messenger.n10
                                                                        public final void a(Object obj, Object obj2) {
                                                                            TLRPC.StickerSet stickerSet2;
                                                                            TLRPC.StickerSet stickerSet22;
                                                                            int i15 = i13;
                                                                            u10 u10Var4 = u10Var3;
                                                                            String str4 = str3;
                                                                            li liVar3 = liVar2;
                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                            switch (i15) {
                                                                                case 0:
                                                                                    liVar3.J0.remove(str4);
                                                                                    if (u10Var4 != null) {
                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet2.id);
                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    liVar3.J0.remove(str4);
                                                                                    if (u10Var4 != null) {
                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet22.id);
                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
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
                                                                if (u10Var3 != null) {
                                                                    u10Var3.a(tL_messages_stickerSet6);
                                                                }
                                                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet6.set;
                                                                if (stickerSet2 != null) {
                                                                    liVar2.J.k(tL_messages_stickerSet6, stickerSet2.id);
                                                                    liVar2.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                }
                                                                liVar2.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                break;
                                                            }
                                                    }
                                                }
                                            });
                                            return;
                                        default:
                                            final li liVar2 = this.b;
                                            final TLRPC.InputStickerSet inputStickerSet3 = inputStickerSet;
                                            try {
                                                sQLiteCursor2 = liVar2.getMessagesStorage().b.queryFinalized("SELECT data, hash FROM stickersets2 WHERE short_name = ? LIMIT 1", inputStickerSet3.short_name.toLowerCase());
                                                try {
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    tL_messages_stickerSet4 = null;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
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
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            nativeByteBuffer = byteBufferValue2;
                                                            try {
                                                                a8.g(th, true);
                                                                if (nativeByteBuffer != null) {
                                                                    nativeByteBuffer.reuse();
                                                                    break;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        tL_messages_stickerSet4 = null;
                                                    }
                                                    if (num2 != null && num2.intValue() != 0) {
                                                        if (num2.intValue() != intValue2) {
                                                            byteBufferValue2.reuse();
                                                            sQLiteCursor2.dispose();
                                                            tL_messages_stickerSet5 = null;
                                                            final int i12 = 0;
                                                            final String str3 = x02;
                                                            final u10 u10Var3 = u10Var;
                                                            final boolean z14 = z10;
                                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.oh
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    int i122 = i12;
                                                                    TLRPC.InputStickerSet inputStickerSet32 = inputStickerSet3;
                                                                    boolean z142 = z14;
                                                                    final u10 u10Var32 = u10Var3;
                                                                    final String str32 = str3;
                                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = tL_messages_stickerSet5;
                                                                    final li liVar22 = liVar2;
                                                                    final int i13 = 1;
                                                                    final int i14 = 0;
                                                                    switch (i122) {
                                                                        case 0:
                                                                            HashSet hashSet2 = liVar22.J0;
                                                                            if (tL_messages_stickerSet6 == null) {
                                                                                if (!z142) {
                                                                                    liVar22.N(inputStickerSet32, new n10() { // from class: org.telegram.messenger.ff
                                                                                        @Override // org.telegram.messenger.n10
                                                                                        public final void a(Object obj, Object obj2) {
                                                                                            TLRPC.StickerSet stickerSet2;
                                                                                            TLRPC.StickerSet stickerSet22;
                                                                                            int i15 = i14;
                                                                                            u10 u10Var4 = u10Var32;
                                                                                            String str4 = str32;
                                                                                            li liVar3 = liVar22;
                                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                                            switch (i15) {
                                                                                                case 0:
                                                                                                    liVar3.J0.remove(str4);
                                                                                                    if (u10Var4 != null) {
                                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet2.id);
                                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    liVar3.J0.remove(str4);
                                                                                                    if (u10Var4 != null) {
                                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet22.id);
                                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
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
                                                                                if (u10Var32 != null) {
                                                                                    u10Var32.a(tL_messages_stickerSet6);
                                                                                }
                                                                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet6.set;
                                                                                if (stickerSet != null) {
                                                                                    liVar22.J.k(tL_messages_stickerSet6, stickerSet.id);
                                                                                    liVar22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                                }
                                                                                liVar22.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                                break;
                                                                            }
                                                                        default:
                                                                            HashSet hashSet3 = liVar22.J0;
                                                                            if (tL_messages_stickerSet6 == null) {
                                                                                if (!z142) {
                                                                                    liVar22.N(inputStickerSet32, new n10() { // from class: org.telegram.messenger.ff
                                                                                        @Override // org.telegram.messenger.n10
                                                                                        public final void a(Object obj, Object obj2) {
                                                                                            TLRPC.StickerSet stickerSet2;
                                                                                            TLRPC.StickerSet stickerSet22;
                                                                                            int i15 = i13;
                                                                                            u10 u10Var4 = u10Var32;
                                                                                            String str4 = str32;
                                                                                            li liVar3 = liVar22;
                                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                                            switch (i15) {
                                                                                                case 0:
                                                                                                    liVar3.J0.remove(str4);
                                                                                                    if (u10Var4 != null) {
                                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet2.id);
                                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    liVar3.J0.remove(str4);
                                                                                                    if (u10Var4 != null) {
                                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet22.id);
                                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
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
                                                                                if (u10Var32 != null) {
                                                                                    u10Var32.a(tL_messages_stickerSet6);
                                                                                }
                                                                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet6.set;
                                                                                if (stickerSet2 != null) {
                                                                                    liVar22.J.k(tL_messages_stickerSet6, stickerSet2.id);
                                                                                    liVar22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                                }
                                                                                liVar22.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
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
                                            final int i122 = 0;
                                            final String str32 = x02;
                                            final u10 u10Var32 = u10Var;
                                            final boolean z142 = z10;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.oh
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i1222 = i122;
                                                    TLRPC.InputStickerSet inputStickerSet32 = inputStickerSet3;
                                                    boolean z1422 = z142;
                                                    final u10 u10Var322 = u10Var32;
                                                    final String str322 = str32;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = tL_messages_stickerSet5;
                                                    final li liVar22 = liVar2;
                                                    final int i13 = 1;
                                                    final int i14 = 0;
                                                    switch (i1222) {
                                                        case 0:
                                                            HashSet hashSet2 = liVar22.J0;
                                                            if (tL_messages_stickerSet6 == null) {
                                                                if (!z1422) {
                                                                    liVar22.N(inputStickerSet32, new n10() { // from class: org.telegram.messenger.ff
                                                                        @Override // org.telegram.messenger.n10
                                                                        public final void a(Object obj, Object obj2) {
                                                                            TLRPC.StickerSet stickerSet2;
                                                                            TLRPC.StickerSet stickerSet22;
                                                                            int i15 = i14;
                                                                            u10 u10Var4 = u10Var322;
                                                                            String str4 = str322;
                                                                            li liVar3 = liVar22;
                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                            switch (i15) {
                                                                                case 0:
                                                                                    liVar3.J0.remove(str4);
                                                                                    if (u10Var4 != null) {
                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet2.id);
                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    liVar3.J0.remove(str4);
                                                                                    if (u10Var4 != null) {
                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet22.id);
                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
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
                                                                if (u10Var322 != null) {
                                                                    u10Var322.a(tL_messages_stickerSet6);
                                                                }
                                                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet6.set;
                                                                if (stickerSet != null) {
                                                                    liVar22.J.k(tL_messages_stickerSet6, stickerSet.id);
                                                                    liVar22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                }
                                                                liVar22.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                break;
                                                            }
                                                        default:
                                                            HashSet hashSet3 = liVar22.J0;
                                                            if (tL_messages_stickerSet6 == null) {
                                                                if (!z1422) {
                                                                    liVar22.N(inputStickerSet32, new n10() { // from class: org.telegram.messenger.ff
                                                                        @Override // org.telegram.messenger.n10
                                                                        public final void a(Object obj, Object obj2) {
                                                                            TLRPC.StickerSet stickerSet2;
                                                                            TLRPC.StickerSet stickerSet22;
                                                                            int i15 = i13;
                                                                            u10 u10Var4 = u10Var322;
                                                                            String str4 = str322;
                                                                            li liVar3 = liVar22;
                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                            switch (i15) {
                                                                                case 0:
                                                                                    liVar3.J0.remove(str4);
                                                                                    if (u10Var4 != null) {
                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet2.id);
                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    liVar3.J0.remove(str4);
                                                                                    if (u10Var4 != null) {
                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet22.id);
                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
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
                                                                if (u10Var322 != null) {
                                                                    u10Var322.a(tL_messages_stickerSet6);
                                                                }
                                                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet6.set;
                                                                if (stickerSet2 != null) {
                                                                    liVar22.J.k(tL_messages_stickerSet6, stickerSet2.id);
                                                                    liVar22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                }
                                                                liVar22.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
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
                            final int i10 = 1;
                            getMessagesStorage().a.c(new Runnable(this) { // from class: org.telegram.messenger.fh
                                public final /* synthetic */ li b;

                                {
                                    this.b = this;
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
                                
                                    if (r5 != null) goto L31;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:93:0x010b, code lost:
                                
                                    if (r5 != null) goto L75;
                                 */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                                    SQLiteCursor sQLiteCursor;
                                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet3;
                                    int intValue;
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4;
                                    SQLiteCursor sQLiteCursor2;
                                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet5;
                                    int intValue2;
                                    int i102 = i10;
                                    NativeByteBuffer nativeByteBuffer = null;
                                    Integer num2 = num;
                                    switch (i102) {
                                        case 0:
                                            final li liVar = this.b;
                                            final TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
                                            try {
                                                sQLiteCursor = liVar.getMessagesStorage().b.queryFinalized("SELECT data, hash FROM stickersets2 WHERE id = ? LIMIT 1", Long.valueOf(inputStickerSet2.id));
                                                try {
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    tL_messages_stickerSet2 = null;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
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
                                                        try {
                                                            intValue = sQLiteCursor.intValue(1);
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            nativeByteBuffer = byteBufferValue;
                                                            try {
                                                                a8.g(th, true);
                                                                if (nativeByteBuffer != null) {
                                                                    nativeByteBuffer.reuse();
                                                                    break;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        tL_messages_stickerSet2 = null;
                                                    }
                                                    if (num2 != null && num2.intValue() != 0) {
                                                        if (num2.intValue() != intValue) {
                                                            byteBufferValue.reuse();
                                                            sQLiteCursor.dispose();
                                                            tL_messages_stickerSet3 = null;
                                                            final int i112 = 1;
                                                            final String str22 = x02;
                                                            final u10 u10Var22 = u10Var;
                                                            final boolean z132 = z10;
                                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.oh
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    int i1222 = i112;
                                                                    TLRPC.InputStickerSet inputStickerSet32 = inputStickerSet2;
                                                                    boolean z1422 = z132;
                                                                    final u10 u10Var322 = u10Var22;
                                                                    final String str322 = str22;
                                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = tL_messages_stickerSet3;
                                                                    final li liVar22 = liVar;
                                                                    final int i13 = 1;
                                                                    final int i14 = 0;
                                                                    switch (i1222) {
                                                                        case 0:
                                                                            HashSet hashSet2 = liVar22.J0;
                                                                            if (tL_messages_stickerSet6 == null) {
                                                                                if (!z1422) {
                                                                                    liVar22.N(inputStickerSet32, new n10() { // from class: org.telegram.messenger.ff
                                                                                        @Override // org.telegram.messenger.n10
                                                                                        public final void a(Object obj, Object obj2) {
                                                                                            TLRPC.StickerSet stickerSet2;
                                                                                            TLRPC.StickerSet stickerSet22;
                                                                                            int i15 = i14;
                                                                                            u10 u10Var4 = u10Var322;
                                                                                            String str4 = str322;
                                                                                            li liVar3 = liVar22;
                                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                                            switch (i15) {
                                                                                                case 0:
                                                                                                    liVar3.J0.remove(str4);
                                                                                                    if (u10Var4 != null) {
                                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet2.id);
                                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    liVar3.J0.remove(str4);
                                                                                                    if (u10Var4 != null) {
                                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet22.id);
                                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
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
                                                                                if (u10Var322 != null) {
                                                                                    u10Var322.a(tL_messages_stickerSet6);
                                                                                }
                                                                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet6.set;
                                                                                if (stickerSet != null) {
                                                                                    liVar22.J.k(tL_messages_stickerSet6, stickerSet.id);
                                                                                    liVar22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                                }
                                                                                liVar22.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                                break;
                                                                            }
                                                                        default:
                                                                            HashSet hashSet3 = liVar22.J0;
                                                                            if (tL_messages_stickerSet6 == null) {
                                                                                if (!z1422) {
                                                                                    liVar22.N(inputStickerSet32, new n10() { // from class: org.telegram.messenger.ff
                                                                                        @Override // org.telegram.messenger.n10
                                                                                        public final void a(Object obj, Object obj2) {
                                                                                            TLRPC.StickerSet stickerSet2;
                                                                                            TLRPC.StickerSet stickerSet22;
                                                                                            int i15 = i13;
                                                                                            u10 u10Var4 = u10Var322;
                                                                                            String str4 = str322;
                                                                                            li liVar3 = liVar22;
                                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                                            switch (i15) {
                                                                                                case 0:
                                                                                                    liVar3.J0.remove(str4);
                                                                                                    if (u10Var4 != null) {
                                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet2.id);
                                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    liVar3.J0.remove(str4);
                                                                                                    if (u10Var4 != null) {
                                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet22.id);
                                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
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
                                                                                if (u10Var322 != null) {
                                                                                    u10Var322.a(tL_messages_stickerSet6);
                                                                                }
                                                                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet6.set;
                                                                                if (stickerSet2 != null) {
                                                                                    liVar22.J.k(tL_messages_stickerSet6, stickerSet2.id);
                                                                                    liVar22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                                }
                                                                                liVar22.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
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
                                            final int i1122 = 1;
                                            final String str222 = x02;
                                            final u10 u10Var222 = u10Var;
                                            final boolean z1322 = z10;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.oh
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i1222 = i1122;
                                                    TLRPC.InputStickerSet inputStickerSet32 = inputStickerSet2;
                                                    boolean z1422 = z1322;
                                                    final u10 u10Var322 = u10Var222;
                                                    final String str322 = str222;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = tL_messages_stickerSet3;
                                                    final li liVar22 = liVar;
                                                    final int i13 = 1;
                                                    final int i14 = 0;
                                                    switch (i1222) {
                                                        case 0:
                                                            HashSet hashSet2 = liVar22.J0;
                                                            if (tL_messages_stickerSet6 == null) {
                                                                if (!z1422) {
                                                                    liVar22.N(inputStickerSet32, new n10() { // from class: org.telegram.messenger.ff
                                                                        @Override // org.telegram.messenger.n10
                                                                        public final void a(Object obj, Object obj2) {
                                                                            TLRPC.StickerSet stickerSet2;
                                                                            TLRPC.StickerSet stickerSet22;
                                                                            int i15 = i14;
                                                                            u10 u10Var4 = u10Var322;
                                                                            String str4 = str322;
                                                                            li liVar3 = liVar22;
                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                            switch (i15) {
                                                                                case 0:
                                                                                    liVar3.J0.remove(str4);
                                                                                    if (u10Var4 != null) {
                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet2.id);
                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    liVar3.J0.remove(str4);
                                                                                    if (u10Var4 != null) {
                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet22.id);
                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
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
                                                                if (u10Var322 != null) {
                                                                    u10Var322.a(tL_messages_stickerSet6);
                                                                }
                                                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet6.set;
                                                                if (stickerSet != null) {
                                                                    liVar22.J.k(tL_messages_stickerSet6, stickerSet.id);
                                                                    liVar22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                }
                                                                liVar22.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                break;
                                                            }
                                                        default:
                                                            HashSet hashSet3 = liVar22.J0;
                                                            if (tL_messages_stickerSet6 == null) {
                                                                if (!z1422) {
                                                                    liVar22.N(inputStickerSet32, new n10() { // from class: org.telegram.messenger.ff
                                                                        @Override // org.telegram.messenger.n10
                                                                        public final void a(Object obj, Object obj2) {
                                                                            TLRPC.StickerSet stickerSet2;
                                                                            TLRPC.StickerSet stickerSet22;
                                                                            int i15 = i13;
                                                                            u10 u10Var4 = u10Var322;
                                                                            String str4 = str322;
                                                                            li liVar3 = liVar22;
                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                            switch (i15) {
                                                                                case 0:
                                                                                    liVar3.J0.remove(str4);
                                                                                    if (u10Var4 != null) {
                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet2.id);
                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    liVar3.J0.remove(str4);
                                                                                    if (u10Var4 != null) {
                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet22.id);
                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
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
                                                                if (u10Var322 != null) {
                                                                    u10Var322.a(tL_messages_stickerSet6);
                                                                }
                                                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet6.set;
                                                                if (stickerSet2 != null) {
                                                                    liVar22.J.k(tL_messages_stickerSet6, stickerSet2.id);
                                                                    liVar22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                }
                                                                liVar22.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                break;
                                                            }
                                                    }
                                                }
                                            });
                                            return;
                                        default:
                                            final li liVar2 = this.b;
                                            final TLRPC.InputStickerSet inputStickerSet3 = inputStickerSet;
                                            try {
                                                sQLiteCursor2 = liVar2.getMessagesStorage().b.queryFinalized("SELECT data, hash FROM stickersets2 WHERE short_name = ? LIMIT 1", inputStickerSet3.short_name.toLowerCase());
                                                try {
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    tL_messages_stickerSet4 = null;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
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
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            nativeByteBuffer = byteBufferValue2;
                                                            try {
                                                                a8.g(th, true);
                                                                if (nativeByteBuffer != null) {
                                                                    nativeByteBuffer.reuse();
                                                                    break;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        tL_messages_stickerSet4 = null;
                                                    }
                                                    if (num2 != null && num2.intValue() != 0) {
                                                        if (num2.intValue() != intValue2) {
                                                            byteBufferValue2.reuse();
                                                            sQLiteCursor2.dispose();
                                                            tL_messages_stickerSet5 = null;
                                                            final int i122 = 0;
                                                            final String str32 = x02;
                                                            final u10 u10Var32 = u10Var;
                                                            final boolean z142 = z10;
                                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.oh
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    int i1222 = i122;
                                                                    TLRPC.InputStickerSet inputStickerSet32 = inputStickerSet3;
                                                                    boolean z1422 = z142;
                                                                    final u10 u10Var322 = u10Var32;
                                                                    final String str322 = str32;
                                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = tL_messages_stickerSet5;
                                                                    final li liVar22 = liVar2;
                                                                    final int i13 = 1;
                                                                    final int i14 = 0;
                                                                    switch (i1222) {
                                                                        case 0:
                                                                            HashSet hashSet2 = liVar22.J0;
                                                                            if (tL_messages_stickerSet6 == null) {
                                                                                if (!z1422) {
                                                                                    liVar22.N(inputStickerSet32, new n10() { // from class: org.telegram.messenger.ff
                                                                                        @Override // org.telegram.messenger.n10
                                                                                        public final void a(Object obj, Object obj2) {
                                                                                            TLRPC.StickerSet stickerSet2;
                                                                                            TLRPC.StickerSet stickerSet22;
                                                                                            int i15 = i14;
                                                                                            u10 u10Var4 = u10Var322;
                                                                                            String str4 = str322;
                                                                                            li liVar3 = liVar22;
                                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                                            switch (i15) {
                                                                                                case 0:
                                                                                                    liVar3.J0.remove(str4);
                                                                                                    if (u10Var4 != null) {
                                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet2.id);
                                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    liVar3.J0.remove(str4);
                                                                                                    if (u10Var4 != null) {
                                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet22.id);
                                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
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
                                                                                if (u10Var322 != null) {
                                                                                    u10Var322.a(tL_messages_stickerSet6);
                                                                                }
                                                                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet6.set;
                                                                                if (stickerSet != null) {
                                                                                    liVar22.J.k(tL_messages_stickerSet6, stickerSet.id);
                                                                                    liVar22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                                }
                                                                                liVar22.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                                break;
                                                                            }
                                                                        default:
                                                                            HashSet hashSet3 = liVar22.J0;
                                                                            if (tL_messages_stickerSet6 == null) {
                                                                                if (!z1422) {
                                                                                    liVar22.N(inputStickerSet32, new n10() { // from class: org.telegram.messenger.ff
                                                                                        @Override // org.telegram.messenger.n10
                                                                                        public final void a(Object obj, Object obj2) {
                                                                                            TLRPC.StickerSet stickerSet2;
                                                                                            TLRPC.StickerSet stickerSet22;
                                                                                            int i15 = i13;
                                                                                            u10 u10Var4 = u10Var322;
                                                                                            String str4 = str322;
                                                                                            li liVar3 = liVar22;
                                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                                            switch (i15) {
                                                                                                case 0:
                                                                                                    liVar3.J0.remove(str4);
                                                                                                    if (u10Var4 != null) {
                                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet2.id);
                                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    liVar3.J0.remove(str4);
                                                                                                    if (u10Var4 != null) {
                                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                                    }
                                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet22.id);
                                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
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
                                                                                if (u10Var322 != null) {
                                                                                    u10Var322.a(tL_messages_stickerSet6);
                                                                                }
                                                                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet6.set;
                                                                                if (stickerSet2 != null) {
                                                                                    liVar22.J.k(tL_messages_stickerSet6, stickerSet2.id);
                                                                                    liVar22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                                }
                                                                                liVar22.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
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
                                            final int i1222 = 0;
                                            final String str322 = x02;
                                            final u10 u10Var322 = u10Var;
                                            final boolean z1422 = z10;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.oh
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i12222 = i1222;
                                                    TLRPC.InputStickerSet inputStickerSet32 = inputStickerSet3;
                                                    boolean z14222 = z1422;
                                                    final u10 u10Var3222 = u10Var322;
                                                    final String str3222 = str322;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = tL_messages_stickerSet5;
                                                    final li liVar22 = liVar2;
                                                    final int i13 = 1;
                                                    final int i14 = 0;
                                                    switch (i12222) {
                                                        case 0:
                                                            HashSet hashSet2 = liVar22.J0;
                                                            if (tL_messages_stickerSet6 == null) {
                                                                if (!z14222) {
                                                                    liVar22.N(inputStickerSet32, new n10() { // from class: org.telegram.messenger.ff
                                                                        @Override // org.telegram.messenger.n10
                                                                        public final void a(Object obj, Object obj2) {
                                                                            TLRPC.StickerSet stickerSet2;
                                                                            TLRPC.StickerSet stickerSet22;
                                                                            int i15 = i14;
                                                                            u10 u10Var4 = u10Var3222;
                                                                            String str4 = str3222;
                                                                            li liVar3 = liVar22;
                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                            switch (i15) {
                                                                                case 0:
                                                                                    liVar3.J0.remove(str4);
                                                                                    if (u10Var4 != null) {
                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet2.id);
                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    liVar3.J0.remove(str4);
                                                                                    if (u10Var4 != null) {
                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet22.id);
                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
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
                                                                if (u10Var3222 != null) {
                                                                    u10Var3222.a(tL_messages_stickerSet6);
                                                                }
                                                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet6.set;
                                                                if (stickerSet != null) {
                                                                    liVar22.J.k(tL_messages_stickerSet6, stickerSet.id);
                                                                    liVar22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                }
                                                                liVar22.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
                                                                break;
                                                            }
                                                        default:
                                                            HashSet hashSet3 = liVar22.J0;
                                                            if (tL_messages_stickerSet6 == null) {
                                                                if (!z14222) {
                                                                    liVar22.N(inputStickerSet32, new n10() { // from class: org.telegram.messenger.ff
                                                                        @Override // org.telegram.messenger.n10
                                                                        public final void a(Object obj, Object obj2) {
                                                                            TLRPC.StickerSet stickerSet2;
                                                                            TLRPC.StickerSet stickerSet22;
                                                                            int i15 = i13;
                                                                            u10 u10Var4 = u10Var3222;
                                                                            String str4 = str3222;
                                                                            li liVar3 = liVar22;
                                                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet7 = (TLRPC.TL_messages_stickerSet) obj2;
                                                                            switch (i15) {
                                                                                case 0:
                                                                                    liVar3.J0.remove(str4);
                                                                                    if (u10Var4 != null) {
                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet2 = tL_messages_stickerSet7.set) != null) {
                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet2.id);
                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    liVar3.J0.remove(str4);
                                                                                    if (u10Var4 != null) {
                                                                                        u10Var4.a(tL_messages_stickerSet7);
                                                                                    }
                                                                                    if (tL_messages_stickerSet7 != null && (stickerSet22 = tL_messages_stickerSet7.set) != null) {
                                                                                        liVar3.J.k(tL_messages_stickerSet7, stickerSet22.id);
                                                                                        liVar3.O.put(tL_messages_stickerSet7.set.short_name.toLowerCase(), tL_messages_stickerSet7);
                                                                                        liVar3.U1(tL_messages_stickerSet7);
                                                                                        liVar3.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet7.set.id), tL_messages_stickerSet7);
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
                                                                if (u10Var3222 != null) {
                                                                    u10Var3222.a(tL_messages_stickerSet6);
                                                                }
                                                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet6.set;
                                                                if (stickerSet2 != null) {
                                                                    liVar22.J.k(tL_messages_stickerSet6, stickerSet2.id);
                                                                    liVar22.O.put(tL_messages_stickerSet6.set.short_name.toLowerCase(), tL_messages_stickerSet6);
                                                                }
                                                                liVar22.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet6.set.id), tL_messages_stickerSet6);
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
                        if (z10) {
                            hashSet.remove(x02);
                            return null;
                        }
                        N(inputStickerSet, new g9(this, x02, u10Var, inputStickerSet, 2));
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

    public final void l1(ac acVar, int i3) {
        getFileLoader().W(acVar, null, null, i3, 11);
    }

    public final void l2(String str) {
        HashMap hashMap = this.a0;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(str, new zf.d(str, this.currentAccount));
        zf.c cVar = this.A0;
        cVar.getClass();
        zf.b bVar = new zf.b();
        bVar.b = str;
        int i3 = cVar.d;
        cVar.d = i3 + 1;
        bVar.c = i3;
        bVar.d = true;
        cVar.e.add(bVar);
    }

    public final void m() {
        int g7 = g0.f.g(t0.b) - 2;
        if (g7 <= 0) {
            g7 = 5;
        }
        ArrayList arrayList = new ArrayList();
        if (az.s.length() <= 0) {
            for (int i3 = 0; i3 < this.j1.size(); i3++) {
                arrayList.add((TLRPC.TL_topPeer) this.j1.get(i3));
                if (arrayList.size() == g7 - 2) {
                    break;
                }
            }
        }
        Utilities.e.c(new qf(this, Build.VERSION.SDK_INT >= 30, arrayList, 0));
    }

    public final TLRPC.TL_messages_stickerSet m0(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        return l0(inputStickerSet, null, z10, false, null);
    }

    public final void m2(TLRPC.Message message) {
        n2(message, false);
    }

    public final TLRPC.TL_messages_stickerSet n0(String str) {
        return (TLRPC.TL_messages_stickerSet) this.R.get(str);
    }

    public final void n1() {
        ArrayList[] arrayListArr = this.g0;
        if (arrayListArr[3].isEmpty()) {
            return;
        }
        ArrayList arrayList = arrayListArr[3];
        this.z0 = (TLRPC.Document) arrayList.get(Utilities.b.nextInt(arrayList.size()));
        getFileLoader().W(ac.b(this.z0), this.z0, null, 0, 1);
    }

    public final void n2(TLRPC.Message message, boolean z10) {
        if (message == null) {
            return;
        }
        TLRPC.Document G0 = zi.G0(message);
        String str = null;
        if (G0 != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= G0.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = G0.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                    if (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                        str = inputStickerSet.short_name;
                    }
                } else {
                    i3++;
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.O.get(str);
        if (tL_messages_stickerSet == null) {
            if (z10) {
                g0.h3(new dg((Object) this, (Object) message, str, 4));
                return;
            } else {
                o2(message, str);
                return;
            }
        }
        int size = tL_messages_stickerSet.documents.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
            if (document.id == G0.id && document.dc_id == G0.dc_id) {
                message.stickerVerified = 1;
                return;
            }
        }
    }

    public final long o(ArrayList arrayList, boolean z10) {
        long j10 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) arrayList.get(i3)).set;
                if (!stickerSet.archived) {
                    j10 = p(j10, stickerSet.id);
                    if (this.v0[z10 ? 1 : 0].contains(Long.valueOf(stickerSet.id))) {
                        j10 = p(j10, 1L);
                    }
                }
            }
        }
        return j10;
    }

    public final TLRPC.TL_messages_stickerSet o0(long j10) {
        return (TLRPC.TL_messages_stickerSet) this.J.f(j10);
    }

    public final void o1() {
        boolean z10 = this.D0;
        ArrayList arrayList = this.C0;
        if (!z10 && arrayList.isEmpty()) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = i6.c("⭐") + i6.c("⭐");
            tL_messages_getStickers.hash = 0L;
            this.D0 = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickers, new zg(this, 2));
            return;
        }
        int i3 = 0;
        while (i3 < Math.min(arrayList.size(), 3)) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i3 == 2 ? arrayList.size() - 1 : i3);
            if (zi.Y3(document)) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.A1 = false;
                imageReceiver.q0(ac.b(document), null, null, "webp", null, 1);
                zb.D().M(imageReceiver, null);
                ImageReceiver imageReceiver2 = new ImageReceiver(null);
                imageReceiver2.A1 = false;
                imageReceiver2.t0(ac.d(zi.G1(document), document), null, null, null, "tgs", null, 1);
                zb.D().M(imageReceiver2, null);
            }
            i3++;
        }
    }

    public final void o2(TLRPC.Message message, String str) {
        HashMap hashMap = this.b0;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(message);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = zi.k1(message);
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new ph(this, str, 1));
    }

    public final TLRPC.TL_messages_stickerSet p0(String str) {
        if (str == null) {
            return null;
        }
        return (TLRPC.TL_messages_stickerSet) this.O.get(str.toLowerCase());
    }

    public final void p1(TLRPC.StickerSetCovered stickerSetCovered) {
        TLRPC.StickerSet stickerSet;
        TLRPC.PhotoSize w10;
        if (stickerSetCovered == null || (stickerSet = stickerSetCovered.set) == null || (w10 = w7.w(stickerSet.thumbs, 90, false, null, false)) == null) {
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
        ac k10 = ac.k(w10, document, stickerSetCovered.set.thumb_version);
        if (k10 != null) {
            getFileLoader().W(k10, stickerSetCovered, k10.p == 1 ? "tgs" : "webp", 3, 1);
        }
    }

    public final void q1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        TLRPC.PhotoSize w10;
        ArrayList<TLRPC.Document> arrayList;
        ac k10;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || (w10 = w7.w(stickerSet.thumbs, 90, false, null, false)) == null || (arrayList = tL_messages_stickerSet.documents) == null || arrayList.isEmpty() || (k10 = ac.k(w10, arrayList.get(0), tL_messages_stickerSet.set.thumb_version)) == null) {
            return;
        }
        getFileLoader().W(k10, tL_messages_stickerSet, k10.p == 1 ? "tgs" : "webp", 3, 1);
    }

    public final String r0(long j10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.J.f(j10);
        if (tL_messages_stickerSet != null) {
            return tL_messages_stickerSet.set.short_name;
        }
        a0.h[] hVarArr = this.u0;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) hVarArr[0].f(j10);
        if (stickerSetCovered != null) {
            return stickerSetCovered.set.short_name;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) hVarArr[1].f(j10);
        if (stickerSetCovered2 != null) {
            return stickerSetCovered2.set.short_name;
        }
        return null;
    }

    public final void r1(final int i3, TLRPC.TL_messages_allStickers tL_messages_allStickers, Runnable runnable) {
        final TLRPC.TL_messages_allStickers tL_messages_allStickers2 = tL_messages_allStickers;
        final ArrayList arrayList = new ArrayList();
        if (tL_messages_allStickers2.sets.isEmpty()) {
            z1(i3, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers2.hash2, runnable);
            return;
        }
        final a0.h hVar = new a0.h();
        final int i10 = 0;
        while (i10 < tL_messages_allStickers2.sets.size()) {
            final TLRPC.StickerSet stickerSet = tL_messages_allStickers2.sets.get(i10);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.J.f(stickerSet.id);
            if (tL_messages_stickerSet != null) {
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                if (stickerSet2.hash == stickerSet.hash) {
                    stickerSet2.archived = stickerSet.archived;
                    stickerSet2.installed = stickerSet.installed;
                    stickerSet2.official = stickerSet.official;
                    hVar.k(tL_messages_stickerSet, stickerSet2.id);
                    arrayList.add(tL_messages_stickerSet);
                    if (hVar.m() == tL_messages_allStickers2.sets.size()) {
                        z1(i3, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers2.hash2, null);
                    }
                    i10++;
                    tL_messages_allStickers2 = tL_messages_allStickers;
                }
            }
            arrayList.add(null);
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
            tL_inputStickerSetID.id = stickerSet.id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() { // from class: org.telegram.messenger.zh
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    g0.h3(new kg.s(li.this, tLObject, arrayList, i10, hVar, stickerSet, tL_messages_allStickers2, i3));
                }
            });
            i10++;
            tL_messages_allStickers2 = tL_messages_allStickers;
        }
        runnable.run();
    }

    public final boolean s() {
        return (this.X[0] && this.H[0].size() < 5 && this.g0[2].isEmpty()) ? false : true;
    }

    public final ArrayList s0(int i3) {
        ArrayList[] arrayListArr = this.H;
        return i3 == 3 ? arrayListArr[2] : arrayListArr[i3];
    }

    public final void s1(String str, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z11, int i3) {
        g0.h3(new ch(this, str, 4));
        Utilities.d.c(new kg.q0(this, z11, tL_messages_stickerSet, i3, str, z10));
    }

    public final void t1(final boolean z10, final ArrayList arrayList, final ArrayList arrayList2, final boolean z11, final boolean z12, final int i3, final long j10) {
        g0.h3(new hh(this, z10, 0));
        Utilities.d.c(new Runnable() { // from class: org.telegram.messenger.ih
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
            
                if (java.lang.Math.abs((java.lang.System.currentTimeMillis() / 1000) - r10) < 3600) goto L11;
             */
            /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                long j11;
                boolean z13;
                final li liVar;
                boolean z14;
                int i10;
                ArrayList arrayList3;
                li liVar2 = li.this;
                boolean z15 = z12;
                ArrayList arrayList4 = arrayList;
                int i11 = i3;
                final long j12 = j10;
                boolean z16 = z10;
                if (z15) {
                    if (arrayList4 != null) {
                        j11 = 0;
                    } else {
                        j11 = 0;
                    }
                    z13 = z16;
                    liVar = liVar2;
                    g0.i3(new jg(liVar, arrayList4, j12, z13), (arrayList4 == null || z15) ? j11 : 1000L);
                    if (arrayList4 == null) {
                        return;
                    }
                    final boolean z17 = z11;
                    if (arrayList4 == null) {
                        g0.h3(new lf(liVar, z13, i11, 1));
                        liVar.G1(z13, null, null, i11, 0L, z17);
                        return;
                    }
                    try {
                        ArrayList arrayList5 = new ArrayList();
                        final a0.h hVar = new a0.h();
                        for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList4.get(i12);
                            arrayList5.add(stickerSetCovered);
                            hVar.k(stickerSetCovered, stickerSetCovered.set.id);
                        }
                        boolean z18 = z13;
                        final ArrayList arrayList6 = arrayList2;
                        if (z15) {
                            z14 = z18;
                            i10 = i11;
                            arrayList3 = arrayList5;
                        } else {
                            arrayList3 = arrayList5;
                            li liVar3 = liVar;
                            i10 = i11;
                            liVar3.G1(z18, arrayList3, arrayList6, i10, j12, z17);
                            z14 = z18;
                            liVar = liVar3;
                        }
                        final int i13 = i10;
                        final ArrayList arrayList7 = arrayList3;
                        final boolean z19 = z14;
                        g0.h3(new Runnable() { // from class: org.telegram.messenger.kg
                            @Override // java.lang.Runnable
                            public final void run() {
                                li liVar4 = li.this;
                                ArrayList[] arrayListArr = liVar4.v0;
                                boolean z20 = z19;
                                arrayListArr[z20 ? 1 : 0] = arrayList6;
                                liVar4.u0[z20 ? 1 : 0] = hVar;
                                liVar4.t0[z20 ? 1 : 0] = arrayList7;
                                liVar4.q0[z20 ? 1 : 0] = j12;
                                liVar4.r0[z20 ? 1 : 0] = i13;
                                liVar4.s0 = z17;
                                liVar4.a1(z20 ? 6 : 3, true, false);
                                liVar4.getNotificationCenter().k(z20 ? hs.A0 : hs.z0, new Object[0]);
                            }
                        });
                        return;
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                        return;
                    }
                }
                j11 = 0;
                if (z15 || arrayList4 != null || j12 != j11) {
                    z13 = z16;
                    liVar = liVar2;
                    final boolean z172 = z11;
                    if (arrayList4 == null) {
                    }
                }
                z13 = z16;
                liVar = liVar2;
                g0.i3(new jg(liVar, arrayList4, j12, z13), (arrayList4 == null || z15) ? j11 : 1000L);
                if (arrayList4 == null) {
                }
                final boolean z1722 = z11;
                if (arrayList4 == null) {
                }
            }
        });
    }

    public final void u(boolean z10) {
        if (z10) {
            this.x = 0;
            int[] iArr = this.r0;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        V0(2, false, true, false);
        V0(3, false, true, false);
        V0(7, false, false, true);
        x();
        w();
        A();
        if (!this.c && (!this.d || Math.abs((System.currentTimeMillis() / 1000) - this.e) >= 3600)) {
            E0(true, false, null);
        }
        if (!this.F && (this.E == null || Math.abs((System.currentTimeMillis() / 1000) - this.G) >= 3600)) {
            R0(true);
        }
        z();
        C();
        if (getUserConfig().e0 != null) {
            String str = getUserConfig().e0;
            TLRPC.TL_messages_stickerSet p02 = p0(str);
            if (p02 == null) {
                p02 = n0(str);
            }
            if (p02 == null) {
                b0(this.currentAccount).c1(str, false, true);
            }
        }
        if (!this.o0 && System.currentTimeMillis() - getUserConfig().i0 >= 86400000) {
            this.o0 = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiGenericAnimations();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new zg(this, 8));
        }
        getMessagesController().E0();
    }

    public final void u0(long j10) {
        v0(j10, true);
    }

    public final void u1(final TLRPC.messages_Messages messages_messages, final long j10, int i3, int i10, final int i11, final int i12, long j11, final int i13, final int i14, final boolean z10, final int i15) {
        long j12;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        ArrayList<TLRPC.Message> arrayList;
        ArrayList<TLRPC.Message> arrayList2;
        if (r2.a) {
            int size = (messages_messages == null || (arrayList2 = messages_messages.messages) == null) ? 0 : arrayList2.size();
            StringBuilder sb2 = new StringBuilder("process load media messagesCount ");
            sb2.append(size);
            sb2.append(" did ");
            j12 = j10;
            sb2.append(j12);
            sb2.append(" topicId ");
            sb2.append(j11);
            sb2.append(" count = ");
            i16 = i3;
            i17 = i10;
            com.google.android.recaptcha.internal.a.r(sb2, i16, " max_id=", i17, " min_id=");
            i18 = i12;
            com.google.android.recaptcha.internal.a.r(sb2, i11, " type = ", i18, " cache = ");
            i19 = i14;
            com.google.android.recaptcha.internal.a.r(sb2, i13, " classGuid = ", i19, " topReached=");
            z11 = z10;
            sb2.append(z11);
            a8.b(sb2.toString());
        } else {
            j12 = j10;
            i16 = i3;
            i17 = i10;
            i18 = i12;
            i19 = i14;
            z11 = z10;
        }
        if (i13 != 0 && messages_messages != null && (arrayList = messages_messages.messages) != null && (((arrayList.isEmpty() && i11 == 0) || (messages_messages.messages.size() <= 1 && i11 != 0)) && !m5.C(j12))) {
            if (i13 == 2) {
                return;
            }
            N0(j10, i16, i17, i11, i18, j11, 0, i19, i15, null, null);
        } else {
            if (i13 == 0) {
                zb.X(messages_messages.messages);
                getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                getMessagesStorage().a.c(new lg(this, i11, messages_messages.messages, z11, j10, i10, i12, j11));
            }
            Utilities.g.c(new Runnable() { // from class: org.telegram.messenger.lh
                @Override // java.lang.Runnable
                public final void run() {
                    TLRPC.messages_Messages messages_messages2;
                    li liVar;
                    a0.h hVar = new a0.h();
                    int i20 = 0;
                    while (true) {
                        messages_messages2 = messages_messages;
                        if (i20 >= messages_messages2.users.size()) {
                            break;
                        }
                        TLRPC.User user = messages_messages2.users.get(i20);
                        hVar.k(user, user.id);
                        i20++;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int i21 = 0;
                    while (true) {
                        int size2 = messages_messages2.messages.size();
                        liVar = li.this;
                        if (i21 >= size2) {
                            break;
                        }
                        zi ziVar = new zi(liVar.currentAccount, messages_messages2.messages.get(i21), hVar, (a0.h) null, true, false);
                        ziVar.Q();
                        arrayList3.add(ziVar);
                        i21++;
                    }
                    liVar.getFileLoader().l(arrayList3);
                    int i22 = i13;
                    long j13 = j10;
                    gf gfVar = new gf(liVar, messages_messages2, i22, j13, arrayList3, i14, i12, z10, i11, i15, 0);
                    if (liVar.getMessagesController().s7.v(j13)) {
                        liVar.getMessagesStorage().a.c(new fg(liVar, arrayList3, gfVar, 29));
                    } else {
                        gfVar.run();
                    }
                }
            });
        }
    }

    public final void v() {
        if (getUserConfig().f0 != null) {
            String str = getUserConfig().f0;
            TLRPC.TL_messages_stickerSet p02 = p0(str);
            if (p02 == null) {
                p02 = n0(str);
            }
            if (p02 == null) {
                b0(this.currentAccount).c1(str, false, true);
            }
        }
        if (this.p0 || System.currentTimeMillis() - getUserConfig().j0 < 86400000) {
            return;
        }
        this.p0 = true;
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiDefaultTopicIcons();
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new zg(this, 5));
    }

    public final void v0(long j10, boolean z10) {
        TLRPC.TL_topPeer tL_topPeer;
        if (getUserConfig().W) {
            h10 userConfig = getUserConfig();
            int i3 = z10 ? userConfig.G : userConfig.F;
            int max = i3 != 0 ? Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - i3) : 60;
            ArrayList arrayList = z10 ? this.l1 : this.k1;
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    tL_topPeer = null;
                    break;
                }
                tL_topPeer = (TLRPC.TL_topPeer) arrayList.get(i10);
                if (tL_topPeer.peer.user_id == j10) {
                    break;
                } else {
                    i10++;
                }
            }
            if (tL_topPeer == null) {
                tL_topPeer = new TLRPC.TL_topPeer();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_topPeer.peer = tL_peerUser;
                tL_peerUser.user_id = j10;
                arrayList.add(tL_topPeer);
            }
            tL_topPeer.rating = Math.exp(max / getMessagesController().a3) + tL_topPeer.rating;
            Collections.sort(arrayList, new o0.a(9));
            if (arrayList.size() > 20) {
                a1.g.y(1, arrayList);
            }
            getMessagesStorage().a.c(new sg(this, j10, z10 ? 3 : 1, tL_topPeer.rating));
            getNotificationCenter().k(z10 ? hs.U0 : hs.T0, new Object[0]);
        }
    }

    public final void v1(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j10, int i3, boolean z10) {
        boolean z11;
        if (tL_attachMenuBots != null && i3 != 0) {
            this.b = tL_attachMenuBots;
            this.a = j10;
        }
        SharedPreferences.Editor edit = getMessagesController().e7.edit();
        this.e = i3;
        edit.putInt("menuBotsUpdateDate", i3).commit();
        this.d = true;
        if (tL_attachMenuBots != null) {
            if (!z10) {
                getMessagesStorage().m1(tL_attachMenuBots.users, null, true, true);
            }
            getMessagesController().Y3(tL_attachMenuBots.users, z10);
            g0.h3(new xf(this, 0));
            z11 = false;
            for (int i10 = 0; i10 < tL_attachMenuBots.bots.size(); i10++) {
                if (tL_attachMenuBots.bots.get(i10) instanceof TLRPC.TL_attachMenuBot_layer162) {
                    tL_attachMenuBots.bots.get(i10).show_in_attach_menu = true;
                    z11 = true;
                }
            }
        } else {
            z11 = false;
        }
        if (!z10) {
            getMessagesStorage().a.c(new yj(i3, 2, j10, this, tL_attachMenuBots));
        } else if (z11 || Math.abs((System.currentTimeMillis() / 1000) - i3) >= 3600) {
            E0(false, true, null);
        }
    }

    public final void w() {
        if (this.x0[1]) {
            return;
        }
        if (!this.y0[1] || Math.abs((System.currentTimeMillis() / 1000) - this.r0[1]) >= 3600) {
            K0(true, true);
        }
    }

    public final void w0(long j10) {
        TLRPC.User a22;
        if (!getUserConfig().W || !m5.E(j10) || (a22 = getMessagesController().a2(Long.valueOf(j10))) == null || a22.bot || a22.self) {
            return;
        }
        getMessagesStorage().a.c(new qg(this, j10, 2));
    }

    public final void w1(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i3, boolean z10) {
        if (tL_help_premiumPromo != null) {
            this.E = tL_help_premiumPromo;
            this.G = i3;
            getMessagesController().Y3(tL_help_premiumPromo.users, z10);
            g0.h3(new xf(this, 3));
        }
        if (!z10) {
            if (tL_help_premiumPromo != null) {
                getMessagesStorage().a.c(new k7(this, tL_help_premiumPromo, i3, 7));
            }
            this.F = false;
        } else if (tL_help_premiumPromo == null || Math.abs((System.currentTimeMillis() / 1000) - i3) >= 86400) {
            R0(false);
        } else {
            this.F = false;
        }
    }

    public final void x() {
        if (this.x0[0]) {
            return;
        }
        if (!this.y0[0] || Math.abs((System.currentTimeMillis() / 1000) - this.r0[0]) >= 3600) {
            K0(false, true);
        }
    }

    public final void x1(List list, int i3, int i10, boolean z10) {
        if (list != null && i10 != 0) {
            ArrayList arrayList = this.h;
            arrayList.clear();
            HashMap hashMap = this.r;
            hashMap.clear();
            ArrayList arrayList2 = this.n;
            arrayList2.clear();
            arrayList.addAll(list);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((TLRPC.TL_availableReaction) arrayList.get(i11)).positionInList = i11;
                hashMap.put(((TLRPC.TL_availableReaction) arrayList.get(i11)).reaction, (TLRPC.TL_availableReaction) arrayList.get(i11));
                if (!((TLRPC.TL_availableReaction) arrayList.get(i11)).inactive) {
                    arrayList2.add((TLRPC.TL_availableReaction) arrayList.get(i11));
                }
            }
            this.f = i3;
        }
        this.x = i10;
        if (list != null) {
            g0.h3(new xf(this, 7));
        }
        this.w = false;
        if (!z10) {
            getMessagesStorage().a.c(new k2.a0(this, list != null ? new ArrayList(list) : null, i3, i10, 3));
        } else {
            Math.abs((System.currentTimeMillis() / 1000) - i10);
            S0(false, Integer.valueOf(i3));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:12|13|(3:15|16|(1:(2:19|20)(1:21))(1:22))(2:158|(1:160)(2:161|(3:163|164|(20:30|(2:32|(3:34|(2:36|37)|144)(6:145|(1:147)(2:149|(1:151)(3:152|(2:154|37)|144))|148|(2:(3:138|139|140)(1:97)|(12:101|102|103|104|105|106|(5:108|(1:110)(1:125)|111|112|113)(4:126|(1:128)|129|130)|114|115|116|117|118)(1:100))(1:41)|42|(6:(1:45)(1:78)|46|(1:48)(1:(2:68|(1:70)(1:71))(2:72|(1:77)(1:76)))|(1:50)(1:66)|51|(2:53|(2:62|63)(3:(1:58)(1:61)|59|60))(2:64|65))(4:79|(1:81)(2:84|(2:86|(1:88)(1:89))(2:90|(1:95)(1:94)))|82|83)))(3:155|(2:157|37)|144)|38|(0)|(0)(0)|(0)|101|102|103|104|105|106|(0)(0)|114|115|116|117|118|42|(0)(0))(1:(2:27|28)(1:29)))(1:(2:166|167)(1:168))))|23|(0)|30|(0)(0)|38|(0)|(0)(0)|(0)|101|102|103|104|105|106|(0)(0)|114|115|116|117|118|42|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01d6, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0140, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01da, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01dd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012e A[Catch: all -> 0x0140, TRY_ENTER, TryCatch #0 {all -> 0x0140, blocks: (B:108:0x012e, B:110:0x0139, B:112:0x0148, B:125:0x0144, B:128:0x015c), top: B:106:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0151 A[Catch: all -> 0x01da, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x01da, blocks: (B:105:0x0127, B:114:0x01a2, B:126:0x0151, B:130:0x016b), top: B:104:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00e1 A[Catch: Exception -> 0x01fa, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x01fa, blocks: (B:12:0x0023, B:42:0x01e3, B:46:0x0200, B:48:0x0227, B:50:0x0263, B:51:0x0295, B:53:0x029f, B:55:0x02a3, B:59:0x02ae, B:61:0x02aa, B:62:0x02b3, B:63:0x02ba, B:64:0x02bb, B:65:0x02c2, B:68:0x0230, B:70:0x0234, B:71:0x023d, B:72:0x0246, B:74:0x024c, B:76:0x0250, B:77:0x0259, B:79:0x02c3, B:81:0x02ca, B:82:0x0309, B:86:0x02d4, B:88:0x02d8, B:89:0x02e2, B:90:0x02ec, B:92:0x02f2, B:94:0x02f6, B:95:0x0300, B:123:0x01e0, B:155:0x00e1, B:158:0x0058, B:161:0x006b, B:163:0x0071, B:166:0x0326, B:4:0x0014), top: B:3:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f A[Catch: Exception -> 0x0011, TryCatch #7 {Exception -> 0x0011, blocks: (B:174:0x000b, B:8:0x001d, B:16:0x0031, B:19:0x0041, B:22:0x0047, B:27:0x0086, B:32:0x008f, B:34:0x0093, B:36:0x00a9, B:145:0x00b3, B:147:0x00b9, B:149:0x00c4, B:151:0x00ca, B:152:0x00d2, B:154:0x00de, B:157:0x00e7, B:160:0x005e), top: B:173:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02c3 A[Catch: Exception -> 0x01fa, TryCatch #2 {Exception -> 0x01fa, blocks: (B:12:0x0023, B:42:0x01e3, B:46:0x0200, B:48:0x0227, B:50:0x0263, B:51:0x0295, B:53:0x029f, B:55:0x02a3, B:59:0x02ae, B:61:0x02aa, B:62:0x02b3, B:63:0x02ba, B:64:0x02bb, B:65:0x02c2, B:68:0x0230, B:70:0x0234, B:71:0x023d, B:72:0x0246, B:74:0x024c, B:76:0x0250, B:77:0x0259, B:79:0x02c3, B:81:0x02ca, B:82:0x0309, B:86:0x02d4, B:88:0x02d8, B:89:0x02e2, B:90:0x02ec, B:92:0x02f2, B:94:0x02f6, B:95:0x0300, B:123:0x01e0, B:155:0x00e1, B:158:0x0058, B:161:0x006b, B:163:0x0071, B:166:0x0326, B:4:0x0014), top: B:3:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(long j10, int i3, org.telegram.ui.web.q qVar) {
        Intent I;
        TLRPC.Chat M0;
        TLRPC.User user;
        TLRPC.User a22;
        String str;
        TLRPC.FileLocation fileLocation;
        String str2;
        TLRPC.FileLocation fileLocation2;
        boolean z10;
        Bitmap bitmap;
        int i10;
        PendingIntent pendingIntent;
        String M02;
        boolean z11 = true;
        if (i3 == 0) {
            try {
                I = I(j10);
            } catch (Exception e10) {
                e = e10;
                a8.g(e, z11);
                return;
            }
        } else {
            try {
                I = H(j10);
            } catch (Exception e11) {
                e = e11;
                z11 = true;
                a8.g(e, z11);
                return;
            }
        }
        Intent intent = I;
        if (intent == null) {
            if (qVar != null) {
                qVar.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (m5.C(j10)) {
            TLRPC.EncryptedChat a12 = getMessagesController().a1(Integer.valueOf((int) (4294967295L & j10)));
            if (a12 == null) {
                if (qVar != null) {
                    qVar.a(Boolean.FALSE);
                    return;
                }
                return;
            }
            a22 = getMessagesController().a2(Long.valueOf(a12.user_id));
        } else if (m5.E(j10)) {
            a22 = getMessagesController().a2(Long.valueOf(j10));
        } else {
            if (!m5.z(j10)) {
                if (qVar != null) {
                    qVar.a(Boolean.FALSE);
                    return;
                }
                return;
            }
            M0 = getMessagesController().M0(Long.valueOf(-j10));
            user = null;
            if (user != null && M0 == null) {
                if (qVar != null) {
                    qVar.a(Boolean.FALSE);
                    return;
                }
                return;
            }
            if (user != null) {
                str = M0.title;
                TLRPC.ChatPhoto chatPhoto = M0.photo;
                if (chatPhoto != null) {
                    fileLocation = chatPhoto.photo_small;
                    TLRPC.FileLocation fileLocation3 = fileLocation;
                    str2 = str;
                    fileLocation2 = fileLocation3;
                }
                str2 = str;
                fileLocation2 = null;
            } else {
                if (i3 != d2) {
                    if (l10.z(user)) {
                        M02 = bd.M0(2131746274, null);
                    } else if (l10.B(user)) {
                        M02 = bd.M0(2131745911, null);
                    } else {
                        str = g5.m(0, user.first_name, user.last_name);
                        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                        if (userProfilePhoto != null) {
                            fileLocation = userProfilePhoto.photo_small;
                            TLRPC.FileLocation fileLocation32 = fileLocation;
                            str2 = str;
                            fileLocation2 = fileLocation32;
                        }
                        str2 = str;
                        fileLocation2 = null;
                    }
                    str2 = M02;
                    z10 = true;
                    fileLocation2 = null;
                    if (z10 && fileLocation2 == null) {
                        bitmap = null;
                    } else {
                        if (z10) {
                            bitmap = null;
                        } else {
                            try {
                                getFileLoader().getClass();
                                bitmap = BitmapFactory.decodeFile(w7.K(fileLocation2, null, true, true).toString());
                            } catch (Throwable th2) {
                                th = th2;
                                bitmap = null;
                                a8.g(th, z11);
                                if (Build.VERSION.SDK_INT >= 26) {
                                }
                            }
                        }
                        if (!z10 || bitmap != null) {
                            int L = g0.L(58.0f);
                            Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                            createBitmap.eraseColor(0);
                            Canvas canvas = new Canvas(createBitmap);
                            if (z10) {
                                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(0, user);
                                if (l10.z(user)) {
                                    u8Var.g(12);
                                } else {
                                    u8Var.g(1);
                                }
                                u8Var.setBounds(0, 0, L, L);
                                u8Var.draw(canvas);
                                i10 = L;
                            } else {
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                                if (Z1 == null) {
                                    Z1 = new Paint(1);
                                    b2 = new RectF();
                                }
                                float width = L / bitmap.getWidth();
                                canvas.save();
                                canvas.scale(width, width);
                                Z1.setShader(bitmapShader);
                                i10 = L;
                                b2.set(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                                canvas.drawRoundRect(b2, bitmap.getWidth(), bitmap.getHeight(), Z1);
                                canvas.restore();
                            }
                            Drawable drawable = t0.b.getResources().getDrawable(R.drawable.book_logo);
                            int L2 = g0.L(15.0f);
                            int i11 = i10 - L2;
                            int L3 = i11 - g0.L(2.0f);
                            int L4 = i11 - g0.L(2.0f);
                            drawable.setBounds(L3, L4, L3 + L2, L2 + L4);
                            drawable.draw(canvas);
                            canvas.setBitmap(null);
                            bitmap = createBitmap;
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        Intent intent2 = new Intent();
                        if (bitmap != null) {
                            intent2.putExtra("android.intent.extra.shortcut.ICON", bitmap);
                        } else if (user != null) {
                            if (user.bot) {
                                intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(t0.b, R.drawable.book_bot));
                            } else {
                                intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(t0.b, R.drawable.book_user));
                            }
                        } else if (!t3.T(M0) || M0.megagroup) {
                            intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(t0.b, R.drawable.book_group));
                        } else {
                            intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(t0.b, R.drawable.book_channel));
                        }
                        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
                        intent2.putExtra("android.intent.extra.shortcut.NAME", str2);
                        intent2.putExtra("duplicate", false);
                        intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                        t0.b.sendBroadcast(intent2);
                        return;
                    }
                    String str3 = i3 == 0 ? "sdid_" : "bdid_";
                    Context context = t0.b;
                    g0.c cVar = new g0.c();
                    cVar.a = context;
                    cVar.b = str3 + j10;
                    cVar.e = str2;
                    cVar.c = new Intent[]{intent};
                    if (bitmap != null) {
                        cVar.h = IconCompat.c(bitmap);
                    } else if (user != null) {
                        if (user.bot) {
                            cVar.h = IconCompat.d(t0.b, R.drawable.book_bot);
                        } else {
                            cVar.h = IconCompat.d(t0.b, R.drawable.book_user);
                        }
                    } else if (!t3.T(M0) || M0.megagroup) {
                        cVar.h = IconCompat.d(t0.b, R.drawable.book_group);
                    } else {
                        cVar.h = IconCompat.d(t0.b, R.drawable.book_channel);
                    }
                    if (qVar != null) {
                        byte[] bArr = new byte[16];
                        Utilities.c.nextBytes(bArr);
                        String f10 = Utilities.f(bArr);
                        Intent intent3 = new Intent(t0.b, (Class<?>) ShortcutResultReceiver.class);
                        intent3.putExtra("account", this.currentAccount);
                        intent3.putExtra("req_id", f10);
                        pendingIntent = PendingIntent.getBroadcast(t0.b, 0, intent3, 167772160);
                        this.p1.put(f10, qVar);
                    } else {
                        pendingIntent = null;
                    }
                    Context context2 = t0.b;
                    if (TextUtils.isEmpty(cVar.e)) {
                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                    Intent[] intentArr = cVar.c;
                    if (intentArr == null || intentArr.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    g0.f.r(context2, cVar, pendingIntent == null ? null : pendingIntent.getIntentSender());
                    return;
                }
                str = l10.p(hp.s1(this.currentAccount).a2(Long.valueOf(j10)));
                TLRPC.UserProfilePhoto userProfilePhoto2 = user.photo;
                if (userProfilePhoto2 != null) {
                    fileLocation = userProfilePhoto2.photo_small;
                    TLRPC.FileLocation fileLocation322 = fileLocation;
                    str2 = str;
                    fileLocation2 = fileLocation322;
                }
                str2 = str;
                fileLocation2 = null;
            }
            z10 = false;
            if (z10) {
            }
            if (z10) {
            }
            if (!z10) {
            }
            int L5 = g0.L(58.0f);
            Bitmap createBitmap2 = Bitmap.createBitmap(L5, L5, Bitmap.Config.ARGB_8888);
            createBitmap2.eraseColor(0);
            Canvas canvas2 = new Canvas(createBitmap2);
            if (z10) {
            }
            Drawable drawable2 = t0.b.getResources().getDrawable(R.drawable.book_logo);
            int L22 = g0.L(15.0f);
            int i112 = i10 - L22;
            int L32 = i112 - g0.L(2.0f);
            int L42 = i112 - g0.L(2.0f);
            drawable2.setBounds(L32, L42, L32 + L22, L22 + L42);
            drawable2.draw(canvas2);
            canvas2.setBitmap(null);
            bitmap = createBitmap2;
            if (Build.VERSION.SDK_INT >= 26) {
            }
        }
        user = a22;
        M0 = null;
        if (user != null) {
        }
        if (user != null) {
        }
        z10 = false;
        if (z10) {
        }
        if (z10) {
        }
        if (!z10) {
        }
        int L52 = g0.L(58.0f);
        Bitmap createBitmap22 = Bitmap.createBitmap(L52, L52, Bitmap.Config.ARGB_8888);
        createBitmap22.eraseColor(0);
        Canvas canvas22 = new Canvas(createBitmap22);
        if (z10) {
        }
        Drawable drawable22 = t0.b.getResources().getDrawable(R.drawable.book_logo);
        int L222 = g0.L(15.0f);
        int i1122 = i10 - L222;
        int L322 = i1122 - g0.L(2.0f);
        int L422 = i1122 - g0.L(2.0f);
        drawable22.setBounds(L322, L422, L322 + L222, L222 + L422);
        drawable22.draw(canvas22);
        canvas22.setBitmap(null);
        bitmap = createBitmap22;
        if (Build.VERSION.SDK_INT >= 26) {
        }
    }

    public final void y1(int i3, ArrayList arrayList, boolean z10, int i10, boolean z11) {
        int i11;
        ArrayList arrayList2;
        boolean z12;
        int i12;
        if (arrayList != null) {
            i11 = i3;
            arrayList2 = arrayList;
            z12 = z10;
            i12 = i10;
            getMessagesStorage().a.c(new nf(this, z12, i11, arrayList2, z11, i12));
        } else {
            i11 = i3;
            arrayList2 = arrayList;
            z12 = z10;
            i12 = i10;
        }
        if (i12 == 0) {
            g0.h3(new of(this, z12, i11, arrayList2));
        }
    }

    public final void z() {
        if (getUserConfig().c0 != null) {
            String str = getUserConfig().c0;
            TLRPC.TL_messages_stickerSet p02 = p0(str);
            if (p02 == null) {
                p02 = n0(str);
            }
            if (p02 == null) {
                b0(this.currentAccount).c1(str, false, true);
            }
        }
        if (this.m0 || System.currentTimeMillis() - getUserConfig().g0 < 86400000) {
            return;
        }
        this.m0 = true;
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new zg(this, 4));
    }

    public final void z1(int i3, ArrayList arrayList, boolean z10, int i10, long j10, Runnable runnable) {
        g0.h3(new gg(this, i3, 0));
        Utilities.d.c(new hg(this, z10, arrayList, i10, j10, i3, runnable));
    }
}
