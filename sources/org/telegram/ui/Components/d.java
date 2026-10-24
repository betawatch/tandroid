package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Object obj, Object obj2) {
        tz tzVar = (tz) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        cz czVar = tzVar.R1;
        if (czVar == null || !(czVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            return;
        }
        ((CompoundEmoji.CompoundEmojiDrawable) tzVar.R1.getDrawable()).update(num.intValue(), num2.intValue());
        String str = (String) tzVar.R1.getTag();
        if (num.intValue() == -1 && num2.intValue() == -1) {
            Emoji.emojiColor.remove(str);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(num.intValue() >= 0 ? CompoundEmoji.skinTones.get(num.intValue()) : "");
            sb2.append("\u200d");
            sb2.append(num2.intValue() >= 0 ? CompoundEmoji.skinTones.get(num2.intValue()) : "");
            Emoji.emojiColor.put(str, sb2.toString());
        }
        Emoji.saveEmojiColors();
    }

    private final void b(Object obj, Object obj2) {
        ty tyVar = (ty) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = tyVar.s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            ky kyVar = (ky) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = kyVar.b;
            if (tL_messages_stickerSet != null) {
                boolean z10 = tL_messages_stickerSet.set.id == tyVar.d;
                int i11 = vy.a;
                m61 J = m61.J(vy.class);
                long j10 = tL_messages_stickerSet.set.id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = kyVar.a;
                if (stickerSetCovered != null) {
                    arrayList.add(vy.a(stickerSetCovered, kyVar, stickerSetCovered.set.id == tyVar.d));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        oz ozVar = (oz) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = ozVar.E;
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            Object obj3 = arrayList2.get(i10);
            i10++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.id, 1);
                boolean z10 = tL_messages_stickerSet.set.id == ozVar.d;
                int i11 = vy.a;
                m61 J = m61.J(vy.class);
                long j10 = tL_messages_stickerSet.set.id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = ozVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            ky kyVar = (ky) obj4;
            TLRPC.StickerSet stickerSet = kyVar.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(vy.a(kyVar.a, kyVar, stickerSet.id == ozVar.d));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        float[] fArr = FragmentContextView.W0;
        fragmentContextView.A0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.W;
        org.telegram.ui.ActionBar.a1 a1Var = fragmentContextView.I;
        float floatValue = ((Float) obj).floatValue();
        a1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        m40 m40Var = (m40) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList(0);
        m40Var.c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(m40Var.a).history);
        if (m40Var.c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < m40Var.c.size(); i10++) {
            String str = (String) m40Var.c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(m61.c(i10 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(m61.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        ci.t6 t6Var;
        n40 n40Var = (n40) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = n40Var.Q;
        int i10 = 0;
        boolean z10 = n40Var.R && (t6Var = n40Var.S) != null && t6Var.i.size() > 0;
        if (z10) {
            ci.t6 t6Var2 = n40Var.S;
            int i11 = hg.l1.a;
            m61 J = m61.J(hg.l1.class);
            J.G = t6Var2;
            arrayList.add(J);
        }
        n40Var.T = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            MessageObject messageObject = (MessageObject) arrayList2.get(i10);
            m61 m61Var = new m61(33);
            m61Var.d = i12;
            m61Var.G = messageObject;
            arrayList.add(m61Var);
            i10 = i12;
        }
        if (n40Var.U || !n40Var.X) {
            arrayList.add(m61.o(-2, 1));
            arrayList.add(m61.o(-3, 1));
            arrayList.add(m61.o(-4, 1));
        }
        if (n40Var.T || !z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new zp(n40Var, 21));
    }

    private final void g(Object obj, Object obj2) {
        h80 h80Var = (h80) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        j80 j80Var = h80Var.x;
        j80Var.f.setAlpha(1.0f);
        if (j80Var.u) {
            h80Var.c = bitmap;
        }
        gh.b bVar = j80Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            hh.d.c(j80Var.n, h80Var);
            ViewGroup viewGroup = j80Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        xh0 xh0Var = (xh0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = xh0Var.e;
        ArrayList arrayList3 = xh0Var.n;
        int i10 = 0;
        if (xh0Var.d == null) {
            arrayList.add(m61.o(-1, 7));
            arrayList.add(m61.o(-2, 7));
            arrayList.add(m61.o(-3, 7));
            xh0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(xh0Var.w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(m61.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                m61 m61Var = new m61(33);
                m61Var.G = (MessageObject) obj3;
                arrayList.add(m61Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(m61.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                m61 m61Var2 = new m61(33);
                m61Var2.G = (MessageObject) obj4;
                arrayList.add(m61Var2);
            }
        }
        if (xh0Var.v || ((xh0Var.M && !xh0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !xh0Var.s))) {
            arrayList.add(m61.o(xh0Var.L * 3, 7));
            arrayList.add(m61.o((xh0Var.L * 3) + 1, 7));
            arrayList.add(m61.o((xh0Var.L * 3) + 2, 7));
        }
        xh0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        cn0 cn0Var = (cn0) this.b;
        cn0Var.c = (Bitmap) obj;
        Paint paint = new Paint(1);
        cn0Var.e = paint;
        Bitmap bitmap = cn0Var.c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        cn0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        cn0Var.f = new Matrix();
        gh.b bVar = cn0Var.h;
        bVar.a((Bitmap) obj2);
        hh.d.c(bVar, cn0Var.s);
        ViewGroup viewGroup = cn0Var.y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        ty0 ty0Var = (ty0) this.b;
        CharSequence charSequence = (CharSequence) obj;
        ty0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(ty0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new x1((Utilities.Callback) obj2, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:388:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0800 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x07b8  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        m61 a2;
        TL_iv.RichMessage richMessage;
        m61 a10;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        m61 a11;
        TL_iv.RichMessage richMessage3;
        String substring2;
        String substring3;
        boolean z10;
        String str2;
        MediaController.AudioEntry audioEntry;
        b71 b71Var;
        int i10;
        boolean z11;
        int i11 = this.a;
        int i12 = 29;
        String str3 = null;
        int i13 = 5;
        final int i14 = 0;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                e0 e0Var = (e0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                b71 b71Var2 = (b71) obj2;
                boolean[] zArr = e0Var.p0;
                boolean[] zArr2 = e0Var.q0;
                d0 d0Var = e0Var.x0;
                arrayList.add(m61.B(null));
                arrayList.add(m61.l(e0Var.v0));
                arrayList.add(m61.B(null));
                b71Var2.F = 1;
                b71Var2.U();
                d0 d0Var2 = e0Var.w0;
                int selectedTab = d0Var2 != null ? d0Var2.getSelectedTab() : 0;
                int i15 = 6;
                int i16 = 7;
                if (selectedTab == 0) {
                    String str4 = e0Var.r0;
                    if (str4 == null || str4.equalsIgnoreCase(TranslateController.UNKNOWN_LANGUAGE)) {
                        arrayList.add(e51.b(3, LocaleController.getString(R.string.AIEditorOriginalText), null, null, null));
                    } else {
                        String N = y41.N(e0Var.r0, null, zArr2);
                        String string = LocaleController.getString((zArr2 == null || !zArr2[0]) ? R.string.AIEditorFromOther : R.string.AIEditorFrom);
                        int indexOf = string.indexOf("%s");
                        if (indexOf < 0) {
                            substring3 = "";
                            substring2 = substring3;
                        } else {
                            substring2 = string.substring(0, indexOf);
                            substring3 = string.substring(indexOf + 2);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            N = y41.J(N);
                        }
                        arrayList.add(e51.b(3, substring2, N, substring3, null));
                    }
                    arrayList.add(e0Var.i0() ? e0Var.j0(4, e0Var.Y, false) : i51.a(4, e0Var.X, e0Var.P0, new b(e0Var, 4), null, null));
                    String N2 = y41.N(e0Var.s0, zArr, null);
                    String string2 = LocaleController.getString((zArr == null || !zArr[0]) ? R.string.AIEditorToOther : R.string.AIEditorTo);
                    int indexOf2 = string2.indexOf("%s");
                    if (indexOf2 < 0) {
                        str = "";
                        substring = str;
                    } else {
                        String substring4 = string2.substring(0, indexOf2);
                        substring = string2.substring(indexOf2 + 2);
                        str = substring4;
                    }
                    if (TextUtils.isEmpty(str)) {
                        N2 = y41.J(N2);
                    }
                    arrayList.add(e51.a(5, str, si.o0.u(N2, ""), substring, new b(e0Var, i13), e0Var.t0, new b(e0Var, i15), null));
                    if (e0Var.i0()) {
                        boolean z12 = e0Var.Z;
                        if (z12 || (richMessage3 = e0Var.b0) == null) {
                            richMessage3 = e0Var.Y;
                        }
                        a11 = e0Var.j0(6, richMessage3, z12);
                    } else {
                        boolean z13 = e0Var.Z;
                        a11 = i51.a(z13 ? 7 : 6, e0Var.a0, false, null, null, !z13 ? new b(e0Var, i16) : null);
                    }
                    arrayList.add(a11);
                } else if (selectedTab == 1) {
                    arrayList.add(m61.k(d0Var));
                    if (d0Var.getSelectedTone() instanceof z) {
                        arrayList.add(m61.j(10, e0Var.z0));
                        b71Var2.T();
                        arrayList.add(m61.A(11, null));
                        b71Var2.U();
                    }
                    if ((d0Var.getSelectedTab() >= 0 || e0Var.t0) && (!(d0Var.getSelectedTone() instanceof z) || TextUtils.equals(e0Var.A0.getText().toString(), e0Var.I0))) {
                        arrayList.add(e51.a(7, LocaleController.getString(R.string.AIEditorResult), null, null, null, e0Var.t0, new b(e0Var, i15), null));
                        if (e0Var.i0()) {
                            boolean z14 = e0Var.c0;
                            if (z14 || (richMessage2 = e0Var.e0) == null) {
                                richMessage2 = e0Var.Y;
                            }
                            a10 = e0Var.j0(8, richMessage2, z14);
                        } else {
                            boolean z15 = e0Var.c0;
                            a10 = i51.a(z15 ? 7 : 6, e0Var.d0, false, null, null, !z15 ? new b(e0Var, i16) : null);
                        }
                        arrayList.add(a10);
                    } else {
                        arrayList.add(e51.a(5, LocaleController.getString(R.string.AIEditorOriginal), null, null, null, e0Var.t0, new b(e0Var, i15), null));
                        arrayList.add(e0Var.i0() ? e0Var.j0(6, e0Var.Y, false) : i51.a(e0Var.c0 ? 7 : 6, e0Var.X, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList.add(e51.b(3, LocaleController.getString(R.string.AIEditorOriginal), null, null, null));
                    arrayList.add(e0Var.i0() ? e0Var.j0(4, e0Var.Y, false) : i51.a(4, e0Var.X, e0Var.P0, new b(e0Var, 4), null, null));
                    arrayList.add(e51.b(5, LocaleController.getString(R.string.AIEditorResult), null, null, null));
                    if (e0Var.i0()) {
                        boolean z16 = e0Var.f0;
                        if (z16 || (richMessage = e0Var.h0) == null) {
                            richMessage = e0Var.Y;
                        }
                        a2 = e0Var.j0(6, richMessage, z16);
                    } else {
                        boolean z17 = e0Var.f0;
                        a2 = i51.a(z17 ? 7 : 6, e0Var.g0, false, null, null, !z17 ? new b(e0Var, i16) : null);
                    }
                    arrayList.add(a2);
                }
                b71Var2.T();
                arrayList.add(m61.B(null));
                break;
            case 1:
                q.R((q) obj3, (ArrayList) obj, (b71) obj2);
                break;
            case 2:
                y yVar = (y) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(m61.B(null));
                arrayList2.add(m61.l(yVar.X));
                arrayList2.add(m61.B(null));
                arrayList2.add(m61.k(yVar.a0));
                arrayList2.add(m61.B(null));
                arrayList2.add(m61.k(yVar.b0));
                arrayList2.add(m61.B(null));
                if (yVar.j0 != null) {
                    m61 e = m61.e(1, LocaleController.getString(R.string.AIEditorDeleteStyle));
                    e.r = true;
                    arrayList2.add(e);
                    arrayList2.add(m61.B(null));
                }
                arrayList2.add(m61.l(yVar.c0));
                break;
            case 3:
                ((g0) obj3).Q((ArrayList) obj, (b71) obj2);
                break;
            case 4:
                ((ChatActivityEnterView) obj3).c0((Canvas) obj, (Utilities.Callback0Return) obj2);
                break;
            case 5:
                fj fjVar = (fj) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                b71 b71Var3 = (b71) obj2;
                int i17 = fjVar.P;
                ArrayList arrayList4 = fjVar.M;
                MessagesController.SavedMusicList savedMusicList = fjVar.J;
                ArrayList arrayList5 = fjVar.K;
                HashSet hashSet = fjVar.I;
                ArrayList arrayList6 = fjVar.L;
                arrayList3.add(m61.D(-100, AndroidUtilities.dp(1.0f)));
                int size = arrayList3.size();
                if (TextUtils.isEmpty(fjVar.y)) {
                    b71Var3.U();
                    int i18 = 0;
                    while (i18 < fjVar.H.size()) {
                        MediaController.AudioEntry audioEntry2 = (MediaController.AudioEntry) fjVar.H.get(i18);
                        audioEntry2.messageObject.setQuery(str3);
                        m61 a12 = org.telegram.ui.Cells.i7.a(audioEntry2, new vi(fjVar, 0));
                        a12.K(hashSet.contains(audioEntry2));
                        a12.d = -1;
                        arrayList3.add(a12);
                        i18++;
                        str3 = null;
                    }
                    if (fjVar.G) {
                        arrayList3.add(m61.o(11, 4));
                        arrayList3.add(m61.o(12, 4));
                        arrayList3.add(m61.o(13, 4));
                    }
                    b71Var3.T();
                    if (savedMusicList != null) {
                        int size2 = savedMusicList.list.size();
                        if (size2 < arrayList5.size()) {
                            arrayList5.subList(size2, arrayList5.size()).clear();
                        }
                        int i19 = 0;
                        while (i19 < size2) {
                            if (i19 >= arrayList5.size()) {
                                audioEntry = new MediaController.AudioEntry();
                                arrayList5.add(audioEntry);
                            } else {
                                audioEntry = (MediaController.AudioEntry) arrayList5.get(i19);
                            }
                            if (audioEntry.messageObject != savedMusicList.list.get(i19)) {
                                MessageObject messageObject = savedMusicList.list.get(i19);
                                int i20 = fjVar.l0;
                                fjVar.l0 = i20 - 1;
                                b71Var = b71Var3;
                                i10 = i19;
                                audioEntry.id = i20;
                                audioEntry.messageObject = messageObject;
                            } else {
                                b71Var = b71Var3;
                                i10 = i19;
                            }
                            i19 = i10 + 1;
                            b71Var3 = b71Var;
                        }
                    }
                    b71 b71Var4 = b71Var3;
                    if (savedMusicList != null && arrayList5 != null && !arrayList5.isEmpty()) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(m61.A(-98, null));
                        }
                        b71Var4.U();
                        arrayList3.add(m61.s(45, LocaleController.getString(R.string.AudioSearchProfile)));
                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                            MediaController.AudioEntry audioEntry3 = (MediaController.AudioEntry) arrayList5.get(i21);
                            m61 a13 = org.telegram.ui.Cells.i7.a(audioEntry3, new vi(fjVar, 0));
                            a13.K(hashSet.contains(audioEntry3));
                            arrayList3.add(a13);
                        }
                        if (savedMusicList.loading) {
                            arrayList3.add(m61.o(41, 4));
                            arrayList3.add(m61.o(42, 4));
                            arrayList3.add(m61.o(43, 4));
                        }
                        if (!savedMusicList.loading && !savedMusicList.endReached) {
                            m61 c10 = m61.c(fjVar.R, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c10.q = true;
                            arrayList3.add(c10);
                        }
                        b71Var4.T();
                    }
                    if (arrayList6 != null && (!arrayList6.isEmpty() || fjVar.U >= 0 || fjVar.W)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(m61.A(-98, null));
                        }
                        b71Var4.U();
                        arrayList3.add(m61.s(((fjVar.U >= 0 || fjVar.W) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                            MediaController.AudioEntry audioEntry4 = (MediaController.AudioEntry) arrayList6.get(i22);
                            audioEntry4.messageObject.setQuery(fjVar.y);
                            m61 a14 = org.telegram.ui.Cells.i7.a(audioEntry4, new vi(fjVar, 0));
                            a14.K(hashSet.contains(audioEntry4));
                            arrayList3.add(a14);
                        }
                        if (fjVar.U >= 0 || fjVar.W) {
                            arrayList3.add(m61.o(21, 4));
                            arrayList3.add(m61.o(22, 4));
                            arrayList3.add(m61.o(23, 4));
                        }
                        if (fjVar.c0) {
                            m61 c11 = m61.c(i17, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c11.q = true;
                            arrayList3.add(c11);
                        }
                        b71Var4.T();
                    }
                } else {
                    String lowerCase = fjVar.y.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    boolean z18 = false;
                    for (int i23 = 0; i23 < fjVar.H.size(); i23++) {
                        MediaController.AudioEntry audioEntry5 = (MediaController.AudioEntry) fjVar.H.get(i23);
                        String str5 = audioEntry5.author;
                        if (str5 != null) {
                            String lowerCase2 = str5.toLowerCase();
                            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                            if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.v0.w(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe2)) {
                                z10 = true;
                                str2 = audioEntry5.title;
                                if (str2 == null) {
                                    String lowerCase3 = str2.toLowerCase();
                                    boolean z19 = z10;
                                    String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                                    z10 = z19 || lowerCase3.startsWith(lowerCase) || org.telegram.messenger.v0.w(" ", lowerCase, lowerCase3) || translitSafe3.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe3);
                                }
                                if (z10) {
                                    if (!z18) {
                                        if (arrayList3.size() > size) {
                                            arrayList3.add(m61.A(-97, null));
                                        }
                                        b71Var3.U();
                                        arrayList3.add(m61.s(10, LocaleController.getString(R.string.AudioSearchLocal)));
                                        z18 = true;
                                    }
                                    audioEntry5.messageObject.setQuery(fjVar.y);
                                    m61 a15 = org.telegram.ui.Cells.i7.a(audioEntry5, new vi(fjVar, 0));
                                    a15.K(hashSet.contains(audioEntry5));
                                    a15.d = 10;
                                    arrayList3.add(a15);
                                }
                            }
                        }
                        z10 = false;
                        str2 = audioEntry5.title;
                        if (str2 == null) {
                        }
                        if (z10) {
                        }
                    }
                    b71Var3.T();
                    if (arrayList6 != null && (!arrayList6.isEmpty() || fjVar.U >= 0 || fjVar.W)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(m61.A(-98, null));
                        }
                        b71Var3.U();
                        arrayList3.add(m61.s(((fjVar.U >= 0 || fjVar.W) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i24 = 0; i24 < arrayList6.size(); i24++) {
                            MediaController.AudioEntry audioEntry6 = (MediaController.AudioEntry) arrayList6.get(i24);
                            audioEntry6.messageObject.setQuery(fjVar.y);
                            m61 a16 = org.telegram.ui.Cells.i7.a(audioEntry6, new vi(fjVar, 0));
                            a16.K(hashSet.contains(audioEntry6));
                            arrayList3.add(a16);
                        }
                        if (fjVar.U >= 0 || fjVar.W) {
                            arrayList3.add(m61.o(21, 4));
                            arrayList3.add(m61.o(22, 4));
                            arrayList3.add(m61.o(23, 4));
                        }
                        if (fjVar.c0) {
                            m61 c12 = m61.c(i17, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c12.q = true;
                            arrayList3.add(c12);
                        }
                        b71Var3.T();
                    }
                    if (arrayList4 != null && (!arrayList4.isEmpty() || fjVar.d0 >= 0 || fjVar.m0)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(m61.A(-96, null));
                        }
                        b71Var3.U();
                        arrayList3.add(m61.s(((fjVar.d0 >= 0 || fjVar.m0) && arrayList4.isEmpty()) ? 35 : 30, LocaleController.getString(R.string.AudioSearchGlobal)));
                        int size3 = arrayList4.size();
                        for (int i25 = 0; i25 < size3; i25++) {
                            MediaController.AudioEntry audioEntry7 = (MediaController.AudioEntry) arrayList4.get(i25);
                            audioEntry7.messageObject.setQuery(fjVar.y);
                            m61 a17 = org.telegram.ui.Cells.i7.a(audioEntry7, new vi(fjVar, 0));
                            a17.K(hashSet.contains(audioEntry7));
                            arrayList3.add(a17);
                        }
                        if (fjVar.d0 >= 0 || fjVar.m0) {
                            arrayList3.add(m61.o(31, 4));
                            arrayList3.add(m61.o(32, 4));
                            arrayList3.add(m61.o(33, 4));
                        }
                        if (fjVar.g0) {
                            m61 c13 = m61.c(fjVar.Q, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c13.q = true;
                            arrayList3.add(c13);
                        }
                        b71Var3.T();
                    }
                }
                if (arrayList3.size() <= size && !fjVar.G) {
                    if (TextUtils.isEmpty(fjVar.y)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFiles);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i26 = dj.a;
                        m61 J = m61.J(dj.class);
                        J.l = string3;
                        J.m = string4;
                        arrayList3.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(fjVar.y.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, fjVar.y));
                        int i27 = dj.a;
                        m61 J2 = m61.J(dj.class);
                        J2.l = string5;
                        J2.m = replaceTags;
                        arrayList3.add(J2);
                    }
                }
                arrayList3.add(m61.A(-99, null));
                break;
            case 6:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                boolean z20 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.getClass();
                ((Runnable) obj2).run();
                chatAttachAlertPhotoLayout.setStarsPrice(((Long) obj).longValue());
                break;
            case 7:
                xr.R((xr) obj3, (ArrayList) obj);
                break;
            case 8:
                final at atVar = (at) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                int i28 = atVar.P;
                y2 y2Var = atVar.j0;
                ArrayList arrayList8 = atVar.V;
                zs zsVar = atVar.S;
                boolean z21 = atVar.R;
                HashSet hashSet2 = new HashSet();
                if (TextUtils.isEmpty(atVar.g0)) {
                    ArrayList<TLRPC.TL_topPeer> arrayList9 = MediaDataController.getInstance(i28).webapps;
                    ArrayList arrayList10 = new ArrayList();
                    if (arrayList9 != null) {
                        int i29 = 0;
                        while (i29 < arrayList9.size()) {
                            int i30 = i12;
                            TLRPC.User user = MessagesController.getInstance(i28).getUser(Long.valueOf(DialogObject.getPeerDialogId(arrayList9.get(i29).peer)));
                            if (user != null && user.bot) {
                                arrayList10.add(user);
                            }
                            i29++;
                            i12 = i30;
                        }
                    }
                    int i31 = i12;
                    atVar.Z = arrayList7.size();
                    if (!arrayList10.isEmpty() && !z21) {
                        if (arrayList10.size() > 5) {
                            final int i32 = 1;
                            arrayList7.add(m61.r(LocaleController.getString(R.string.SearchAppsMine), LocaleController.getString(atVar.W ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.xs
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i32) {
                                        case 0:
                                            at atVar2 = atVar;
                                            atVar2.X = !atVar2.X;
                                            atVar2.N(true);
                                            break;
                                        default:
                                            at atVar3 = atVar;
                                            atVar3.W = !atVar3.W;
                                            atVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList7.add(m61.q(LocaleController.getString(R.string.SearchAppsMine)));
                        }
                        for (int i33 = 0; i33 < arrayList10.size() && (i33 < 5 || atVar.W); i33++) {
                            TLRPC.User user2 = (TLRPC.User) arrayList10.get(i33);
                            if (!hashSet2.contains(Long.valueOf(user2.id))) {
                                hashSet2.add(Long.valueOf(user2.id));
                                m61 v = m61.v(user2);
                                v.q = true;
                                v.t = true;
                                v.H = y2Var;
                                arrayList7.add(v);
                            }
                        }
                    }
                    hashSet2.clear();
                    atVar.a0 = arrayList7.size();
                    ArrayList arrayList11 = zsVar.h;
                    if (arrayList11.isEmpty()) {
                        if (zsVar.c || !zsVar.e) {
                            if (!z21) {
                                arrayList7.add(m61.n(30));
                            }
                            arrayList7.add(m61.n(i31));
                            arrayList7.add(m61.n(i31));
                            arrayList7.add(m61.n(i31));
                            arrayList7.add(m61.n(i31));
                        }
                        z11 = false;
                    } else {
                        if (!z21) {
                            arrayList7.add(m61.q(LocaleController.getString(R.string.SearchAppsPopular)));
                        }
                        boolean z22 = false;
                        for (int i34 = 0; i34 < arrayList11.size(); i34++) {
                            TLRPC.User user3 = (TLRPC.User) arrayList11.get(i34);
                            if (!hashSet2.contains(Long.valueOf(user3.id))) {
                                hashSet2.add(Long.valueOf(user3.id));
                                m61 v10 = m61.v(user3);
                                v10.q = true;
                                v10.r = true;
                                v10.t = true;
                                v10.H = y2Var;
                                arrayList7.add(v10);
                                z22 = true;
                            }
                        }
                        if (zsVar.c || !zsVar.e) {
                            arrayList7.add(m61.n(i31));
                            arrayList7.add(m61.n(i31));
                            arrayList7.add(m61.n(i31));
                        }
                        z11 = z22;
                    }
                    if (z11) {
                        arrayList7.add(m61.B(atVar.Y));
                        break;
                    }
                } else {
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.addAll(atVar.T);
                    arrayList12.addAll(atVar.U);
                    if (!arrayList12.isEmpty()) {
                        if (arrayList12.size() <= 5 || arrayList8.isEmpty() || z21) {
                            arrayList7.add(m61.q(LocaleController.getString(R.string.SearchApps)));
                        } else {
                            final int i35 = 0;
                            arrayList7.add(m61.r(LocaleController.getString(R.string.SearchApps), LocaleController.getString(atVar.X ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.xs
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i35) {
                                        case 0:
                                            at atVar2 = atVar;
                                            atVar2.X = !atVar2.X;
                                            atVar2.N(true);
                                            break;
                                        default:
                                            at atVar3 = atVar;
                                            atVar3.W = !atVar3.W;
                                            atVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        }
                        int size4 = arrayList12.size();
                        if (!atVar.X && !arrayList8.isEmpty() && !z21) {
                            size4 = Math.min(5, size4);
                        }
                        for (int i36 = 0; i36 < size4; i36++) {
                            m61 v11 = m61.v((TLObject) arrayList12.get(i36));
                            v11.t = true;
                            v11.H = y2Var;
                            arrayList7.add(v11);
                        }
                    }
                    if (!arrayList8.isEmpty() && !z21) {
                        arrayList7.add(m61.q(LocaleController.getString(R.string.SearchMessages)));
                        int size5 = arrayList8.size();
                        int i37 = 0;
                        while (i37 < size5) {
                            Object obj4 = arrayList8.get(i37);
                            i37++;
                            m61 m61Var = new m61(33);
                            m61Var.G = (MessageObject) obj4;
                            arrayList7.add(m61Var);
                        }
                        if (atVar.d0) {
                            arrayList7.add(m61.n(1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                final uo0 uo0Var = (uo0) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                ArrayList arrayList14 = uo0Var.R;
                ArrayList arrayList15 = uo0Var.X;
                int i38 = uo0Var.P;
                if (TextUtils.isEmpty(uo0Var.d0)) {
                    if (arrayList15 != null && !arrayList15.isEmpty()) {
                        if (arrayList15.size() > 5) {
                            arrayList13.add(m61.r(LocaleController.getString(R.string.SearchMyChannels), LocaleController.getString(uo0Var.W ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.bt
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i14) {
                                        case 0:
                                            uo0 uo0Var2 = uo0Var;
                                            uo0Var2.W = !uo0Var2.W;
                                            uo0Var2.N(true);
                                            if (uo0Var2.W) {
                                                AndroidUtilities.hideKeyboard(uo0Var2.f0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            uo0 uo0Var3 = uo0Var;
                                            uo0Var3.V = !uo0Var3.V;
                                            uo0Var3.N(true);
                                            if (uo0Var3.V) {
                                                AndroidUtilities.hideKeyboard(uo0Var3.f0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList13.add(m61.q(LocaleController.getString(R.string.SearchMyChannels)));
                        }
                        int size6 = arrayList15.size();
                        if (!uo0Var.W) {
                            size6 = Math.min(5, size6);
                        }
                        for (int i39 = 0; i39 < size6; i39++) {
                            m61 v12 = m61.v((TLObject) arrayList15.get(i39));
                            v12.I = true;
                            arrayList13.add(v12);
                        }
                    }
                    MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(i38).getCachedChannelRecommendations(0L);
                    if (cachedChannelRecommendations != null) {
                        ArrayList arrayList16 = new ArrayList();
                        ArrayList<TLObject> arrayList17 = cachedChannelRecommendations.chats;
                        int size7 = arrayList17.size();
                        int i40 = 0;
                        while (i40 < size7) {
                            TLObject tLObject = arrayList17.get(i40);
                            i40++;
                            TLObject tLObject2 = tLObject;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                                TLRPC.Chat chat2 = MessagesController.getInstance(i38).getChat(Long.valueOf(chat.id));
                                if (ChatObject.isNotInChat(chat) && (chat2 == null || ChatObject.isNotInChat(chat2))) {
                                    arrayList16.add(chat);
                                }
                            }
                        }
                        if (!arrayList16.isEmpty()) {
                            arrayList13.add(m61.q(LocaleController.getString(R.string.SearchRecommendedChannels)));
                        }
                        int size8 = arrayList16.size();
                        while (i14 < size8) {
                            Object obj5 = arrayList16.get(i14);
                            i14++;
                            arrayList13.add(m61.v((TLRPC.Chat) obj5));
                        }
                        break;
                    } else {
                        arrayList13.add(m61.n(30));
                        arrayList13.add(m61.n(29));
                        arrayList13.add(m61.n(29));
                        arrayList13.add(m61.n(29));
                        arrayList13.add(m61.n(29));
                        break;
                    }
                } else {
                    ArrayList arrayList18 = new ArrayList();
                    ArrayList arrayList19 = uo0Var.S;
                    int size9 = arrayList19.size();
                    int i41 = 0;
                    while (i41 < size9) {
                        Object obj6 = arrayList19.get(i41);
                        i41++;
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
                        TLRPC.Chat chat4 = MessagesController.getInstance(i38).getChat(Long.valueOf(chat3.id));
                        if (ChatObject.isNotInChat(chat3) && (chat4 == null || ChatObject.isNotInChat(chat4))) {
                            arrayList18.add(chat3);
                        }
                    }
                    ArrayList arrayList20 = uo0Var.T;
                    int size10 = arrayList20.size();
                    int i42 = 0;
                    while (i42 < size10) {
                        Object obj7 = arrayList20.get(i42);
                        i42++;
                        TLRPC.Chat chat5 = (TLRPC.Chat) obj7;
                        TLRPC.Chat chat6 = MessagesController.getInstance(i38).getChat(Long.valueOf(chat5.id));
                        if (ChatObject.isNotInChat(chat5) && (chat6 == null || ChatObject.isNotInChat(chat6))) {
                            arrayList18.add(chat5);
                        }
                    }
                    ArrayList arrayList21 = uo0Var.U;
                    int size11 = arrayList21.size();
                    int i43 = 0;
                    while (i43 < size11) {
                        Object obj8 = arrayList21.get(i43);
                        i43++;
                        TLRPC.Chat chat7 = (TLRPC.Chat) obj8;
                        TLRPC.Chat chat8 = MessagesController.getInstance(i38).getChat(Long.valueOf(chat7.id));
                        if (ChatObject.isNotInChat(chat7) && (chat8 == null || ChatObject.isNotInChat(chat8))) {
                            arrayList18.add(chat7);
                        }
                    }
                    if (!arrayList18.isEmpty()) {
                        if (arrayList18.size() <= 5 || arrayList14.isEmpty()) {
                            arrayList13.add(m61.q(LocaleController.getString(R.string.SearchChannels)));
                        } else {
                            final int i44 = 1;
                            arrayList13.add(m61.r(LocaleController.getString(R.string.SearchChannels), LocaleController.getString(uo0Var.V ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.bt
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i44) {
                                        case 0:
                                            uo0 uo0Var2 = uo0Var;
                                            uo0Var2.W = !uo0Var2.W;
                                            uo0Var2.N(true);
                                            if (uo0Var2.W) {
                                                AndroidUtilities.hideKeyboard(uo0Var2.f0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            uo0 uo0Var3 = uo0Var;
                                            uo0Var3.V = !uo0Var3.V;
                                            uo0Var3.N(true);
                                            if (uo0Var3.V) {
                                                AndroidUtilities.hideKeyboard(uo0Var3.f0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        }
                        int size12 = arrayList18.size();
                        if (!uo0Var.V && !arrayList14.isEmpty()) {
                            size12 = Math.min(5, size12);
                        }
                        for (int i45 = 0; i45 < size12; i45++) {
                            arrayList13.add(m61.v((TLObject) arrayList18.get(i45)));
                        }
                    }
                    if (!arrayList14.isEmpty()) {
                        arrayList13.add(m61.q(LocaleController.getString(R.string.SearchMessages)));
                        int size13 = arrayList14.size();
                        int i46 = 0;
                        while (i46 < size13) {
                            Object obj9 = arrayList14.get(i46);
                            i46++;
                            m61 m61Var2 = new m61(33);
                            m61Var2.G = (MessageObject) obj9;
                            arrayList13.add(m61Var2);
                        }
                        if (uo0Var.a0) {
                            arrayList13.add(m61.n(1));
                            break;
                        }
                    }
                }
                break;
            case 10:
                a(obj, obj2);
                break;
            case 11:
                b(obj, obj2);
                break;
            case 12:
                c(obj, obj2);
                break;
            case 13:
                d(obj, obj2);
                break;
            case 14:
                ((ArrayList) obj).add(m61.j(-1, ((f40) obj3).X));
                break;
            case 15:
                e(obj, obj2);
                break;
            case 16:
                f(obj, obj2);
                break;
            case 17:
                g(obj, obj2);
                break;
            case 18:
                h(obj, obj2);
                break;
            case 19:
                i(obj, obj2);
                break;
            case 20:
                j(obj, obj2);
                break;
            case 21:
                y41.q((y41) obj3, (String) obj, (Boolean) obj2);
                break;
            default:
                ((e71) obj3).U((ArrayList) obj, (b71) obj2);
                break;
        }
    }
}
